/**
 * 
 */
package com.cmc.evaluacion.fase2.entidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date 17 jul. 2021
 */
public class Cartera {
    ArrayList<Cliente> clientes = new ArrayList<>();
    HashMap<String, ArrayList<Pago>> pagos = new HashMap<>();

    public Cliente buscarCliente(String cedula) {
        Optional<Cliente> cliente = clientes.stream().parallel()
                .filter(current -> cedula.equals(current.getCedula())).findAny();

        return cliente.isPresent()?cliente.get():null;
    }

    public boolean agregarCliente(Cliente cliente){
        Optional<Cliente> existeCliente = clientes.stream().parallel()
                .filter(current -> cliente.getCedula().equals(current.getCedula())).findAny();
        if(existeCliente.isPresent()){
            return false;
        }else{
            clientes.add(cliente);
            return true;
        }
    }

    public void colocarPrestamo(Prestamo prestamo){
        Cliente cliente = buscarCliente(prestamo.getCedulaCliente());
        if(cliente!=null){
            cliente.agregarPrestamo(prestamo);
        }
    }

    public void agregarPago(Pago pago){
        if(pagos.containsKey(pago.getNumeroPrestamo())){
            pagos.get(pago.getNumeroPrestamo()).add(pago);
        }else{
            ArrayList<Pago> nuevoPago = new ArrayList<>();
            nuevoPago.add(pago);
            pagos.put(pago.getNumeroPrestamo(), nuevoPago);
        }
    }

    public ArrayList<Balance> calcularBalances(){
        ArrayList<Balance> balances = new ArrayList<>();
        for(Cliente cliente:clientes){
            Balance balance = new Balance();
            double deuda = 0;
            double valorPagado = 0;
            for(Prestamo prestamo:cliente.getPrestamos()){
                deuda = deuda + prestamo.getMonto();
                ArrayList<Pago> pagos = consultarPagos(prestamo.getNumero());
                for(Pago pago:pagos){
                    valorPagado = valorPagado+pago.getMonto();
                }
            }
            balance.setValorPrestamos(deuda);
            balance.setValorPagado(valorPagado);
            balance.setSaldo(deuda-valorPagado);
            balances.add(balance);

        }
        return balances;
    }

    public ArrayList<Pago> consultarPagos(String id){
        if(pagos.containsKey(id)){
            return pagos.get(id);
        }
        return new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    @Override
    public String toString() {
        return "Cartera{" +
                "clientes=" + clientes +
                '}';
    }
}
