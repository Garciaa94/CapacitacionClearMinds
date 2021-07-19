/**
 * 
 */
package com.cmc.colecciones;

import java.util.ArrayList;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 10 jul. 2021
 */
public class Ejemplo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista = new ArrayList<String>();
		ArrayList<Persona> ListaPersona = new ArrayList<Persona>();
		lista.add("Adrian");
		ListaPersona.add(new Persona("Peter", 25));
		String a = lista.get(0);
		Persona p = ListaPersona.get(0);
		int tamanioL = lista.size();
		int tamanioP = ListaPersona.size();

		for (int i = 0; i < tamanioL; i++) {
			System.out.println("Datos de la lista es " + a);
		}
		
		/*for (int i = 0; i < tamanioP; i++) {
			System.out.println("Los datos de la lista son " +P);
		}*/
	}

}
