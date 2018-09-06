package pe.com.pzt.business;

import java.util.List;

import pe.com.pzt.domain.Pozo;

public interface PozoService {

	Pozo getPozosByIdPozo(String idPozo);

	public List<Pozo> getPozosByIdFacebook(String idFacebook, String tipo);

	void registrarPozo(Pozo pozo);

}
