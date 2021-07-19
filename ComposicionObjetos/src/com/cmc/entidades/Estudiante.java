/**
 * 
 */
package com.cmc.entidades;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 10 jul. 2021
 */
public class Estudiante {

	private String Cedula;
	private String nombre;
	private Direccion direccion;

	/**
	 * @param cedula
	 * @param nombre
	 */
	public Estudiante(String cedula, String nombre) {
		super();
		Cedula = cedula;
		this.nombre = nombre;
	}

	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return Cedula;
	}

	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		Cedula = cedula;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the direccion
	 */
	public Direccion getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void imprimir() {

		if (direccion == null) {
			System.out.println("Cedula de la persona es: " + getCedula());
			System.out.println("nombre de la persona es: " + getNombre());
			System.out.println("Estudiante no tiene direccion asignada ");
		} else {
			System.out.println("Cedula de la persona es: " + getCedula());
			System.out.println("nombre de la persona es: " + getNombre());
			System.out.println("Direccion de la persona es: " + direccion.getCallePrincipal() + " "
					+ direccion.getNumero() + " " + direccion.getCalleSecundaria());

		}
	}
	
	

}
