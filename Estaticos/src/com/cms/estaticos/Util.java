/**
 * 
 */
package com.cms.estaticos;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 13 jul. 2021
 */
public class Util {

	public boolean ValidarRango(int valor) {
		if (valor > 0 && valor < 10) {
			return true;

		} else {
			return false;
		}
	}
	public static boolean ValidarPositivo(int valor) {
		if (valor > 0 ) {
			return true;

		} else {
			return false;
		}
	}
	
}
