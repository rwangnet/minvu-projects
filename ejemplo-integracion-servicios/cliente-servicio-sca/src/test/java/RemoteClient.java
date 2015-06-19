/*
 * Copyright 2013 Red Hat Inc. and/or its affiliates and other contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import javax.xml.namespace.QName;

import org.switchyard.remote.RemoteInvoker;
import org.switchyard.remote.RemoteMessage;
import org.switchyard.remote.http.HttpInvoker;

import cl.minvu.TO.PersonaTO;


/**
 * Cliente para pruebas de servicios que exponen una Interfaz de tipo SCA
 */
public final class RemoteClient {

	private static final QName SERVICE = new QName(
			"urn:cl.minvu.servicio.dominio:servicio-dominio-ej:1.0", "DummyService");
	private static final String URL = "http://localhost:8080/switchyard-remote";

	private RemoteClient() {
	}

	/*
	 * Ejecutamos como Java Application
	 */
	public static void main(final String[] ignored) throws Exception {
		// Instancia del RemoteInvoker para probar el servicio SCA
		RemoteInvoker invoker = new HttpInvoker(URL);

		// Objeto a pasar por referencia
		PersonaTO persona = new PersonaTO(1, "", "", 15);

		// Se define el mensaje (de tipo compatible al definido por la Interfaz.
		// Dicho TO debe estar definido en el cliente igualmente)
		RemoteMessage message = new RemoteMessage();
		message.setService(SERVICE).setOperation("dummyMethod")
				.setContent(persona);

		// Se invoca el servicio
		RemoteMessage reply = invoker.invoke(message);
		if (reply.isFault()) {
			System.err.println("Oops ... something bad happened.  "
					+ reply.getContent());
		} else {
			PersonaTO respuesta = (PersonaTO) reply.getContent();
			System.out.println(respuesta.getNombre());
		}
	}
}
