package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Consecionario;
import co.edu.uniquindio.poo.model.Vehiculo;

public class MenuClienteController {
    
    Consecionario consecionario;

    public MenuClienteController(Consecionario consecionario) {
        this.consecionario = consecionario;
    }

    public Collection<Vehiculo> obtenerListaVehiculo(){
        return consecionario.getVehiculos();
    }
}
