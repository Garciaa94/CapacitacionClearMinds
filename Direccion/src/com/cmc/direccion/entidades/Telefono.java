/**
 * 
 */
package com.cmc.direccion.entidades;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  13 jul. 2021
 */
public class Telefono {
	private String Operadora;
	private String numero; 
	private int codigo;
	private boolean tieneWhatsapp ;
	/**
	 * @param operadora
	 * @param numero
	 * @param codigo
	 */
	public Telefono(String operadora, String numero, int codigo) {
		super();
		Operadora = operadora;
		this.numero = numero;
		this.codigo = codigo;
	}
	/**
	 * @return the operadora
	 */
	public String getOperadora() {
		return Operadora;
	}
	/**
	 * @param operadora the operadora to set
	 */
	public void setOperadora(String operadora) {
		Operadora = operadora;
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
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the tieneWhatsapp
	 */
	public boolean isTieneWhatsapp() {
		return tieneWhatsapp;
	}
	/**
	 * @param tieneWhatsapp the tieneWhatsapp to set
	 */
	public void setTieneWhatsapp(boolean tieneWhatsapp) {
		
		this.tieneWhatsapp = tieneWhatsapp;
	}
	@Override
	public String toString() {
		return "Telefono [Operadora=" + Operadora + ", numero=" + numero + ", codigo=" + codigo + "]";
	}
	/**
	 * @return
	 */
	/*public boolean getTieneWhatsapp() {
		// TODO Auto-generated method stub
		if(this.Operadora==null) {
			setTieneWhatsapp(false);
			return false;
		}else{
			setTieneWhatsapp(true);
			return true;
		}
		
	}*/
	
	
}
