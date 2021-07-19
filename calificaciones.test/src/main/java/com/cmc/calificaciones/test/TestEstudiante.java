/**
 * 
 */
package com.cmc.calificaciones.test;

import com.cmc.calificaciones.entidades.Estudiante;
import com.cmc.calificaciones.servicios.AdminEstudiante;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  13 jul. 2021
 */
public class TestEstudiante {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminEstudiante ae= new AdminEstudiante();
		Estudiante e = new Estudiante("Adrian ", "Garcia");
		System.out.println("fin");

	}

}
