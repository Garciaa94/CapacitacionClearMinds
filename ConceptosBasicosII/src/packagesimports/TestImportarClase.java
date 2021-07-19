/**
 * 
 */
package packagesimports;

import constructores.*;
import objetos.Auto;//
/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 9 jul. 2021
 */
public class TestImportarClase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto a = new Auto();
				a.setMarca("Tesla");
				a.setAnio(2020);
				a.setPrecio(200000);
				System.out.println("La Informacion del Auto es");
				System.out.println("Marca:\t"+a.getMarca());
				System.out.println("Anio:\t"+a.getAnio());
				System.out.println("Precio:\t"+"$"+a.getPrecio());
				System.out.println("*********************");
				// uso de clase Persona del paquete externo
				Persona p = new Persona("Adrian Garcia",27,168);
				
				System.out.println("Informacion del comprador");
				System.out.println("Nombres\t "+p.getNombre());
				System.out.println("Edad\t "+p.getEdad());
				System.out.println("Estatura\t "+p.getEstatura());
	}

}
