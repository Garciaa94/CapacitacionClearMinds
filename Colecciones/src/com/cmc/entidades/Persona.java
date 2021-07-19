/**
 * 
 */
package com.cmc.entidades;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  10 jul. 2021
 */
public class Persona {
	private String nombre;
	private int edad;
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * Contructor
	 * @param nombre
	 * @param edad
	 */
	public Persona(String nombre, int edad) {
		//super();
		this.nombre = nombre;
		this.edad = edad;
	}

}
