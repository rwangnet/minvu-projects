package cl.minvu.negocio.ejemplo;

import org.slf4j.Logger;
import org.switchyard.component.bean.Service;

import cl.minvu.negocio.ejemplo.TO.PersonaTO;

@Service(PersonaServiceInterface.class)
public class PersonaServiceInterfaceBean implements PersonaServiceInterface {
private static Logger logger;
	@Override
	public PersonaTO obtiene(PersonaTO persona) {
		logger.info("********* Imprimiendo desde PersonaSeviceInterfaceBean.obtiene() *************");
		// TODO Auto-generated method stub
		PersonaTO person = new PersonaTO();
		persona.setNombre("Pedro");
		persona.setApellidos("Picapiedra Valencia");
		persona.setEdad(5);
		return person;
	}

}
