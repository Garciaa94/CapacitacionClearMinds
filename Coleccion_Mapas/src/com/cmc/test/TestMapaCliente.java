/**
 * 
 */
package com.cmc.test;

import java.util.HashMap;

import com.cmc.entidadesmapas.Cliente;


/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  11 jul. 2021
 */
public class TestMapaCliente {
	public static void main(String[] args) {
		HashMap<String, Cliente> mapaCliente = new HashMap<String, Cliente>();
		mapaCliente.put("0804347392", new Cliente("0804347392", "Adrian"));
		Cliente c=mapaCliente.get("0804347392");
		System.out.println(c);
	}

}
