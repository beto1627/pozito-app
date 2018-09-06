package pe.com.pzt.dao;

import java.util.List;

import pe.com.pzt.domain.Pozero;

public interface PozeroDAO {

	List<Pozero> getPozerosByIdPozo(String codigoPozero);

	void registrarPozero(Pozero pozo);

}
