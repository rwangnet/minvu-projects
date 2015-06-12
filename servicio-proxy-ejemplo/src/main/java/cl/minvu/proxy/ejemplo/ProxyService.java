/**
 * 
 */
package cl.minvu.proxy.ejemplo;

/**
 * Interfaz que define los métodos Dummy de la interfaz expuesta via REST
 */
public interface ProxyService {
	public Object createOperation();

	public Object getOperation(Integer objectid);

	public boolean updateOperation(Object object);

	public boolean removeOperation(String objectid);

}
