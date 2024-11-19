package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.Consecionario;
import co.edu.uniquindio.poo.model.VanGasolina;
import co.edu.uniquindio.poo.model.Vehiculo;

public class VanGasolinaController {

    Consecionario consecionario;

    public VanGasolinaController(Consecionario consecionario) {
        this.consecionario = consecionario;
    }

    public boolean crearVanGasolina(VanGasolina vanGasolina) {
        return consecionario.agregarVanGasolina(vanGasolina);
    }

    public Collection<VanGasolina> obtenerListaVanGasolina() {
        return consecionario.getVanGasolinas();
    }

    public boolean eliminarVanGasolina(String placa) {
       return consecionario.eliminarVanGasolina(placa);
    }

    public boolean actualizarVanGasolina(String placa, VanGasolina vanGasolina) {
       return consecionario.actualizarVanGasolina(placa, vanGasolina);
    }
    
    public boolean comprarVehiculo(Vehiculo vehiculo){
        return consecionario.crearCompraMoto(vehiculo);
    }
}
