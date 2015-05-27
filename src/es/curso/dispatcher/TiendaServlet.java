package es.curso.dispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.curso.controllers.ejb.DarAltaClienteControllerEjb;
import es.curso.model.entity.Cliente;

/**
 * Servlet implementation class TiendaServlet Con la sgte anotacion pusimos
 * ademas de Tienda una BARRA ASTERISCO para recep todo lo q venga a Tienda al
 * crear el servlet le damos en config este nombre corto que veran los usuarios
 * internamente será para nosotros desarrolladores TiendaServlet
 */
@WebServlet("/Tienda/*")
public class TiendaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public TiendaServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String action = request.getPathInfo().substring(1);
		// para ver que tipo de codif estamos usando
		request.setCharacterEncoding("UTF-8");
		switch (action) {
		case "listarTodos": // se invocará al controlador adecuado
			// que obtendrá todos los clientes
			break; // esta petición reditige a otra página
		case "buscarPorNombre": // se invocará al controlador que haga la
								// consulta por nombre,
			// que obtendra solo los clientes que coincidan con el nombre
			// buscado
			break; // esta petición reditige a otra página
		}
		// tengo que redirigir hacia una vista jsp para mostrar los clientes
		// para esto creo una referencia de
		RequestDispatcher rd;
		// antes de mandar esto aqui hay que enviarle a la vista el resultado de
		// la consulta a la bbdd // ver ruta
		rd = request.getRequestDispatcher("/jsp/listarTodos.jsp");// cual es la vista
																// q quiero
																// mostrar
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String action = request.getPathInfo().substring(1);
		// para ver que tipo de codif estamos usando
		request.setCharacterEncoding("UTF-8");
		switch (action) {
		case "altaCliente": // se invocará al controlador
			// recuperar los datos recibidos de formulario
			String nombre = request.getParameter("nombre");
			String apellido = request.getParameter("apellido");
			String dni = request.getParameter("dni");
			// el id lo genera automaticamente
			Cliente cliente = new Cliente(0, nombre, apellido, dni);
			// como le paso la pelota al controlador
			DarAltaClienteControllerEjb controlador = new DarAltaClienteControllerEjb();
			controlador.agregar(cliente);
			break;

		}
	}

}
