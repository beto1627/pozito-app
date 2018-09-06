package pe.com.pzt.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;
import org.springframework.stereotype.Repository;

import pe.com.pzt.dao.AccountDAO;
import pe.com.pzt.domain.Account;

@Repository
public class AccountDAOImpl implements AccountDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Account> getAllAccountsByIdFacebook(String idFacebook) {
		try {
			Query query = entityManager.createQuery("SELECT e FROM Accounts where idFacebook = :idFacebook");
			query.setParameter("idFacebook",idFacebook);
		    return (List<Account>) query.getResultList();
		} catch (NoResultException e) {
			return new ArrayList<Account>();
		} catch (RuntimeException e) {
			throw e;
		}
	}
	
	
	@Override
	public Account getAccount(String idAccount) {
		try {
			return entityManager.find(Account.class, idAccount);
		} catch (NoResultException e) {
			return null;
		} catch (RuntimeException e) {
			throw e;
		}
	}

	@Override
	public void createAccount(Account Account) {
		try {
			entityManager.persist(Account);
		} catch (RuntimeException e) {
			throw e;
		}
	}
}
