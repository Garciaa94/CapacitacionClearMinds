/**
 * 
 */
package com.cmc.test;

import com.cmc.arreglos.Contacto;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  11 jul. 2021
 */
public class TestContacto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacto [] contactos= new Contacto[5];
		contactos[0] = new Contacto("01", "Adrian");
		contactos[1] = new Contacto("02", "Peter");
		contactos[2] = new Contacto("03", "Garcia");
		contactos[3] = new Contacto("04", "Quinonez");
		contactos[4] = new Contacto("05", "lol");
		for(int i=0;i<contactos.length;i++) {
			System.out.println(contactos[i]);
		}
	}

}
