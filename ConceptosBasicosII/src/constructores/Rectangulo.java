/**
 * 
 */
package constructores;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 8 jul. 2021
 */
public class Rectangulo {
	private int base;
	private int altura;

	public int calcularPerimetro() {
		int per = (2 * base) + 2 * altura;
		return per;
	}

	public int calcularArea() {
		int area = base * altura;
		return area;
	}

	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

}
