package com.cmc.evaluacion;

public class Estudiante {
	private String nombre;
	private String apellido;
	private Direccion direccion;
	
	public Estudiante(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public void imprimir() {
		System.out.println("-----------------");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		System.out.println("Calle Principal: " + this.direccion.getCallePrincipal());
		System.out.println("Calle Secundaria: " + this.direccion.getCalleSecundaria());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	
	
	
}
