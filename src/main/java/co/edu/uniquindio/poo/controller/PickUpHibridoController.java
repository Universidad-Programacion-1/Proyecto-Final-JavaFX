package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Consecionario;
import co.edu.uniquindio.poo.model.PickUpHibrido;
import co.edu.uniquindio.poo.model.Vehiculo;

public class PickUpHibridoController {

    Consecionario consecionario;

    public PickUpHibridoController(Consecionario consecionario) {
        this.consecionario = consecionario;
    }

    public boolean crearPickUpHibrido(PickUpHibrido pickUpHibrido) {
        return consecionario.agregarPickUpHibrido(pickUpHibrido);
    }

    public Collection<PickUpHibrido> obtenerListaPickUpHibrido() {
        return consecionario.getPickUpHibridos();
    }

    public boolean eliminarPickUpHibrido(String placa) {
       return consecionario.eliminarPickUpHibrido(placa);
    }

    public boolean actualizarPickUpHibrido(String placa, PickUpHibrido pickUpHibrido) {
       return consecionario.actualizarPickUpHibrido(placa, pickUpHibrido);
    }

    public boolean comprarVehiculo(Vehiculo vehiculo){
        return consecionario.crearCompraMoto(vehiculo);
    }
}