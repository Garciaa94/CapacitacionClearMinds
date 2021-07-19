/**
 * 
 */
package com.cmc.excepciones;



/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  15 jul. 2021
 */
public class Cuenta {
	public void depositar(double monto) throws CheckedExcepcion{
		
		if (monto<0) {
			throw new CheckedExcepcion("Monto incorrecto");
		}
	}
	
public void retirar(double monto) {
		
		if (monto<0) { 
			throw new UndCheckedExcepcion("Monto incorrecto");
		}
	}

}
