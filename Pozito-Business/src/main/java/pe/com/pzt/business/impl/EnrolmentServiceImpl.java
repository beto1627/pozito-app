package pe.com.pzt.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.pzt.business.EnrolmentService;
import pe.com.pzt.business.UsuarioService;
import pe.com.pzt.dao.UsuarioDAO;
import pe.com.pzt.domain.Usuario;

@Service
public class EnrolmentServiceImpl implements EnrolmentService {

	@Autowired
	private UsuarioDAO usuarioDAO;

	@Override
	public Usuario obtenerEnrolment(String idFacebook) {
		return usuarioDAO.obtenerUsuario(codigoUsuario);
	}

}
