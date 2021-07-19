/**
 * 
 */
package encapsulamiento;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  8 jul. 2021
 */
public class TestPersona {

	public static void main(String[] args) {
		System.out.println("Datos de persona");
		Persona p; // Variable Persona
		p = new Persona(); // instancia de objeti Persona
		p.setNombre("Juan"); // Modificacion de la variable nombre de clase Persona
		p.setEdad(22);
		p.setEstatura(1.80);
		System.out.println("Nombre:\t" + p.getNombre());
		System.out.println("Edad:\t" + p.getEdad());
		System.out.println("Nombre:\t" + p.getEstatura());

		

	}

}
