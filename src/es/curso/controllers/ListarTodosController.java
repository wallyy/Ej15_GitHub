package es.curso.controllers;

import java.util.ArrayList;

import es.curso.model.entity.Cliente;

public interface ListarTodosController {
//interface de otro controler por tener nuevo caso de uso (listar)
	public ArrayList<Cliente> listarTodos();
}
