/**
 * 
 */
package com.cmc.entidades;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  10 jul. 2021
 */
public class Direccion {
	private String callePrincipal;
	private String calleSecundaria;
	private String numero;
	/**
	 * @return the callePrincipal
	 */
	public String getCallePrincipal() {
		return callePrincipal;
	}
	/**
	 * @param callePrincipal the callePrincipal to set
	 */
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}
	/**
	 * @return the calleSecundaria
	 */
	public String getCalleSecundaria() {
		return calleSecundaria;
	}
	/**
	 * @param calleSecundaria the calleSecundaria to set
	 */
	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}
	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	/**
	 * @param callePrincipal
	 * @param calleSecundaria
	 * @param numero
	 */
	public Direccion(String callePrincipal, String calleSecundaria, String numero) {
		//super();
		this.callePrincipal = callePrincipal;
		this.calleSecundaria = calleSecundaria;
		this.numero = numero;
	}
	public Direccion() {
		
	}

}
