package cl.minvu.negocio;

import cl.minvu.entities.Persona;

/*
 * Interfaz Dummy de EJB de control de acceso al DAO de entidad Persona.
 */

public interface PersonaControllerInterface {
	public void guardarPersona(Persona persona);

	public void eliminarPersona(Integer _id);

	public void modificarPersona(Persona persona);

	public Persona obtenerPersona(Integer _id);

}
