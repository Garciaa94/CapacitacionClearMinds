/**
 * 
 */
package com.cmc.test;

import com.cms.estaticos.AtributosContador;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 13 jul. 2021
 */
public class AtributoContadorStatico {
	public static void main(String[] args) {
		AtributosContador c = new AtributosContador("objeto1");
		c.incrementar();
		c.imprimir();
		AtributosContador c2 = new AtributosContador("objeto2");
		c2.incrementar();
		c2.imprimir();
	}
}