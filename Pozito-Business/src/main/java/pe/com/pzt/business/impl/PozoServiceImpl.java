package pe.com.pzt.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.pzt.business.PozoService;
import pe.com.pzt.dao.PozoDAO;
import pe.com.pzt.domain.Pozo;

@Service
public class PozoServiceImpl implements PozoService {

	@Autowired
	private PozoDAO pozoDAO;

	@Override
	public List<Pozo> getPozosByIdFacebook(String idFacebook) {
		return pozoDAO.getPozosByIdFacebook(idFacebook);
	}

	@Override
	@Transactional
	public void registrarPozo(Pozo pozo) {
		pozoDAO.registrarPozo(pozo);
	}

}
