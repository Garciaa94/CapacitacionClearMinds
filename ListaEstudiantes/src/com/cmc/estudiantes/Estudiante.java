/**
 * 
 */
package com.cmc.estudiantes;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  13 jul. 2021
 */
public class Estudiante {
private  String cedula;
private String nombre;
private int edad;
/**
 * @return the cedula
 */
public String getCedula() {
	return cedula;
}
/**
 * @param cedula the cedula to set
 */
public void setCedula(String cedula) {
	this.cedula = cedula;
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
 * @return the edad
 */
public int getEdad() {
	return edad;
}
/**
 * @param edad the edad to set
 */
public void setEdad(int edad) {
	this.edad = edad;
}
/**
 * @param cedula
 * @param nombre
 * @param edad
 */
public Estudiante(String cedula, String nombre, int edad) {
	super();
	this.cedula = cedula;
	this.nombre = nombre;
	this.edad = edad;
}
@Override
public String toString() {
	return "Estudiante [cedula=" + cedula + ", nombre=" + nombre + ", edad=" + edad + "]";
}

}
