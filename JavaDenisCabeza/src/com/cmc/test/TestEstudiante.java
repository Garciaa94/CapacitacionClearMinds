package com.cmc.test;

import com.cmc.evaluacion.Direccion;
import com.cmc.evaluacion.Estudiante;

public class TestEstudiante {
	public static void main(String[] args) {
		Estudiante est1=new Estudiante("Marco","Rosales");
		Estudiante est2=new Estudiante("Erika","Rivera");
		
		Direccion d1=new Direccion("Amazonas","Naciones Unidas");
		est1.setDireccion(d1);
		est2.imprimir();
		est1.imprimir();
		
		/*
		 * Clase donde se produce el NullPointerException:
		 * 	Se produce en la clase Estudiante.
		 * Línea exacta del NullPointerException: 17
		 * Variable que ocasiona el NullPointerException: direccion
		 * Porque esa variable está null en ese punto?: porque es
		 * una clase y al no darle parametros se mantiene con el valor por defecto null
		 * el error se genera al tratar de obtener los atributos de esta variable.
		 * */
	}
}
