package pe.com.pzt.business;

import java.util.List;

import pe.com.pzt.domain.Pozo;

public interface PozoService {

	public List<Pozo> getPozosByIdFacebook(String codigoPozo);

	void registrarPozo(Pozo pozo);

}
