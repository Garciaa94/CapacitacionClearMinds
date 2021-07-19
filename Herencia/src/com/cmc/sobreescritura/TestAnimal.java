/**
 * 
 */
package com.cmc.sobreescritura;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  11 jul. 2021
 */
public class TestAnimal {
	public static void main(String[] args) {
		Perro p= new Perro();
		p.dormir();
		p.ladrar();
		System.out.println(p.hashCode());
	}

}
