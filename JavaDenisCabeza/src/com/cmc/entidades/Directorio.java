package com.cmc.entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos, correctos, incorrectos;
	private Date fechaModificacion, ultimaModificacion;
	
	private String pattern;
	private SimpleDateFormat simpleDateFormat;
	
	public Directorio() {
		//super();
		this.contactos = new ArrayList<Contacto>();
		this.correctos = new ArrayList<Contacto>();
		this.incorrectos = new ArrayList<Contacto>();
		this.ultimaModificacion = new Date();
		this.pattern = "yyyy/MM/dd HH:mm:ss";
		this.simpleDateFormat  = new SimpleDateFormat(pattern);
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	
	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	public boolean agregarContacto(Contacto contacto) {
		if(buscarPorCedula(contacto.getCedula()) == null) {
			this.contactos.add(contacto);
			return true;
		}else {
			return false;
		}
		
	}
	
	public Contacto buscarPorCedula(String cedula) {
		if(this.contactos != null ) {
			Contacto tmp = null;
			for(int i=0; i<this.contactos.size(); i++) {
				tmp = contactos.get(i);
				if(tmp.getCedula().equals(cedula)) {
					return tmp;
				}
			}
			return null;
		}
		return null;
	}
	
	public String consultarUltimaModificacion() {
		String fecha = simpleDateFormat.format(this.ultimaModificacion);
		return fecha;
	}
	
	public int contarPerdidos() {
		int contar = 0;
		if(this.contactos != null ) {
			Contacto tmp = null;
			for(int i=0; i<this.contactos.size(); i++) {
				tmp = contactos.get(i);
				if(tmp.getDireccion() == null) {
					contar++;
				}
			}
		}
		return contar;
	}
	
	public int contarFijos() {
		int contar = 0;
		if(this.contactos != null ) {
			Contacto tmp = null;
			for(int i=0; i<this.contactos.size(); i++) {
				tmp = contactos.get(i);
				Telefono tmpTelefonos = null;
				
				for(int j=0; j<tmp.getTelefonos().size(); j++) {
					tmpTelefonos = tmp.getTelefonos().get(j);
					if(tmpTelefonos.getTipo().equalsIgnoreCase("convencional") && 
							tmpTelefonos.getEstado().equals("C")) {
						contar++;
				}	}
			}
		}
		return contar;
	}
	
	public void depurar() {
		if(this.contactos != null ) {
			Contacto tmp = null;
			for(int i=0; i<this.contactos.size(); i++) {
				tmp = contactos.get(i);
				if(tmp.getDireccion() != null) {
					this.correctos.add(tmp);
				}else {
					this.incorrectos.add(tmp);
				}
			}
			this.contactos.clear();
		}
	}
}
