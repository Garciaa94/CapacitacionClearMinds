package com.cmc.evaluacion.fase2.servicios;

import com.cmc.evaluacion.fase2.entidades.Cartera;
import com.cmc.evaluacion.fase2.entidades.Cliente;
import com.cmc.exepciones.EvaluacionException;

import java.io.*;

public class AdminClientes {
    public static Cartera armarCartera(String rutaArchivo) throws EvaluacionException{
        File file = new File(rutaArchivo);
        Cartera cartera = new Cartera();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String linea;
            while ((linea = br.readLine()) != null) {
                armarCliente(linea,cartera);
            }
            br.close();
        }catch (FileNotFoundException ex){
            throw new EvaluacionException("Archivo no encontrado");
        }catch (IOException ex){
            throw new EvaluacionException("Error en inesperado del archivo: " +ex.getMessage());
        }
        return cartera;
    }

    private static void armarCliente(String linea, Cartera cartera){
        try {
            String[] info = linea.split(",");
            cartera.agregarCliente(new Cliente(info[0],info[1],info[2]));
        }catch (IndexOutOfBoundsException ex){
            System.out.println("Error al tratar de agregar cliente "+linea+"; "+ex.getStackTrace());
        }

    }
}
