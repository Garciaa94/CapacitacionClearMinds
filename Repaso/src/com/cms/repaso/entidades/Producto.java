/**
 * 
 */
package com.cms.repaso.entidades;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 9 jul. 2021
 */
public class Producto {
	private String Nombre;
	private double Precio;
	private double descuento;

	/**
	 * Constructor
	 * 
	 * @param nombre
	 * @param precio
	 */
	public Producto(String nombre, double precio) {
		super();
		this.Nombre = nombre;
		this.Precio = precio;
	}

	public void calcularPrecioPromo(double porcentaje) {
		 this.descuento = ((porcentaje * Precio) / 100) + Precio;
		 System.out.println("el descuento del 12% es: "+(porcentaje * Precio) / 100);
		 System.out.println("Valor Total del producto mas descuento es: "+descuento);
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		if (precio > 0) {
			Precio = precio;
			System.out.println(Precio);
		} else {
			Precio = precio * -1;
			System.out.println(Precio);
		}
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return Precio;
	}
	

}
