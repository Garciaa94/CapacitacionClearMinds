/**
 * 
 */
package com.cmc.capacitacion.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmc.capacitacion.entidades.Persona;
import com.cmc.capacitacion.excepciones.ToxicaExcepcion;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 16 jul. 2021
 */
// Proivido Systeam.out.println en este nivel
public class ManejadorArchivos {
	private String rutaArchivo;
	private Logger logger = LogManager.getLogger(ManejadorArchivos.class);
	BufferedReader br = null;
	FileReader fileReader = null;
	String[] partes ;
	Persona p;

	public ManejadorArchivos(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;

	}

	public ArrayList<Persona> leer() throws ToxicaExcepcion {
		File f = new File(rutaArchivo);
		ArrayList<Persona> personas = new ArrayList<Persona>();
		try {

			fileReader = new FileReader(f);
			br = new BufferedReader(fileReader);
			String linea = "";// br.readLine(); //lee linea completa
			linea.split(linea);
			while ((linea = br.readLine()) != null) {
				partes = linea.split(","); 
				 p= new Persona(partes[0], partes[1], partes[2]);
				personas.add(p);
				// System.out.println(linea);
			}
			/*
			 * int leido = fileReader.read(); System.out.println("leido: " + leido); //lee
			 * cararter por caracter leido = fileReader.read(); System.out.println("leido: "
			 * + leido);//lee cararter por caracter leido = fileReader.read();
			 * System.out.println("leido: " + leido);
			 */ // lee cararter por caracter
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			logger.error("Error al leer el archivo ", e);
			throw new ToxicaExcepcion("No existe el archivo: " + rutaArchivo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			logger.error("Error al leer el archivo ", e);
			throw new ToxicaExcepcion("No se pudo leer el Archico: " + rutaArchivo);
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				logger.error("Error al cerrar el buffer", e);
			}
			try {
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				logger.error("Error al cerrar el archivo", e);
			}
		}
		return personas;
	}

}
