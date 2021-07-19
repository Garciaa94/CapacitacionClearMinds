/**
 * 
 */
package clearminds.cuentas;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 9 jul. 2021
 */
public class Cuenta {
	private String Id;
	private String Tipo;
	private double Saldo;

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return Tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return Saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return Id;
	}

	/**
	 * Constructor
	 * 
	 * @param id
	 */
	
	public Cuenta(String id) {
		super();
		Id = id;
	}
	
	
	
	/**
	 * @param id
	 * @param tipo
	 * @param saldo
	 */
	public Cuenta(String id, String tipo, double saldo) {
		super();
		Id = id;
		Tipo = tipo;
		Saldo = saldo;
	}

	/*
	 *  n
	 * Metodo Imprimir
	 * 
	 * */
	public void imprimir() {
		System.out.println("**************************");
		System.out.println("CUENTA");
		System.out.println("**************************");
		System.err.println("Numero de cuenta:\t"+getId());
		System.err.println("Tipo:\t"+getTipo());
		System.err.println("Saldo:\t"+getSaldo());
		System.out.println("**************************");
	}

}
