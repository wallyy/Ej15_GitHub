package es.curso.controllers.ejb;

import es.curso.controllers.DarAltaClienteController;
import es.curso.model.entity.Cliente;

public class DarAltaClienteControllerEjb implements DarAltaClienteController{
//aca tenemos solo un caso de uso q es darde alta cliente
	//dijimos q por cada caso de uso
	//sgte caso de uso creamos otra clase 
	@Override
	public void agregar(Cliente cliente) {
		
/*		ACA SE PONE LA LOGICA DEL NEG PARA AGRER CLIENTE
		1. Verificar Datos
		2. Agregarlo ----> llamar o (agreg) a la capa DAO para q se de de alta
		3. Enviar email al jefe de Obra
		4. enviar un email al cliente */
		
		
	}

}
