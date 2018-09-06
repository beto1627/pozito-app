package pe.com.pzt.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.pzt.business.PozoService;
import pe.com.pzt.commons.EstadoEnum;
import pe.com.pzt.dao.PozoDAO;
import pe.com.pzt.domain.Pozo;

@Service
public class PozoServiceImpl implements PozoService {

	@Autowired
	private PozoDAO pozoDAO;

	@Override
	public Pozo getPozosByIdPozo(String idPozo) {
		return pozoDAO.getPozosByIdPozo(idPozo);
	}

	@Override
	public List<Pozo> getPozosByIdFacebook(String idFacebook, String tipo) {
		List<Pozo> listPozos;
		if ("A".equals(tipo)) {
			listPozos = pozoDAO.getPozosByIdFacebook(idFacebook);
		} else {
			listPozos = pozoDAO.getPozosByIdFacebookPozero(idFacebook);
		}

		for (Pozo pozo : listPozos) {
			pozo.setEstadoDescripcion(EstadoEnum.getDescripcion(pozo.getEstado()).getDescripcion());
		}

		return listPozos;
	}

	@Override
	@Transactional
	public void registrarPozo(Pozo pozo) {
		pozoDAO.registrarPozo(pozo);
	}

}
