/**
 * 
 */
package com.cmc.calificaciones.servicios;

import java.util.ArrayList;

import com.cmc.calificaciones.entidades.Estudiante;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 13 jul. 2021
 */
public class AdminEstudiante {
	ArrayList<Estudiante> estudiantes;
	public AdminEstudiante() {
		estudiantes=new ArrayList<Estudiante>();
	}
	public void agregar(Estudiante estudiante) {
		estudiantes.add(estudiante);
	}

}
