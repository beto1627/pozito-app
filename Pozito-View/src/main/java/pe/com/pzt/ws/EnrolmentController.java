package pe.com.pzt.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.com.pzt.business.EnrolmentService;
import pe.com.pzt.commons.ResponseRS;
import pe.com.pzt.domain.Enrolment;

@RestController
public class EnrolmentController {

	@Autowired
	private EnrolmentService enrolmentService;

	@GetMapping("/enrolment/{idFacebook}")
	public ResponseRS getEnrolment(@PathVariable(value = "idFacebook") String idFacebook) {
		Enrolment enrolment = enrolmentService.obtenerEnrolment(idFacebook);

		ResponseRS responseRS = new ResponseRS();
		responseRS.setCode(enrolment != null ? "S" : "N");
		return responseRS;
	}

	@PostMapping("/enrolment")
	public ResponseRS postEnrolment(@RequestBody Enrolment enrolment) {
		try {
			enrolmentService.registrarEnrolment(enrolment);
		} catch (Exception e) {
		}
		ResponseRS responseRS = new ResponseRS();
		responseRS.setCode(enrolment != null ? "S" : "N");
		return responseRS;
	}

}
