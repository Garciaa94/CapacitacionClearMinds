/**
 * 
 */
package metodos;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  8 jul. 2021
 */
public class TestCalculadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double resultado=0;
		Calculadora calc =new Calculadora();
		resultado=calc.sumar(8, 2);
		System.out.println("Resultado de la suma es: "+resultado);
		resultado=calc.restar(8, 2);
		System.out.println("Resultado de la resta es: "+resultado);
		resultado=calc.multiplicar(8, 2);
		System.out.println("Resultado de la multiplicacion es: "+resultado);
		resultado=calc.dividir(8, 2);		
		System.out.println("Resultado de la division es: "+resultado);
		calc.imprimir();

	}

}
