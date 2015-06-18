package cl.minvu.componente.negocio.dao;

import cl.minvu.componente.negocio.entities.Persona;

/*
 * Interfaz Local de acceso al DAO que provee de los métodos de persistencia via ORM.
 */

public interface PersonaDAOInterface {
	public void guardarPersona(Persona persona);

	public void eliminarPersona(Integer _id);

	public void modificarPersona(Persona persona);

	public Persona obtenerPersona(Integer _id);
}
