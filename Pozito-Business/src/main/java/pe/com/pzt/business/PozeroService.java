package pe.com.pzt.business;

import java.util.List;

import pe.com.pzt.domain.Pozero;

public interface PozeroService {

	public List<Pozero> getPozerosByIdPozo(String idPozo);

	void registrarPozero(Pozero pozo);

}
