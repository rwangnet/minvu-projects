package org.servicio.negocio.ejemplo;

import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.switchyard.component.bean.Service;
import cl.minvu.TO.PersonaTO;

@Service(PersonaSource.class)
public class PersonaSourceBean implements PersonaSource {

	private static HashMap<Integer, PersonaTO> map = new HashMap<Integer, PersonaTO>();
	private static Logger LOG = LogManager.getLogger(PersonaSourceBean.class);

	public PersonaSourceBean() {
		map.put(1, new PersonaTO(1, "Ricardo", "Arjona Véliz", 33));
		map.put(2, new PersonaTO(2, "Arturo", "Mistral Cazzino", 29));
		map.put(3, new PersonaTO(3, "Juan", "Pérez Doe", 55));
	}

	public PersonaTO obtiene(PersonaTO persona) {
		LOG.info("INFO: Evaluando si existe persona consultada....");
		for (Entry<Integer, PersonaTO> entry : map.entrySet()) {
			if (persona.getId() == entry.getKey()) {
				LOG.info("INFO: Persona encontrada...");
				// persona = entry.getValue();
				return entry.getValue();
			}
			return entry.getValue();
		}
		LOG.info("INFO: La persona buscada no existe...");
		return null;

	}

}
