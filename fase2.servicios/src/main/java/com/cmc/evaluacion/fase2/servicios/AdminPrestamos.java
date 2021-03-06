package com.cmc.evaluacion.fase2.servicios;


import java.io.*;

import com.cmc.evaluacion.fase2.commons.util.DateUtil;
import com.cmc.evaluacion.fase2.commons.util.TipoPrestamo;
import com.cmc.evaluacion.fase2.entidades.Cartera;
import com.cmc.evaluacion.fase2.entidades.Prestamo;
import com.cmc.exepciones.EvaluacionException;




public class AdminPrestamos {
    public void colocarPrestamos(String path, Cartera cartera) throws EvaluacionException{
        File file = new File(path);
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String linea;
            while ((linea = br.readLine()) != null) {
                armarPrestamo(linea,cartera);
            }
            br.close();
        }catch (FileNotFoundException ex){
            throw new EvaluacionException("Archivo no encontrado");
        }catch (IOException ex){
            throw new EvaluacionException("Error en inesperado del archivo: " +ex.getMessage());
        }
    }

    private void armarPrestamo(String linea, Cartera cartera){
        try {
            String[] info = linea.split("-");
            Prestamo prestamo = new Prestamo(info[1],info[0]);
            if(TipoPrestamo.HIPOTECARIO.equals(info[1].charAt(0)+"")){
                prestamo.setTipo(TipoPrestamo.HIPOTECARIO);
            }
            if(TipoPrestamo.QUIROGRAFARIO.equals(info[1].charAt(0)+"")){
                prestamo.setTipo(TipoPrestamo.QUIROGRAFARIO);
            }
            if(TipoPrestamo.OTRO.equals(info[1].charAt(0)+"")){
                prestamo.setTipo(TipoPrestamo.OTRO);
            }
            prestamo.setFecha(DateUtil.convertir(info[2]));
            prestamo.setMonto(Double.parseDouble(info[3]));
            cartera.colocarPrestamo(prestamo);
        }catch (Exception ex){
            System.out.println("Error al tratar de agregar prestamo "+linea+"; "+ex.getStackTrace());
        }
    }
}
