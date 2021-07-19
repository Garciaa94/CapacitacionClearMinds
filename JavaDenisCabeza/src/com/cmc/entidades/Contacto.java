package com.cmc.entidades;

import java.util.ArrayList;

public class Contacto {
	private String cedula, nombre, apellido;
	private Direccion direccion;
	private ArrayList<Telefono>  telefonos;
	
	public Contacto(String cedula, String nombre, String apellido) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonos = new ArrayList<Telefono>();
	}

	//Getters & Setters
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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
	
	
	
	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public void imprimir() {
		System.out.println("***" + this.nombre
				+" "+ this.apellido + "***");
		if(this.direccion != null) {
			System.out.println("Dirección: "
					+ this.direccion.getCallePrincipal()
					+ " y " + this.direccion.getCalleSecundaria());
		}else {
			System.out.println("No tiene asociada una dirección");
		}
		
	}
	
	public void agregarTelefono(Telefono telefono) {
		this.telefonos.add(telefono);
	}
	
	public void mostrarTelefonos() {
		if(this.telefonos != null ) {
			Telefono tmp = null;
			for(int i=0; i<this.telefonos.size(); i++) {
				tmp = telefonos.get(i);
				if(tmp.getEstado().equals("C")) {
					System.out.println(tmp.getTipo() + " - " + tmp.getNumero());
				}
			}
		}
	}
	
	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> recuperados = new ArrayList<Telefono>();
		if(this.telefonos != null ) {
			Telefono tmp = null;
			for(int i=0; i<this.telefonos.size(); i++) {
				tmp = telefonos.get(i);
				if(tmp.getEstado().equals("E")) {
					recuperados.add(tmp);
				}
			}
		}
		return recuperados;
	}
}
