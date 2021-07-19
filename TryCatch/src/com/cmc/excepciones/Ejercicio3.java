/**
 * 
 */
package com.cmc.excepciones;

import java.io.File;
import java.io.IOException;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 13 jul. 2021
 */
public class Ejercicio3 {

	public void metodo1() {
		File file = new File("archivo.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void metodo2() throws IOException {
		File file = new File("archivo.txt");

		file.createNewFile();

	}
	
	
	public void metodo3()  /*throws IOException */ { // pide que use "try catch" o use "throws IOException" para seguir propagando
		
	/*	try {
			metodo2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //*/

	}
}
