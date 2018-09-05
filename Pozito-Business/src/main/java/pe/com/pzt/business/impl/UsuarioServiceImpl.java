package pe.com.pzt.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.pzt.business.UsuarioService;
import pe.com.pzt.dao.UsuarioDAO;
import pe.com.pzt.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioDAO usuarioDAO;

	@Override
	public Usuario obtenerUsuario(String codigoUsuario) {
		return usuarioDAO.obtenerUsuario(codigoUsuario);
	}

}
