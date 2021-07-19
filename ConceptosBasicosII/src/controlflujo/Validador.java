/**
 * 
 */
package controlflujo;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 9 jul. 2021
 */
public class Validador {
	public void validadEdad(int edad) {
		if (edad > 18) {
			System.out.println("Es mayor de edad");
		} else if (edad < 18) {
			System.out.println("Es menor de edad");
		} else {
			System.out.println("La edad es 18");
		}
	}
	public boolean esMayorDeEdad(int edad) {
		if(edad>18) {
			return true;
			
		}else {
			return false;
		}
	}
}