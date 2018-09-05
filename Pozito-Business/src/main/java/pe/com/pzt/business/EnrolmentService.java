package pe.com.pzt.business;

import pe.com.pzt.domain.Enrolment;

public interface EnrolmentService {

	Enrolment obtenerEnrolment(String idFacebook);

	void registrarEnrolment(Enrolment enrolment);

}
