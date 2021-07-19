/**
 * 
 */
package constructores;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 9 jul. 2021
 */
public class TestAuto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto aut = new Auto("Tesla", 2021);
		System.out.println("Las caracteristicas del Auto son");
		System.out.println("Marca: "+aut.getMarca());
		System.out.println("Anio: "+aut.getAnio());

	}

}
