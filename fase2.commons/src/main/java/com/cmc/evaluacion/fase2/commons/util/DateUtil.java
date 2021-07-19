/**
 * 
 */
package com.cmc.evaluacion.fase2.commons.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  17 jul. 2021
 */
public class DateUtil {
private static final String PARSE =  "yyyy/dd/MM";
	
	public static Date convertir(String fecha) throws ParseException{
	  SimpleDateFormat formato = new SimpleDateFormat(PARSE);
	  Date fechaDate = null;
	  fechaDate = formato.parse(fecha);
	  if(fechaDate == null)
		  throw new ParseException("Error en la fecha",0);
        	
        return fechaDate;
	}

	/**
	 * @param fecha
	 * @return
	 */
	public static Date convertir1(String fecha) {
		// TODO Auto-generated method stub
		return null;
	}


}
