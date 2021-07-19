/**
 * 
 */
package com.cmc.repaso.test;

import com.cms.repaso.entidades.Estudiante;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 9 jul. 2021
 */
public class TestEstudiante {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante e = new Estudiante("Adrian Garcia");
		System.out.println("Nombre estudiante: "+e.getNombre());
		e.calificar(8);
	}

}
