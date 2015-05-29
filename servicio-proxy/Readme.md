Introduccion
============
Descripción: arquetipo de un servicio de tipo proxy, el cual contiene la configuración 
básica que permite ejemplificar como exponer un servicio vía canal http mediante 
una interfaz de tipo REST y a su vez consumir un servicio de tipo dominio (u otro componente). 

Estructura del Proyecto:

XML Relevantes:
---------------
 - Switchyard.xml
 - route.xml
 
 Interfaces:
 -----------
 REST - ProxyServiceRest
 ProxyService (impl Camel)
 Reference (Dummy componente referenciado)
 
 Objetivos:
 ----------
 Permitir dar base a una implementación sujeta a la descripción anteriormente mencionada.
