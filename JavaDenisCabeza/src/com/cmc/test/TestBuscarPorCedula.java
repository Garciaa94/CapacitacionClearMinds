package com.cmc.test;

import com.cmc.evaluacion.Contacto;
import com.cmc.evaluacion.Directorio;


public class TestBuscarPorCedula {
	public static void main(String[] args) {
		Directorio directorio = new Directorio();
		directorio.agregarContacto(new Contacto("1234","Armando","Broncas"));
		directorio.agregarContacto(new Contacto("3489","Patricia","Fernandez"));
		directorio.agregarContacto(new Contacto("7895","Beatriz","Pinzon"));
		directorio.agregarContacto(new Contacto("3314","Pablo","Montenegro"));
		
		Contacto ct=directorio.buscarPorCedula("7895");
		if(ct!=null){
			System.out.println("Cliente encontrado: "+ct.getNombre());
		}else{
			System.out.println("No existe cliente con cédula: 7895");
		}
		
		Contacto ct2=directorio.buscarPorCedula("3895");
		if(ct2!=null){
			System.out.println("Cliente encontrado: "+ct2.getNombre());
		}else{
			System.out.println("No existe cliente con cédula: 3895");
		}
	}
}
