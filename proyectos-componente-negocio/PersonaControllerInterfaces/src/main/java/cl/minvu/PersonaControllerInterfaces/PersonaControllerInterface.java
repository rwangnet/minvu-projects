package cl.minvu.PersonaControllerInterfaces;

import javax.ejb.Remote;

/*
 * Interfaz Dummy de EJB de control de acceso al DAO de entidad Persona.
 */

@Remote
public interface PersonaControllerInterface {
	public void doSomething();

}
