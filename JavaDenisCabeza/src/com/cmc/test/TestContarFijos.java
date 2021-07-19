package com.cmc.test;

import com.cmc.evaluacion.Contacto;
import com.cmc.evaluacion.Direccion;
import com.cmc.evaluacion.Directorio;
import com.cmc.evaluacion.Telefono;

public class TestContarFijos {
	public static void main(String[] args) {
		Directorio directorio = new Directorio();
		Contacto c1=new Contacto("1234","Armando","Broncas");
		c1.setDireccion(new Direccion("ABC", "XYZ"));
		c1.agregarTelefono(new Telefono("0992920306","Movil"));
		c1.agregarTelefono(new Telefono("1234561","Convencional"));
		
		Contacto c2=new Contacto("234","Mark","Anthony");
		c2.setDireccion(new Direccion("ABC", "XYZ"));
		directorio.agregarContacto(c2);
		c2.agregarTelefono(new Telefono("099292030","Movil"));
		c2.agregarTelefono(new Telefono("1234560","CONVENCIONAL"));
	
		Contacto c3=new Contacto("9897","Nicolas","Mora");
		c3.setDireccion(new Direccion("ABC", "XYZ"));
		directorio.agregarContacto(c2);
		c3.agregarTelefono(new Telefono("5432231","Fijo"));
		c3.agregarTelefono(new Telefono("0992920307","Movil"));
		
		directorio.agregarContacto(c1);
		directorio.agregarContacto(c2);
		directorio.agregarContacto(c3);
		
		
		System.out.println("Fijos:"+directorio.contarFijos());
	}
}
