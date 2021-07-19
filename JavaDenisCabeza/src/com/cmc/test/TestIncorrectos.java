package com.cmc.test;

import java.util.ArrayList;

import com.cmc.evaluacion.Contacto;
import com.cmc.evaluacion.Telefono;

public class TestIncorrectos {

	public static void main(String[] args) {
		Contacto contacto=new Contacto("1714616123","Carmen","Estrada");
		contacto.agregarTelefono(new Telefono("0992920306", "Convencional"));
		contacto.agregarTelefono(new Telefono("0992920306", null));
		contacto.agregarTelefono(new Telefono("0992920306", "Movil"));
		contacto.agregarTelefono(new Telefono("2375467", "convencional"));
		
		ArrayList<Telefono> telefonos=contacto.recuperarIncorrectos();
		System.out.println("Incorrectos: "+telefonos.size());
		
	}

}
