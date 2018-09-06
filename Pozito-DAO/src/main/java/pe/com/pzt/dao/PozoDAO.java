package pe.com.pzt.dao;

import java.util.List;

import pe.com.pzt.domain.Pozo;

public interface PozoDAO {

	List<Pozo> getPozosByIdFacebook(String codigoPozo);

	void registrarPozo(Pozo pozo);

}
