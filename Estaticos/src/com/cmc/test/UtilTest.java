/**
 * 
 */
package com.cmc.test;

import com.cms.estaticos.Util;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 13 jul. 2021
 */
public class UtilTest {
	
	public static void main(String[] args) {
		Util util = new Util();
		boolean r = util.ValidarRango(5);
		
		System.out.println("valor es "+r);
		
		boolean r2 = Util.ValidarPositivo(-2); // llamar metodo estatico directo de la clase
		System.out.println("valor es positivo ? "+r2);
		

	}
}
