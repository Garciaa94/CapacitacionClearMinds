/**
 * 
 */
package constructores;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  9 jul. 2021
 */
public class Auto {
	private String marca;
	private int anio;
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}
	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	//sysout
	}
	/**
	 * @param marca
	 * @param anio
	 */
	public Auto(String marca, int anio) {
		super();
		this.marca = marca;
		this.anio = anio;
	}
	

}
