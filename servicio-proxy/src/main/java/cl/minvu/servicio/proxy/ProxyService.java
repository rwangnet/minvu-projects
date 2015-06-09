/**
 * 
 */
package cl.minvu.servicio.proxy;

/**
 * @author rwangnet
 * 
 */
public interface ProxyService {
	public Object createOperation();

	public Object getOperation(Integer objectid);

	public boolean updateOperation(Object object);

	public boolean removeOperation(String objectid);

}
