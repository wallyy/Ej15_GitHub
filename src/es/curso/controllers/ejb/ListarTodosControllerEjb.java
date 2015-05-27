package es.curso.controllers.ejb;

import java.util.ArrayList;

import es.curso.controllers.ListarTodosController;
import es.curso.model.entity.Cliente;
import es.curso.persistence.model.dao.ClienteDao;
import es.curso.persistence.model.dao.jdbc.ClienteDaoJdbc;

public class ListarTodosControllerEjb implements ListarTodosController{
	// me creo objeto de Clase cliente dao  lo hacemos a si para tener acceso
	// para no tanto new Singleton pero luego
	@Override
	public ArrayList<Cliente> listarTodos() {
		ClienteDaoJdbc daoCliente = new ClienteDaoJdbc();
		// daoCliente.findAll();//y luego array pero en la forma larga...
		ArrayList<Cliente> clientes = daoCliente.findAll();
		//findAll retorna array list al controler pero este a su vez al servlet
		// más instrucciones
		return clientes;
	}
	

}
