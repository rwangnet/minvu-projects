package cl.minvu.componente.negocio.negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import cl.minvu.PersonaControllerInterfaces.PersonaControllerInterface;
import cl.minvu.componente.negocio.dao.PersonaDAOInterface;
import cl.minvu.componente.negocio.entities.Persona;
/*
 * Implementación de los típicos métodos de operaciones CRUD definidos en la interfaz para operaciones de negocio
 * sobre la información de personas almacenadas en cualquier DBMS.
 */

@Stateless
public class PersonaControllerImpl implements PersonaControllerInterfaceLocal, PersonaControllerInterface {

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
	Persona p = personaDao.obtenerPersona(_id);
	System.out.println("Datos de la Persona: "+p.getNombre()+" "+p.getApellidos()+" "+p.getEdad());
	return p;
	}

	@Override
	public void doSomething() {
	System.out.println("********* Creando Persona ***********");
	Persona p = new Persona();
	p.setNombre("Nombre-de-prueba");
	p.setApellidos("Mistral Cazzino");
	p.setEdad(50);
	guardarPersona(p);
	
	System.out.println("********* Modificando Persona ***********");
	Persona p2 = new Persona();
	p.setNombre("Nombre-de-prueba-2");
	p.setApellidos("Mistral Cazzino");
	p.setEdad(55);
	p.setId(100L);
    modificarPersona(p2);
    
    System.out.println("********* Eliminando Persona ***********");
    eliminarPersona(100);
    
    System.out.println("********* Obteniendo Persona ************");
    Persona p3 = obtenerPersona(1);
    System.out.println("Datos de la Persona: "+p.getNombre()+" "+p.getApellidos());
	
	}

}
