package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.BusDiesel;
import co.edu.uniquindio.poo.model.Consecionario;

public class BusDieselController {
     Consecionario consecionario;

    void publicBusDieselController(Consecionario consecionario) {
        this.consecionario = consecionario;
    }

    public boolean crearBusDiesel(BusDiesel cBusDiesel) {
        return consecionario.agregarBusDiesel(cBusDiesel);
    }

    public Collection<BusDiesel> obtenerListaBusDiesel() {
        return consecionario.getBusDiesels();
    }

    public boolean eliminarBusDiesel(String placa) {
       return consecionario.eliminarBusDiesel(placa);
    }

    public boolean actualizarBusDiesel(String placa,BusDiesel cBusDiesel) {
       return consecionario.actualizarBusDiesel(placa, cBusDiesel);
    }
}


