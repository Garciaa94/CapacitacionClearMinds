/**
 * 
 */
package com.cmc.sobreescritura;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  11 jul. 2021
 */
public class Persona {
	private String nombre;
	private String apellido;
	/**
	 * @param nombre
	 * @param apellido
	 */
	public Persona(String nombre, String apellido) {
	//	super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	

}
