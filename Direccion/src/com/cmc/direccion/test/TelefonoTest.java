/**
 * 
 */
package com.cmc.direccion.test;

import com.cmc.direccion.entidades.AdminTelefono;
import com.cmc.direccion.entidades.Telefono;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 13 jul. 2021
 */
public class TelefonoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf = new Telefono("", "789545", 58);
		AdminTelefono admT = new AdminTelefono();
		System.out.println("Informacion de este telefono es;");
		System.out.println(telf.toString()+" Tiene WhatSapp "+admT.toString());
	}

}
