/**
 * 
 */
package com.cmc.colecciones;

import java.util.ArrayList;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  10 jul. 2021
 */
public class Ejemplo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("a");//posicion 0
		lista.add("b");//posicion 1
		lista.add("c");//posicion 2
		String recuperado = lista.get(1);
		int tamanio = lista.size();
		System.out.println("Cadena recuperada: "+recuperado);
		String cadena = null;
		for(int i=0; i<lista.size();i++) {
			cadena = lista.get(i);
			System.out.println("Recuperado de la posicion: "+cadena);
		}
		
		/*if (lista.size()>tamanio) {
		System.out.println("Recuperado de la posicion: "+recuperado);
		}else {
			System.out.println("El tamaño de la lista es mallor");
		}*/
	}

}
