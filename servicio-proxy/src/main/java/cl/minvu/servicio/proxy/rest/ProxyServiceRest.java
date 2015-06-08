/**
 * 
 */
package cl.minvu.servicio.proxy.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



/**
 * @author rwangnet 
 * Interfaz Dummy para Acceso REST con métodos básicos tipo CRUD para mayor información
 */

@Path("")
public interface ProxyServiceRest {

	@POST
	@Path("/createObject")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Object createOperation();

	@GET
    @Path("/getObject/{objectid}")
	@Produces(MediaType.APPLICATION_JSON)
    public Object getObject(@PathParam("objectid") Integer objectid);
	
	@PUT
    @Path("/updateObject")
	@Consumes(MediaType.APPLICATION_JSON)
    public boolean updateObject(Object object);

    @DELETE
    @Path("{objectid}")
    public boolean removeObject(@PathParam("objectid") String objectid);
	
	
}
