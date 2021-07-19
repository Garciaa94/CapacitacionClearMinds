/**
 * 
 */
package com.cmc.test;

import com.cmc.entidades.Direccion;
import com.cmc.entidades.Estudiante;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  10 jul. 2021
 */
public class TestEstudiante {
	public static void main(String[] args) {
		Estudiante est = new Estudiante("0845657125", "Adrian Garcia");
		est.imprimir();
		Direccion d1 = new Direccion();
		d1.setCallePrincipal("Malecon");
		d1.setCalleSecundaria("Espejo");
		d1.setNumero("457D");
		est.setDireccion(d1);
		System.out.println("****************************");
		est.imprimir();
		System.out.println("****************************");
		System.out.println("Nuevo estudiante");
		Estudiante est2 = new Estudiante("0845126978", "Peter");
		est2.setDireccion(new Direccion("Santa Cruz", "Dolorosa","14000ER"));
		est2.imprimir();
	}

}
