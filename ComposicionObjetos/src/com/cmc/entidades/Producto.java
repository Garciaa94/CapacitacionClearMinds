/**
 * 
 */
package com.cmc.entidades;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 10 jul. 2021
 */
public class Producto {
	private String nombre;
	private double precio;

	/**
	 * Contructor
	 * 
	 * @param nombre
	 * @param precio
	 */
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

}
