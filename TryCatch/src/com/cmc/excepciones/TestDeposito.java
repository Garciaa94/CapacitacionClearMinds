/**
 * 
 */
package com.cmc.excepciones;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  15 jul. 2021
 */
public class TestDeposito {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta c = new Cuenta();
		try{
			c.depositar (-10);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
	}

}
