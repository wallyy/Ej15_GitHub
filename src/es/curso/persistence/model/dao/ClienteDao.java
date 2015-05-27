package es.curso.persistence.model.dao;

import java.util.ArrayList;

import es.curso.model.entity.Cliente;

public interface ClienteDao {

	// por cada entity q creamos (clases que tendran reflejo en bbdd) hacemos un DAO?
	
	public void create(Cliente cliente);
	
	// como no tenemos de momento bbdd de momento regresara arraylist porq este
	// se comunica con bbdd
	
	public ArrayList<Cliente> findAll();

}
