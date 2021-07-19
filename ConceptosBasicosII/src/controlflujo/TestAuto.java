/**
 * 
 */
package controlflujo;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  9 jul. 2021
 */
public class TestAuto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto a =new Auto(60);
		System.out.println(a.getCantidadGasolina());
		
		a.cargarGasolina(10);
		System.out.println(a.getCantidadGasolina());
		
		a.cargarGasolina(11);
		System.out.println(a.getCantidadGasolina());
		
		a.cargarGasolina(40);
		System.out.println(a.getCantidadGasolina());
		
	}

}
