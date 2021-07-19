/**
 * 
 */
package controlflujo;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 9 jul. 2021
 */
public class TestValidador {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validador v = new Validador();
		v.validadEdad(18);
		boolean resultado =v.esMayorDeEdad(19);
		System.out.println("el resultado es :"+resultado);
	}
}
