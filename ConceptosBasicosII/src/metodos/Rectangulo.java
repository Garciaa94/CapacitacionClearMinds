/**
 * 
 */
package metodos;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 8 jul. 2021
 */
public class Rectangulo {
	public int base;
	public int altura;

	public int calcularPerimetro() {
		int per = (2 * base) + 2 * altura;
		return per;
	}

	public int calcularArea() {
		int area = base * altura;
		return area;
	}

}
