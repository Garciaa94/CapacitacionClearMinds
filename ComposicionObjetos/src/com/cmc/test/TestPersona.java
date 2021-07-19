/**
 * 
 */
package com.cmc.test;

import com.cmc.entidades.Direccion;
import com.cmc.entidades.Persona;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 10 jul. 2021
 */
public class TestPersona {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona();
		
		p.setNombre("Monica");
		p.setCedula("0850256828");
		p.setEdad(23);
		System.out.println("Los valores de la clase Persona es:"+p.getNombre());
		System.out.println("Los valores de la clase Persona es:"+p.getCedula());
		System.out.println("Los valores de la clase Persona es:"+p.getEdad());
		
		Direccion dir = p.getDireccion();
		System.out.println("*********************");
		// control para el nuul pointer
		
		if(dir !=null) {
		System.out.println("la calle principal es: "+dir.getCallePrincipal());
		}else {
			
			System.out.println("No se le asigno valor a la Direccion");
		}
	}

}
