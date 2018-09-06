package pe.com.pzt.dao;

import java.util.List;

import pe.com.pzt.domain.Pozo;

public interface PozoDAO {

	Pozo getPozosByIdPozo(String idPozo);

	List<Pozo> getPozosByIdFacebook(String codigoPozo);

	List<Pozo> getPozosByIdFacebookPozero(String idFacebook);

	void registrarPozo(Pozo pozo);

}
