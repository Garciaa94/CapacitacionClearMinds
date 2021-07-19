/**
 * 
 */
package com.cmc.dato.test;

import com.cmc.util.Dado;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  13 jul. 2021
 */
public class TestDado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dado.lanzar();
		
		for(int i=0;i<20;i++) {
			System.out.println(Dado.lanzar());
		}
		

	}

}
