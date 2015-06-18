package cl.minvu.negocio.ejemplo.TO;

import java.io.Serializable;

public class PersonaTO implements Serializable {

	private static final long serialVersionUID = 1L;
		
	private String nombre;
	private String apellidos;
	private Integer edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	
}
