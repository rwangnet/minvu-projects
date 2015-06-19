Introducción
============
Ejemplo basado en arquetipo de servicio-proxy que expone a través de una interfaz REST un servicio específico que además puede consumir una referencia de un servicio de dominio/negocio a través de la exposición via un SCA Binding.. 

Estructura del Proyecto:

XML Relevantes:
---------------
 - switchyard.xml
 - route.xml
 
 Interfaces:
 -----------
 JAVA - ProxyService.java:
  Interfaz que define operación básica para la exposición del servicio a través de REST.

 JAVA - ProxyServiceRest.java:
  Interfaz REST que expone al servicio con sus pertinentes definiciones (Path, Tipo de operación, Tipo de componente que consume o produce (XML,JSON,etc)

 JAVA - DummyService.java: Interfaz adecuada para la referencia a la que se especificará en el ejemplo.

 Bindings:
 -----------
 Rest Binding (rest1): Definición del context-path, detalles e interfaces de recursos rest involucrados. (ProxyService)
 SCA Binding (sca-servicio-dominio): Este último define el namespace correspondiente en su configuración para referenciar en concreto algún tipo de servicio a disposición.
 


