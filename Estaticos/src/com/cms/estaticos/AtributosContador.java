/**
 * 
 */
package com.cms.estaticos;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 13 jul. 2021
 */
public class AtributosContador {
	private int contadorNormal;
	private static int ContadorEstatico; // pertenece a la clase no al objeto
	private String nombre;
	
	public AtributosContador(String nombre) {
		this.nombre=nombre;
	}

	public void incrementar() {
		contadorNormal = contadorNormal + 1;
		ContadorEstatico = ContadorEstatico + 1;
	}
public void imprimir() {
	System.out.println(nombre+" Contador normal: "+contadorNormal);
	System.out.println(nombre+" Contador estatico: "+ContadorEstatico);
}
}
