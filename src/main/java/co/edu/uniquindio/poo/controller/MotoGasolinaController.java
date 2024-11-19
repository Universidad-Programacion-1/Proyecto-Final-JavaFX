package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Consecionario;
import co.edu.uniquindio.poo.model.MotoGasolina;

public class MotoGasolinaController {

    Consecionario consecionario;

    public MotoGasolinaController(Consecionario consecionario) {
        this.consecionario = consecionario;
    }

    public boolean crearMotoGasolina(MotoGasolina motoGasolina) {
        return consecionario.agregarMotoGasolina(motoGasolina);
    }

    public Collection<MotoGasolina> obtenerListaMotoGasolina() {
        return consecionario.getMotoGasolinas();
    }

    public boolean eliminarMotoGasolina(String placa) {
       return consecionario.eliminarMotoGasolina(placa);
    }

    public boolean actualizarMotoGasolina(String placa, MotoGasolina motoGasolina) {
       return consecionario.actualizarMotoGasolina(placa, motoGasolina);
    }
}
