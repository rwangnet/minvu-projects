Ejemplos de tipo de Servicios
------------------------------
EN el presente directorio se proveen de ejemplosde los 3 tipos definidios de servicio:
- Proxy
- Dominio
- Negocio

Instrucciones de Despliegue
----------------------------
Puede generar los artefactos a desplegar a través del comando mvn-install los cuáles estarán en el repositorio local o en 
el directorio target de cada uno de los proyectos específicos.
Podrá con esto, observar la integración de los tipos de servicios definidos, a partir del acceso via rest al servicio proxy
que consumira otro tipo de servicio de dominio, y este a su vez, de negocio respectivamente.

Podrá comprobarlo con pegar esta llamada en el browser:
"http://localhost:8080/rest/persona/2"
