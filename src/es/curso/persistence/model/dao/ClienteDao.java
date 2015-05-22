package es.curso.persistence.model.dao;

import es.curso.model.entity.Cliente;

public interface ClienteDao {

	// por cada entity q creamos (clases que tendran reflejo en bbdd) hacemos un DAO?
	
	public void create(Cliente cliente);
	
	
}
