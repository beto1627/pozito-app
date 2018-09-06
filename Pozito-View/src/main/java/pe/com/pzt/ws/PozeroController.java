package pe.com.pzt.ws;

import java.util.List;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.com.pzt.business.PozeroService;
import pe.com.pzt.commons.ResponseRS;
import pe.com.pzt.domain.Pozero;

@RestController
public class PozeroController {

	@Autowired
	private PozeroService pozeroService;

	@GetMapping("/pozero")
	public ResponseRS getPozerosByPozo(@QueryParam(value = "idPozo") String idPozo) {

		List<Pozero> listPozero = pozeroService.getPozerosByIdPozo(idPozo);

		ResponseRS responseRS = new ResponseRS();
		responseRS.setCode(!listPozero.isEmpty() ? "S" : "N");
		responseRS.setResult(listPozero);
		return responseRS;
	}

	@PostMapping("/pozero")
	public ResponseRS postPozero(@RequestBody Pozero pozero) {
		try {
			pozeroService.registrarPozero(pozero);
		} catch (Exception e) {
		}
		ResponseRS responseRS = new ResponseRS();
		responseRS.setCode(pozero != null ? "S" : "N");
		return responseRS;
	}

}
