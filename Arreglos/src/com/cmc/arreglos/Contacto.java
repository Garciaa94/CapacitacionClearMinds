/**
 * 
 */
package com.cmc.arreglos;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  11 jul. 2021
 */
public class Contacto {
	private String codigo;
	private String nombre;
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
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
	 * @param codigo
	 * @param nombre
	 */
	public Contacto(String codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Contacto [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	

}
