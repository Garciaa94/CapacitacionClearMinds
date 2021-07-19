/**
 * 
 */
package com.cmc.repaso.test;

import com.cms.repaso.entidades.Producto;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 9 jul. 2021
 */
public class TestProducto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p = new Producto("Casa",-5);
		p.setPrecio(500);
		System.out.println("Valor del producto es: "+p.getPrecio());
		p.calcularPrecioPromo(12);
	}

}
