package pe.com.pzt.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.pzt.business.PozeroService;
import pe.com.pzt.dao.EnrolmentDAO;
import pe.com.pzt.dao.PozeroDAO;
import pe.com.pzt.domain.Enrolment;
import pe.com.pzt.domain.Pozero;

@Service
public class PozeroServiceImpl implements PozeroService {

	@Autowired
	private PozeroDAO pozeroDAO;

	@Autowired
	private EnrolmentDAO enrolmentDAO;

	@Override
	public List<Pozero> getPozerosByIdPozo(String idPozo) {
		Enrolment enrolment;
		List<Pozero> listPozero = pozeroDAO.getPozerosByIdPozo(idPozo);
		for (Pozero pozero : listPozero) {
			enrolment = enrolmentDAO.obtenerEnrolment(pozero.getIdFacebook());
			pozero.setFullName(enrolment.getFullName());
			pozero.setReputation(enrolment.getReputation());
		}
		return listPozero;
	}

	@Override
	@Transactional
	public void registrarPozero(Pozero pozo) {
		pozeroDAO.registrarPozero(pozo);
	}

}
