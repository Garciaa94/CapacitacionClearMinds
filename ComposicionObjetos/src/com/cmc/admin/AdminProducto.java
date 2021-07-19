/**
 * 
 */
package com.cmc.admin;

import com.cmc.entidades.Producto;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 10 jul. 2021
 */
public class AdminProducto {

	// Este clase va a comparar 2 parametros de tipo productos
	// Retorna el producto de mayor valor
	public Producto ObtenerValorProductoMasCaro(Producto a, Producto b) {
		if (a.getPrecio() > b.getPrecio()) {
			return a;
		} else if (b.getPrecio() > a.getPrecio()) {
			return b;
		} else {
			return null;
		}
	}

}
