#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package ${package};

/**
 * Interfaz que define los métodos Dummy de la interfaz expuesta via REST
 */
public interface ProxyService {
	public Object createOperation();

	public Object getOperation(Integer objectid);

	public boolean updateOperation(Object object);

	public boolean removeOperation(String objectid);

}
