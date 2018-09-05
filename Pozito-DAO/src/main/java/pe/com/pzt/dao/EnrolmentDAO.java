package pe.com.pzt.dao;

import pe.com.pzt.domain.Enrolment;

public interface EnrolmentDAO {

	Enrolment obtenerEnrolment(String idFacebook);

	void registrarEnrolment(Enrolment enrolment);

}
