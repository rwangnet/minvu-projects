Introducción
============
Descripción: Ejemplo basado en arquetipo, que permite exponer (a través de una interfaz SCA) datos obtenidos de alguna referencia de algún componente de negocio permitiendo la orquestación de estos a través del enrutamiento de un componente Camel.

Estructura del Proyecto:

XML Relevantes:
---------------
 - switchyard.xml
 - route.xml
 
Interfaces:
-----------
JAVA - DummyService.java:
Clase dummy utilizada a modo de ejemplo por binding service descriptor switchyard.xml.Contiene método Dummy de ejemplo que establece como operación para pruebs de exposición inicial para otros componentes que requieran de su uso.

JAVA - PersonaServiceInterface.java:
Concepto similar al caso de DummyService, pero estableciendo una interfaz adecuada a la referencia a la que se especificará en el ejemplo.

Bindings SCA definidos:
----------
- Sca-Dummy (Service Binding)
- scaPersonaService (Reference Binding). Este último define el namespace correspondiente en su configuración para referenciar en concreto algún tipo de servicio a disposición.


