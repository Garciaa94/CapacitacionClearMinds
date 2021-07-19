/**
 * 
 */
package com.cmc.util;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  13 jul. 2021
 */
public class Dado {
	/**
	 * 
	 */
	public static int lanzar() {
		// TODO Auto-generated method stub
		double d =Math.random();
		int valor=(int)(d*6);
		return valor+1;

	}

}
