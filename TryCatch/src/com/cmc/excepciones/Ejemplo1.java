/**
 * 
 */
package com.cmc.excepciones;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 13 jul. 2021
 */
public class Ejemplo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Inicio");
		String a = null;
		a ="adrian";
		try {
			a.substring(1, 3);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error"+e);
		}
		
		System.out.println("Fin "+a);

	}

}
