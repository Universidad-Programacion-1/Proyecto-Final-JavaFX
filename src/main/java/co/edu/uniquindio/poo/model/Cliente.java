package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.Collection;

public class Cliente extends Persona{

    private Collection<Vehiculo> vehiculos;

    public Cliente(String id, String gmail, String telefono, String palabraSecreta) {
        super(id, gmail, telefono, palabraSecreta);
        vehiculos = new ArrayList<>();
    }

    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Collection<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
