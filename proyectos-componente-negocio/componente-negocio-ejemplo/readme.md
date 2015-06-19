Componente de Negocio Ejemplo
-----------------------------
Proyecto de ejemplo generado a través del arquetipo de componente de negocio propuesto, en dónde para este caso se gestionan las dependencias
para implementar la implementación de JPA, a través de Hibernate 4, más ejemplo simple de un controlador y componentes Dao y entity correspondiente.

Componentes Relevantes
------------------------

 - pom.xml - Descriptor con las dependencias definidas para la implementación con Hibernate 4, especialmente, más otras propias necesarias 
  para utilizar el stack jee6.
 - persistence.xml - Definición de la fuente de datos JTA, propiedades de generación de esquema, Dialecto de HIbernate entre otros.
 - jboss-deployment-structure.xml - Referencia a un módulo dinámico que contiene una interfaz remota utilizable para el acceso con un cliente ejb.
 - Persona.java - Entity básica Dummy, que da visibilidad del mappeo ORM correspondiente.
 - PersonaDAOInterface.java y PersonaDAOImpl.java - Interfaz e implementación del patrón de diseño DAO para el acceso persistente a datos desde un datasource específico.
 - PersonaControllerImpl.java - EJB sencillo que gestiona el acceso a los componentes DAO. Sucesptibles de ser expuestos via una interfaz remota.
