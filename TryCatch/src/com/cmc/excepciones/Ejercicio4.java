/**
 * 
 */
package com.cmc.excepciones;

import java.io.File;
import java.io.IOException;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 15 jul. 2021
 */

public class Ejercicio4 {
	// public Cliente Buscar(String Cedula) throws Exception {
	public static void main(String[] args) {
		File file = new File("archivo.txt");
		try {
			file.createNewFile();
			String[] a = new String[2];
			a[2] = "abc";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error del sistema");
		}

	}
}
