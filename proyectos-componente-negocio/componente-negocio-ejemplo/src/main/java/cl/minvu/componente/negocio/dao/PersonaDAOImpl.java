package cl.minvu.componente.negocio.dao;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import cl.minvu.componente.negocio.entities.Persona;

/*
 * Implementación de las operaciones CRUD para la entidad de ejemplo denominada Persona. Típicamente, se utilizan
 * instancias como las definidas (EntityManager,Queries, entre otras posibilidades extensibles a las implementaciones
 * específicas como Hibernate, TopLink, etc
 */

public class PersonaDAOImpl implements PersonaDAOInterface {

	@PersistenceContext(unitName = "minvu-ejb-pu")
	private EntityManager em;

	private static Logger LOG;

	@Override
	public void guardarPersona(Persona persona) {
		// Ejemplo Dummy de implementación
		LOG.info("INFO: Guardando Persona en BD....");
		em.persist(persona);
	}

	@Override
	public void eliminarPersona(Integer _id) {
		// Ejemplo Dummy de implementación
		Query query = em.createQuery("DELETE PERSONA WHERE id=:pid");
		query.setParameter("pid", _id);
		int result = query.executeUpdate();
		LOG.info("INFO: Borrada la persona con ID: " + _id);

	}

	@Override
	public void modificarPersona(Persona persona) {
		LOG.info("INFO: Modificando Persona en BD....");
		em.merge(persona);

	}

	@Override
	public Persona obtenerPersona(Integer _id) {
		// TODO Implementar método según JPA Library Impl, seleccionada.
		return em.find(Persona.class, _id);

	}

}
