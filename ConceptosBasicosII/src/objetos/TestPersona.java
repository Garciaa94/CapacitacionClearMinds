package objetos;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 8 jul. 2021
 */
public class TestPersona {

	public static void main(String[] args) {
		System.out.println("Datos de persona");
		Persona p; // Variable Persona
		p = new Persona(); // instancia de objeti Persona
		p.nombre = "Juan"; // Modificacion de la variable nombre de clase Persona
		p.edad = 22;
		p.estatura = 1.80;
		System.out.println("Nombre:\t" + p.nombre);
		System.out.println("Edad:\t" + p.edad);
		System.out.println("Nombre:\t" + p.estatura);

		System.out.println("*******************************");

		System.out.println("Datos de Auto");
		Auto a;
		a = new Auto();
		a.marca = "Tesla";
		a.precio = 150000;
		a.anio = 2020;
		System.out.println("Nombre:\t" + a.marca);
		System.out.println("Precio:\t" + a.precio);
		System.out.println("anio:\t" + a.anio);

	}

}
