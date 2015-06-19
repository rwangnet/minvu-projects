/**
 * 
 */
package cl.minvu.servicio.proxy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cl.minvu.to.PersonaTO;

/**
 * Interfaz Dummy para Acceso REST con métodos básicos tipo CRUD para mayor
 * información. Se requiere posteriormente una implementación específica de la
 * interfaz de la referencia destino asociados a estos métodos dummy.
 */

@Path("/persona")
public interface ProxyServiceRest {

	@GET
	@Path("/{objectid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Object getOperation(@PathParam("objectid") Integer objectid);

}
