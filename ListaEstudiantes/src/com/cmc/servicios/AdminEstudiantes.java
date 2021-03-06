/**
 * 
 */
package com.cmc.servicios;

import java.util.ArrayList;

import com.cmc.estudiantes.Estudiante;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 13 jul. 2021
 */
public class AdminEstudiantes {
	private ArrayList<Estudiante> estudiantes;

	/**
	 * @param estudiantes
	 */
	public void agregar(Estudiante estudiante) {
		// super();
		this.estudiantes.add(estudiante);
	}

	public Estudiante Buscar(String cedula) {
		/*
		 * Estudiante est= null; for(int i=0;i<estudiantes.size();i++) {
		 * if(cedula.equals(est.getCedula())){
		 * 
		 * } }
		 */ // remplazo
		for (Estudiante est : estudiantes) {
			if (cedula.equals(est.getCedula())) {
				return est;
			}

		}
		return null;
	}
	
	public ArrayList<Estudiante> BuscarMenor(int edad){
		ArrayList<Estudiante> menor=new ArrayList<Estudiante>();
		for(Estudiante estudiante: estudiantes) {
			if (estudiante.getEdad()<edad){
				menor.add(estudiante);
			}
		}
		return menor;
	}
}