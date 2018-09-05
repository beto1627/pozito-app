package pe.com.pzt.view;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import pe.com.pzt.business.UsuarioService;
import pe.com.pzt.domain.Usuario;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {

	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nombre = "Todos";
		Usuario usuario = usuarioService.obtenerUsuario("pozito");
		if (usuario != null) {
			nombre = usuario.getCodigoUsuario();
			System.out.println("usuario  existe");
		}
		request.setAttribute("nombre", nombre);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
}
