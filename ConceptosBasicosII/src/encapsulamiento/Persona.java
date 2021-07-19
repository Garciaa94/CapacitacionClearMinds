/**
 * 
 */
package encapsulamiento;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 8 jul. 2021
 */
public class Persona {
	private String nombre;
	private int edad;
	private double estatura;
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
	 * @return the estatura
	 */
	public double getEstatura() {
		return estatura;
	}
	/**
	 * @param estatura the estatura to set
	 */
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	
}
