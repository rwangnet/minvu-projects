Proyecto Base arquetipo componente de Negocio
---------------------------------------------
Proyecto base para la construcción del arquetipo del componente de negocio. Orientado a una visión agnóstica y estándar del stack JEE6,
que incluye JPA, sin ninguna implementación o "JPA-vendor" específico.


Componentes Relevantes
----------------------
 - pom.xml - Dependencias del proyecto
 - persistence.xml - Definición general de configuración de persistencia.
 - Persona.java - Entity básica Dummy, que da visibilidad del mappeo ORM correspondiente.
 - PersonaDAOInterface.java y PersonaDAOImpl.java - Interfaz e implementación del patrón de diseño DAO para el acceso persistente a datos desde un datasource específico.
 - PersonaControllerImpl.java - EJB sencillo que gestiona el acceso a los componentes DAO.
