package com.cmc.test;

import com.cmc.evaluacion.Contacto;
import com.cmc.evaluacion.Direccion;
import com.cmc.evaluacion.Directorio;

public class TestDepurar {
	public static void main(String[] args) {
		Directorio directorio = new Directorio();
		Contacto c1=new Contacto("1234","Armando","Broncas");
		c1.setDireccion(new Direccion("ABC", "XYZ"));
		directorio.agregarContacto(c1);
		directorio.agregarContacto(new Contacto("3489","Patricia","Fernandez"));
		directorio.agregarContacto(new Contacto("7895","Beatriz","Pinzon"));
		directorio.agregarContacto(new Contacto("3314","Pablo","Montenegro"));
		Contacto c2=new Contacto("234","Mark","Anthony");
		c2.setDireccion(new Direccion("ABC", "XYZ"));
		directorio.agregarContacto(c2);
	
		directorio.depurar();
		
		System.out.println("Correctos:"+directorio.getCorrectos().size());
		System.out.println("Incorrectos:"+directorio.getIncorrectos().size());
		System.out.println("Contactos:"+directorio.getContactos().size());
		
		
	}
}
