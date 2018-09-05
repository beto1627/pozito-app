package pe.com.pzt.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.pzt.business.EnrolmentService;
import pe.com.pzt.dao.EnrolmentDAO;
import pe.com.pzt.domain.Enrolment;

@Service
public class EnrolmentServiceImpl implements EnrolmentService {

	@Autowired
	private EnrolmentDAO enrolmentDAO;

	@Override
	public Enrolment obtenerEnrolment(String idFacebook) {
		return enrolmentDAO.obtenerEnrolment(idFacebook);
	}

	@Override
	@Transactional
	public void registrarEnrolment(Enrolment enrolment) {
		enrolmentDAO.registrarEnrolment(enrolment);
	}

}
