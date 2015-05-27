package es.curso.persistence.model.dao.jdbc;

import java.util.ArrayList;

import es.curso.model.entity.Cliente;
import es.curso.persistence.model.dao.ClienteDao;

public class ClienteDaoJdbc implements ClienteDao{
	ArrayList<Cliente> clientes;//lo creo mejor como atributo
// enlazo lenguaje java con sql
	@Override
	public void create(Cliente cliente) {
		
		// van las instrucciones para:
//		1. conectar con la bbdd
//		2. preparar las sentencia -sql- para agregar
//		3. ejecutar la sentencia -sql- 
//		4. ...puede haber mas
//		5. cerrar conexión
		
		
	}
	
	public ClienteDaoJdbc() {
		super();
		//para que se conserve en la mem los clientes mas los q vengan llegando
		clientes = new ArrayList<Cliente>();
	}

// como no tenemos de momento bbdd de momento regresara arraylist porq este
	// se comunica con bbdd
@Override
public ArrayList<Cliente> findAll() {
	
//	ArrayList<Cliente> clientes = new ArrayList<Cliente>();//mejor como var local
//	clientes = new ArrayList<Cliente>();//o mejor a constructor q lo creo vacio
	clientes.add(new Cliente(1, "José", "Pérez", "1234D"));
	clientes.add(new Cliente(2, "Pepe", "Pérez", "1234S"));
	clientes.add(new Cliente(3, "Juan", "Diaz", "9994D"));
	clientes.add(new Cliente(4, "Pepe", "Diaz", "8834S"));
	clientes.add(new Cliente(5, "Ana", "Rios", "1234D"));
	clientes.add(new Cliente(6, "Gema", "Lago", "1767S"));
	clientes.add(new Cliente(7, "Ruth", "Mar", "1266D"));
	clientes.add(new Cliente(9, "Franc", "Lago", "1904D"));
	clientes.add(new Cliente(10, "Lola", "Mar", "3214D"));

	return clientes;
}

}
