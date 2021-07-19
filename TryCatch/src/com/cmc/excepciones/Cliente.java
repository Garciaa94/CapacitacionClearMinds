/**
 * 
 */
package com.cmc.excepciones;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  15 jul. 2021
 */
public class Cliente {
	private String Nombre;
	private String Cedula;
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return Cedula;
	}
	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	/**
	 * @param nombre
	 * @param cedula
	 */
	public Cliente(String nombre, String cedula) {
		super();
		Nombre = nombre;
		Cedula = cedula;
	}
	@Override
	public String toString() {
		return "Cliente [Nombre=" + Nombre + ", Cedula=" + Cedula + "]";
	}
	

}
