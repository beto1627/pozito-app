package pe.com.pzt.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import pe.com.pzt.dao.AccountDAO;
import pe.com.pzt.domain.Account;

@Repository
public class AccountDAOImpl implements AccountDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Account obtenerAccount(String idFacebook) {
		try {
			return entityManager.find(Account.class, idFacebook);
		} catch (NoResultException e) {
			return null;
		} catch (RuntimeException e) {
			throw e;
		}
	}

	@Override
	public void registrarAccount(Account Account) {
		try {
			entityManager.persist(Account);
		} catch (RuntimeException e) {
			throw e;
		}
	}
}
