package cl.minvu.servicio.negocio;

import java.util.HashMap;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.switchyard.component.bean.Service;

import cl.minvu.to.PersonaTO;

@Service(PersonaSource.class)
public class PersonaSourceBean implements PersonaSource {

	private static HashMap<Integer, PersonaTO> map = new HashMap<Integer, PersonaTO>();
	private static Logger LOG = LogManager.getLogger(PersonaSourceBean.class);

	public PersonaSourceBean() {
		map.put(1, new PersonaTO(1, "Ricardo", "Arjona Véliz", 33));
		map.put(2, new PersonaTO(2, "Arturo", "Mistral Cazzino", 29));
		map.put(3, new PersonaTO(3, "Juan", "Pérez Doe", 55));
	}

	public PersonaTO obtiene(Integer idPersona) {
		LOG.info("INFO: Evaluando si existe persona consultada....");
		PersonaTO persona = map.get(idPersona);
		LOG.info("INFO: "+(persona!=null?"Persona encontrada!":"La persona buscada no existe...") );
		return persona;

	}

}
