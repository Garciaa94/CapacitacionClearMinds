/**
 * 
 */
package com.cmc.log;

import org.apache.logging.log4j.LogManager;
//
import org.apache.logging.log4j.Logger;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  13 jul. 2021
 */
public class Admin {
	private static Logger logger = LogManager.getLogger(Admin.class);
	
	public void agregar() {
		logger.info("Mensaje de Info");
		logger.debug("Bienvenidos");
		System.out.println("lol");
	}

}
