package es.curso.controllers;

import es.curso.model.entity.Cliente;

//(( controladores gralmente no tienen atrib entonc))

//este es para generalizar y no solo con ejb sino con otros sistemas
// incluso se puede poner una clase que tenga todos los controladores pero de momento no lo haremos
public interface DarAltaClienteController {

	public void agregar(Cliente cliente);

}
