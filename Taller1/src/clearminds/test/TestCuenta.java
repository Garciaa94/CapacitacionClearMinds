/**
 * 
 */
package clearminds.test;

import clearminds.cuentas.Cuenta;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 9 jul. 2021
 */
public class TestCuenta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta1 = new Cuenta("03476");

		cuenta1.setSaldo(675);
		cuenta1.setTipo("C");
		cuenta1.setSaldo(444);
		cuenta1.imprimir();// llamado de metodo imprimir
		
		
		Cuenta cuenta2= new Cuenta("01476","B",98);
		cuenta2.imprimir();// llamado de metodo imprimir
		
		Cuenta cuenta3= new Cuenta("03476");
		cuenta3.setTipo("G"); // modificacion de Tipo de cuenta con objeto cuenta3
		
		cuenta3.imprimir();
		
		Cuenta cuenta4= new Cuenta("0987","A",10);
		cuenta4.imprimir();// llamado de metodo imprimir
	}


}

