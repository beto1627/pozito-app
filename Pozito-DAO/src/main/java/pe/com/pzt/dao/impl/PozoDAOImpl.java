package pe.com.pzt.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import pe.com.pzt.dao.PozoDAO;
import pe.com.pzt.domain.Pozo;

@Repository
public class PozoDAOImpl implements PozoDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Pozo> getPozosByIdFacebook(String idFacebook) {
		try {
			Query query = entityManager.createQuery("SELECT p FROM Pozo p WHERE idFacebook = :idFacebook ");
			query.setParameter("idFacebook", idFacebook);
			return (List<Pozo>) query.getResultList();
		} catch (NoResultException e) {
			return new ArrayList<>();
		} catch (RuntimeException e) {
			throw e;
		}
	}

	@Override
	public void registrarPozo(Pozo pozo) {
		try {
			entityManager.persist(pozo);
		} catch (RuntimeException e) {
			throw e;
		}
	}
}
