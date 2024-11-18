package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Consecionario;
import co.edu.uniquindio.poo.model.SedanElectrico;

public class SedanElectricoController {
    Consecionario consecionario;

    public SedanElectricoController(Consecionario consecionario) {
        this.consecionario = consecionario;
    }

    public boolean crearSedanElectrico(SedanElectrico cSedanElectrico) {
        return consecionario.agregarSedanElectrico(cSedanElectrico);
    }

    public Collection<SedanElectrico> obtenerListaSedanElectrico() {
        return consecionario.getSedanElectricos();
    }

    public boolean eliminarSedanElectrico(String placa) {
       return consecionario.eliminarSedanElectrico(placa);
    }

    public boolean actualizarSedanElectrico(String placa, SedanElectrico cSedanElectrico) {
       return consecionario.actualizarSedanElectrico(placa, cSedanElectrico);
    }
}

