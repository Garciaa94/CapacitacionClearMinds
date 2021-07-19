/**
 * 
 */
package com.cmc.evaluacion.fase2.entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 17 jul. 2021
 */
public class Pago {
	private String NumeroPrestamo;
	private Date FechaPago;
	private double Monto;
	/**
	 * @param numeroPrestamo
	 */
	public Pago(String numeroPrestamo) {
		super();
		NumeroPrestamo = numeroPrestamo;
	}
	/**
	 * @return the numeroPrestamo
	 */
	public String getNumeroPrestamo() {
		return NumeroPrestamo;
	}
	/**
	 * @param numeroPrestamo the numeroPrestamo to set
	 */
	public void setNumeroPrestamo(String numeroPrestamo) {
		NumeroPrestamo = numeroPrestamo;
	}
	/**
	 * @return the fechaPago
	 */
	public Date getFechaPago() {
		return FechaPago;
	}
	/**
	 * @param fechaPago the fechaPago to set
	 */
	public void setFechaPago(Date fechaPago) {
		FechaPago = fechaPago;
	}
	/**
	 * @return the monto
	 */
	public double getMonto() {
		return Monto;
	}
	/**
	 * @param monto the monto to set
	 */
	public void setMonto(double monto) {
		Monto = monto;
	}
	
	
	
}
