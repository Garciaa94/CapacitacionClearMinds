/**
 * 
 */
package com.cmc.direccion.entidades;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 13 jul. 2021
 */
public class AdminTelefono {
	public Telefono activarMensajeria(Telefono a) {
		if (a.getOperadora() == null) {
			a.setTieneWhatsapp(true);
			System.out.println("Tiene operadora");
			
		}
		else {
			a.setTieneWhatsapp(true);
			System.out.println("No Tiene operadora");
		}
		return a;
	}
}