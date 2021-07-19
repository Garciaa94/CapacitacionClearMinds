/**
 * 
 */
package metodos;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 8 jul. 2021
 */
public class TestRectangulo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r = new Rectangulo();
		r.altura=10;
		r.base=2;
		int perimetro= r.calcularPerimetro();
		System.out.println("El perimetro es:"+perimetro);
		System.out.println("");
		System.out.println("****************************");
		int area=r.calcularArea();
		System.out.println("El area es:"+area); 
	}

}
