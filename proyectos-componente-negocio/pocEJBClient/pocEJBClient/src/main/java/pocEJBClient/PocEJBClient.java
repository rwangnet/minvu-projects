package pocEJBClient;

import java.util.Hashtable;
import java.util.Properties;

import javax.naming.Binding;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import cl.minvu.PersonaControllerInterfaces.PersonaControllerInterface;

public class PocEJBClient {
	/**
	 * El contexto inicial JNDI por defecto
	 */
	static Context context = null;
	static String jndi = null;

	protected void setUp() throws NamingException {
		System.out.println("configuracion para acceso via protocolo ejb ");
		Properties jndiProperties = new Properties();
		jndiProperties.put(Context.URL_PKG_PREFIXES,
				"org.jboss.ejb.client.naming");
		context = new InitialContext(jndiProperties);
		String appName = "";
		String moduleName = "PersonaControllerInterfaces";
		String distinctName = "";
		String beanName = "PersonaControllerImpl";
		String viewClassName = PersonaControllerInterface.class.getName();
		jndi = "ejb:" + appName + "/" + moduleName + "/" + distinctName + "/"
				+ beanName + "!" + viewClassName;
		printJNDI();

	}

	protected void setUp2() throws Exception {
		System.out.println("configuracion para acceso via jndi");

		String JBOSS_CONTEXT = "org.jboss.naming.remote.client.InitialContextFactory";
		;
		Properties props = new Properties();
		props.put(Context.INITIAL_CONTEXT_FACTORY, JBOSS_CONTEXT);
		props.put(Context.PROVIDER_URL, "remote://localhost:4447");
		props.put(Context.SECURITY_PRINCIPAL, "testuser");
		props.put(Context.SECURITY_CREDENTIALS, "test.20155");

		// props.put("jboss.naming.client.ejb.context", true);
		context = new InitialContext(props);
		NamingEnumeration ne = context.listBindings("");
		System.out.println("/****en java:jboss/exported/****/");
		while (ne.hasMoreElements()) {
			javax.naming.Binding object = (Binding) ne.nextElement();

			System.out.println(object.getName());

		}
		System.out.println("/*********************/");

		// jndi
		// ="java:pocEJBJNDI/CalculatorImpl!pocEJBJNDI.interfaces.CalculatorRemote";
		// jndi = "pocEJBJNDI.interfaces.CalculatorRemote";
		printJNDI();

	}

	private void printJNDI() {
		System.out.println("jndi [" + jndi + "]");
	}

	private void closeContext() {
		try {
			context.close();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void process() throws NamingException {

		PersonaControllerInterface pc = (PersonaControllerInterface) context
				.lookup(jndi);
		pc.doSomething();

	}

	public static void main(String[] args) throws Exception {
		PocEJBClient ct = new PocEJBClient();

		ct.setUp();
		ct.process();
		//
		// ct.setUp2();
		// ct.process();

	}
}
