/**
 * 
 */
package com.cmc.test;

import com.cmc.admin.AdminProducto;
import com.cmc.entidades.Producto;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  10 jul. 2021
 */
public class TestProducto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdminProducto adminP = new AdminProducto();
		Producto uno = new Producto("Casa",1500);
		Producto dos = new Producto("Pc",1500);
		Producto prodCaro=adminP.ObtenerValorProductoMasCaro(uno, dos);
		
		if(prodCaro==null) {
		System.out.println("Tienen el mismo precio");	
		}else {
			System.out.println("El producto mas caro es: "+prodCaro.getNombre());
		}
		
	}

}
