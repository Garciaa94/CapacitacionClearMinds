/**
 * 
 */
package com.cms.repaso.entidades;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 9 jul. 2021
 */
public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;


	/**
	 * @param productosActuales the productosActuales to set
	 */
	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public void vender(int cantidadProductosVendidos) {
		if(productosActuales>=0&&productosVendidos>=0) {
		this.productosActuales = productosActuales - cantidadProductosVendidos;
		this.productosVendidos = productosVendidos + cantidadProductosVendidos;
		}
	}

	public void devolver(int cantidadProductosVendidos) {
		if(productosActuales>=0 | productosVendidos>=0) {
		this.productosActuales=productosActuales+cantidadProductosVendidos;
		}else {
			this.productosVendidos=productosVendidos-cantidadProductosVendidos;
		}
	}
	public void imprimir() {
		System.out.println("Los productos actuales son\t"+this.productosActuales);
		System.out.println("Los productos devueltos son\t"+this.productosDevueltos);
		System.out.println("Los productos vendidos son\t"+this.productosVendidos);

	}

}
