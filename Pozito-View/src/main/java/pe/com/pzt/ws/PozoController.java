package pe.com.pzt.ws;

import java.util.List;

import javax.ws.rs.QueryParam;

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

	@GetMapping("/pozo/{idPozo}")
	public ResponseRS getPozosByPropietario(@PathVariable(value = "idPozo") String idPozo) {

		Pozo pozo = pozoService.getPozosByIdPozo(idPozo);

		ResponseRS responseRS = new ResponseRS();
		responseRS.setCode(pozo != null ? "S" : "N");
		responseRS.setResult(pozo);
		return responseRS;
	}

	@GetMapping("/pozo")
	public ResponseRS getPozosByPropietario(@QueryParam(value = "tipo") String tipo,
			@QueryParam(value = "idFacebook") String idFacebook) {

		List<Pozo> listPozo = pozoService.getPozosByIdFacebook(idFacebook, tipo);

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
