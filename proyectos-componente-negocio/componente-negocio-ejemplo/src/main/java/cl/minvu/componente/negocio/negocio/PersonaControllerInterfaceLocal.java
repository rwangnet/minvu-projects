package cl.minvu.componente.negocio.negocio;

import javax.ejb.Local;
import javax.ejb.Remote;

import cl.minvu.componente.negocio.entities.Persona;

/*
 * Interfaz Dummy de EJB de control de acceso al DAO de entidad Persona.
 */

@Local
public interface PersonaControllerInterfaceLocal {
	public void guardarPersona(Persona persona);

	public void eliminarPersona(Integer _id);

	public void modificarPersona(Persona persona);

	public Persona obtenerPersona(Integer _id);

}
