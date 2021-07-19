package com.cmc.test;

import com.cmc.evaluacion.Contacto;
import com.cmc.evaluacion.Directorio;

public class TestUltimaModificacion {
	public static void main(String[] args) {
		Directorio directorio = new Directorio();
		directorio.agregarContacto(new Contacto("1234","Armando","Broncas"));
		directorio.agregarContacto(new Contacto("3489","Patricia","Fernandez"));
		directorio.agregarContacto(new Contacto("7895","Beatriz","Pinzon"));
		directorio.agregarContacto(new Contacto("3314","Pablo","Montenegro"));
		
		System.out.println("Ultima modificación: "+directorio.consultarUltimaModificacion());
	}
}
