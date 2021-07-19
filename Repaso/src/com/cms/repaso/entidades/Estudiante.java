/**
 * 
 */
package com.cms.repaso.entidades;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 9 jul. 2021
 */
public class Estudiante {
	private String Nombre;
	private double Nota;
	private String Resultado;

	/**
	 * Constructor
	 * 
	 * @param nombre
	 */
	public Estudiante(String nombre) {
		super();
		Nombre = nombre;
	}
	

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}


	public void calificar(double nota) {
		
		if (nota<8 && nota >=0) {
			Resultado="F";
			System.out.println(Resultado);
		}else if(nota<0){
			
			System.out.println("La nota no puede ser Negativa");
		}
		else
		{
			Resultado="A";
			System.out.println(Resultado);
	}
		this.Nota=nota;
}
}