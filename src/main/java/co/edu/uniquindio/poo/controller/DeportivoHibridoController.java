package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Consecionario;
import co.edu.uniquindio.poo.model.DeportivoHibrido;
import co.edu.uniquindio.poo.model.Vehiculo;

public class DeportivoHibridoController {

    Consecionario consecionario;

    public DeportivoHibridoController(Consecionario consecionario) {
        this.consecionario = consecionario;
    }

    public boolean crearDeportivoHibrido(DeportivoHibrido deportivoHibrido) {
        return consecionario.agregarDeportivoHibrido(deportivoHibrido);
    }

    public Collection<DeportivoHibrido> obtenerListaDeportivoHibrido() {
        return consecionario.getDeportivoHibridos();
    }

    public boolean eliminarDeportivoHibrido(String placa) {
       return consecionario.eliminarDeportivoHibrido(placa);
    }

    public boolean actualizarDeportivoHibrido(String placa, DeportivoHibrido deportivoHibrido) {
       return consecionario.actualizarDeportivoHibrido(placa, deportivoHibrido);
    }

    public boolean comprarVehiculo(Vehiculo vehiculo){
        return consecionario.crearCompraMoto(vehiculo);
    }
}
