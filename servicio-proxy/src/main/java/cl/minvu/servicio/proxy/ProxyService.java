/**
 * 
 */
package cl.minvu.servicio.proxy;

/**
 * Interfaz que define los métodos Dummy del componente referencial a exponer
 */
public interface ProxyService {
	public Object createOperation();

	public Object getOperation(Integer objectid);

	public boolean updateOperation(Object object);

	public boolean removeOperation(String objectid);

}
