package pe.com.pzt.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import pe.com.pzt.dao.EnrolmentDAO;
import pe.com.pzt.domain.Enrolment;

@Repository
public class EnrolmentDAOImpl implements EnrolmentDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Enrolment obtenerEnrolment(String idFacebook) {
		try {
			return entityManager.find(Enrolment.class, idFacebook);
		} catch (NoResultException e) {
			return null;
		} catch (RuntimeException e) {
			throw e;
		}
	}
}
