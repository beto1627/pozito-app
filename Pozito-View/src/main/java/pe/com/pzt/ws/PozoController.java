package pe.com.pzt.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.com.pzt.business.PozoService;
import pe.com.pzt.commons.ResponseRS;
import pe.com.pzt.domain.Pozo;

@RestController
public class PozoController {

	@Autowired
	private PozoService pozoService;

	@GetMapping("/pozo/{idFacebook}")
	public ResponseRS getPozo(@PathVariable(value = "idFacebook") String idFacebook) {
		List<Pozo> listPozo = pozoService.getPozosByIdFacebook(idFacebook);

		ResponseRS responseRS = new ResponseRS();
		responseRS.setCode(!listPozo.isEmpty() ? "S" : "N");
		responseRS.setResult(listPozo);
		return responseRS;
	}

	@PostMapping("/pozo")
	public ResponseRS postPozo(@RequestBody Pozo pozo) {
		try {
			pozoService.registrarPozo(pozo);
		} catch (Exception e) {
		}
		ResponseRS responseRS = new ResponseRS();
		responseRS.setCode(pozo != null ? "S" : "N");
		return responseRS;
	}

}
