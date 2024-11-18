package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.CamionDiesel;
import co.edu.uniquindio.poo.model.Consecionario;

public class CamionDieselController {
     Consecionario consecionario;

    void publicCamionDieselController(Consecionario consecionario) {
        this.consecionario = consecionario;
    }

    public boolean crearCamionDiesel(CamionDiesel cCamionDiesel) {
        return consecionario.agregarCamionDiesel(cCamionDiesel);
    }

    public Collection<CamionDiesel> obtenerListaCamionDiesel() {
        return consecionario.getCamionDiesels();
    }

    public boolean eliminarCamionDiesel(String placa) {
       return consecionario.eliminarCamionDiesel(placa);
    }

    public boolean actualizarCamionDiesel(String placa,CamionDiesel cCamionDiesel) {
       return consecionario.actualizarCamionDiesel(placa, cCamionDiesel);
    }
}


