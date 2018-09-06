package pe.com.pzt.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import pe.com.pzt.dao.PozeroDAO;
import pe.com.pzt.domain.Pozero;

@Repository
public class PozeroDAOImpl implements PozeroDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Pozero> getPozerosByIdPozo(String idFacebook) {
		try {
			Query query = entityManager.createQuery("SELECT p FROM Pozero p WHERE p.idPozo = :idPozo");
			query.setParameter("idPozo", idFacebook);
			return (List<Pozero>) query.getResultList();
		} catch (NoResultException e) {
			return new ArrayList<>();
		} catch (RuntimeException e) {
			throw e;
		}
	}

	@Override
	public void registrarPozero(Pozero pozero) {
		try {
			entityManager.persist(pozero);
		} catch (RuntimeException e) {
			throw e;
		}
	}
}
