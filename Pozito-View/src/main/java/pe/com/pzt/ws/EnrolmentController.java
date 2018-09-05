package pe.com.pzt.ws;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pe.com.pzt.business.EnrolmentService;
import pe.com.pzt.business.UsuarioService;
import pe.com.pzt.commons.ResponseRS;
import pe.com.pzt.domain.Enrolment;

@RestController
public class EnrolmentController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	private EnrolmentService enrolmentService;

	@GetMapping("/enrolment/{idFacebook}")
	public ResponseRS greeting(@RequestParam(value = "idFacebook") String idFacebook) {
		Enrolment enrolment = enrolmentService.obtenerEnrolment(idFacebook);

		ResponseRS responseRS = new ResponseRS();
		responseRS.setCode(enrolment != null ? "S" : "N");
		return responseRS;
	}

	@PostMapping("/enrolment")
	public Enrolment postGreeting(@RequestParam(value = "celular") String celular,
			@RequestParam(value = "email") String email, @RequestParam(value = "dni") String dni,
			@RequestParam(value = "idFacebook") String idFacebook) {
		Usuario usuario = usuarioService.obtenerUsuario(greeting.getContent());
		String nombre = usuario != null ? usuario.getNombreUsuario() : greeting.getContent();
		return new Enrolment(counter.incrementAndGet(), String.format(template, nombre));
	}

}
