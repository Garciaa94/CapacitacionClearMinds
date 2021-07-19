/**
 * 
 */
package com.cmc.test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 11 jul. 2021
 */
public class TestMapas {
	public static void main(String[] args) {
		ArrayList<String> listas = new ArrayList<String>();
		listas.add("uno");
		String valor = listas.get(0);
		System.out.println(valor);
		HashMap<String, String> mapas = new HashMap<String, String>();
		mapas.put("a", "Adrian");
		mapas.put("b", "Peter");

		String resultado = mapas.get("b");
		System.out.println(resultado);
	}
}
