package cl.minvu.servicio.negocio;

import cl.minvu.to.PersonaTO;

public interface PersonaSource {

	public PersonaTO obtiene(Integer idPersona);
}
