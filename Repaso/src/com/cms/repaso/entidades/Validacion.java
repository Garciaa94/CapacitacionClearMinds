/**
 * 
 */
package com.cms.repaso.entidades;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 9 jul. 2021
 */
public class Validacion {
	private int Monto;
	private boolean validar;

	public void Validacion(int monto) {
		this.Monto = monto;
		if (monto > 0) {
			validar = true;
			System.out.println(validar);
	/*	}else if(monto<0) {
			System.out.println("Error dato negativo");*/
		} else {
			validar = false;
			System.out.println(validar);
		}
	}

}
