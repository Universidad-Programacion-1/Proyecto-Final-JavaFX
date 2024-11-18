package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.CamionetaElectrico;
import co.edu.uniquindio.poo.model.Consecionario;

public class CamionetaElectricoController {
     Consecionario consecionario;

    public CamionetaElectricoController(Consecionario consecionario) {
        this.consecionario = consecionario;
    }

    public boolean crearCamionetaElectrico(CamionetaElectrico cCamionetaElectrico) {
        return consecionario.agregarCamionetaElectrico(cCamionetaElectrico);
    }

    public Collection<CamionetaElectrico> obtenerListaCamionetaElectrico() {
        return consecionario.getCamionetaElectricos();
    }

    public boolean eliminarCamionetaElectrico(String placa) {
       return consecionario.eliminarCamionetaElectrico(placa);
    }

    public boolean actualizarCamionetaElectrico(String placa, CamionetaElectrico cCamionetaElectrico) {
       return consecionario.actualizarCamionetaElectrico(placa, cCamionetaElectrico);
    }
}
