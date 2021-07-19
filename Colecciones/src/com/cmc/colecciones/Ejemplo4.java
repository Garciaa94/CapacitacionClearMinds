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
public class Ejemplo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> listaPersona = new ArrayList<Persona>();
		listaPersona.add(new Persona("Adrian", 22));
		listaPersona.add(new Persona("Peter", 27));
		listaPersona.add(new Persona("Garcia", 65));
		Persona p = new Persona("Adrian Garcia", 12);
		listaPersona.add(p);
		System.out.println(listaPersona.size());
		Persona per = null;
		for (int i=0;i < listaPersona.size(); i++) {
			 per =listaPersona.get(i);
			System.out.println("Nombre: "+per.getNombre()+" "+"Edad"+per.getEdad());
		}

	}

}
