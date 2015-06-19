#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ${package}.dao.PersonaDAOInterface;
import ${package}.entities.Persona;
/*
 * Implementación de los típicos métodos de operaciones CRUD definidos en la interfaz para operaciones de negocio
 * sobre la información de personas almacenadas en cualquier DBMS.
 */

@Stateless
public class PersonaControllerImpl implements PersonaControllerInterface {

	@Inject
	PersonaDAOInterface personaDao;
	
	@Override
	public void guardarPersona(Persona persona) {
	personaDao.guardarPersona(persona);

	}

	@Override
	public void eliminarPersona(Integer _id) {
    personaDao.eliminarPersona(_id);
	}

	@Override
	public void modificarPersona(Persona persona) {
    personaDao.modificarPersona(persona);
	}

	@Override
	public Persona obtenerPersona(Integer _id) {
	return personaDao.obtenerPersona(_id);
	}

}
