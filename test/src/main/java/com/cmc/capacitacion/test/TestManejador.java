/**
 * 
 */
package com.cmc.capacitacion.test;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmc.capacitacion.archivos.ManejadorArchivos;
import com.cmc.capacitacion.entidades.Persona;
import com.cmc.capacitacion.excepciones.ToxicaExcepcion;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  16 jul. 2021
 */
public class TestManejador {

	/**
	 * @param args
	 */
	private static Logger logger = LogManager.getLogger(ManejadorArchivos.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManejadorArchivos ma= new ManejadorArchivos("C:\\Users\\garci\\Documents\\ejemplo.txt");
		
		try {
			ArrayList<Persona> personas=ma.leer();
			System.out.println(personas);
		} catch (ToxicaExcepcion e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			logger.error("No existe el archivo: ",e);
			System.out.println(e.getMessage());
		}catch (Exception e) {
			logger.error("EL sistema esta dormido: ",e);
			System.out.println("EL sistema esta dormido: "+e);
		}

	}

}
