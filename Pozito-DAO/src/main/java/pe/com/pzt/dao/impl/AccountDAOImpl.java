package pe.com.pzt.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;
import org.springframework.stereotype.Repository;

import pe.com.pzt.dao.AccountDAO;
import pe.com.pzt.domain.BankAccount;

@Repository
public class AccountDAOImpl implements AccountDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<BankAccount> getAllAccountsByIdFacebook(String idFacebook) {
		try {
			Query query = entityManager.createQuery("SELECT e FROM Account e where idFacebook = :idFacebook");
			query.setParameter("idFacebook",idFacebook);
		    return (List<BankAccount>) query.getResultList();
		} catch (NoResultException e) {
			return new ArrayList<>();
		} catch (RuntimeException e) {
			throw e;
		}
	}
	
	
	@Override
	public BankAccount getAccount(String idAccount) {
		try {
			return entityManager.find(BankAccount.class, idAccount);
		} catch (NoResultException e) {
			return new BankAccount();
		} catch (RuntimeException e) {
			throw e;
		}
	}

	@Override
	public void createAccount(BankAccount Account) {
		try {
			entityManager.persist(Account);
		} catch (RuntimeException e) {
			throw e;
		}
	}
}
