/**
 * 
 */
package com.cmc.evaluacion.fase2.entidades;

import java.util.ArrayList;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 17 jul. 2021
 */
public class Cliente {
	private String Cedula;
	private String Nombre;
	private String Apellido;
	ArrayList<Prestamo> prestamos;

	/**
	 * @param cedula
	 * @param nombre
	 * @param apellido
	 */

	public Cliente(String cedula, String nombre, String apellido) {
		// super();
		Cedula = cedula;
		Nombre = nombre;
		Apellido = apellido;
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
		return Nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return Apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	@Override
	public String toString() {
		return "Cliente [Cedula=" + Cedula + ", Nombre=" + Nombre + ", Apellido=" + Apellido + "]";
	}

	public boolean agregarPrestamo(Prestamo prestamo) {
		boolean en = true;
		for (Prestamo t : prestamos) {

			prestamos.add(prestamo);

			return en; //ojo
		}
		return en;
	}

	/**
	 * @return the prestamos
	 */
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	/**
	 * @param prestamos the prestamos to set
	 */
	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	/**
	 * @param prestamo
	 */
	/*public void colocarPrestamo(String prestamo) {
		// TODO Auto-generated method stub
		
	}*/

}
