/**
 * 
 */
package com.cmc.repaso.test;

import com.cms.repaso.entidades.Item;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 9 jul. 2021
 */
public class TestItem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item it = new Item();
		it.setProductosActuales(20);
		it.devolver(8);
		it.vender(3);
		it.vender(1);
		it.imprimir();
	}


}
