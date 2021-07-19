/**
 * 
 */
package controlflujo;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 9 jul. 2021
 */
public class Auto {
	private int CantidadGasolina;
	private int CapacidadTante;

	public Auto(int capacidadTanque) {
		if (capacidadTanque <= 0) {
			System.out.println("no se aceptan valores negativos");

		} else
			this.CapacidadTante = capacidadTanque; // setear la capacidad del tanque
	}

	public void cargarGasolina(int cantidad) {
		if (CantidadGasolina + cantidad > CapacidadTante) {
			System.out.println("Exede la cantidad del tanque");
		} else {
			CantidadGasolina = CantidadGasolina + cantidad;
		}

	}

	/**
	 * @return the cantidadGasolina
	 */
	public int getCantidadGasolina() {
		return CantidadGasolina;
	}

	/**
	 * @return the capacidadTante
	 */
	public int getCapacidadTante() {
		return CapacidadTante;
	}
	
}
