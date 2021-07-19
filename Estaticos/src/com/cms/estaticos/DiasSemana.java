/**
 * 
 */
package com.cms.estaticos;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  13 jul. 2021
 */
public class DiasSemana {
	private int lunes =0; //privada
	public int martes =1; // publica
	private final int MIERCOLES =2; // constante
	public final int JUEVES=3;
	private int viernes=4;
	private int sabado =5;
	private int domingo =6;

	public void modificar() {
		lunes = 5;
	}
}
