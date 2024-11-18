package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.Collection;

public class Cliente extends Persona{

    private Collection<Cliente> clientes;
    private Collection<Vehiculo> vehiculos;

    public Cliente(String id, String gmail, String telefono, String palabraSecreta, int tipoPersona) {
        super(id, gmail, telefono, palabraSecreta, tipoPersona);
        clientes = new ArrayList<>();
        vehiculos = new ArrayList<>();
    }

    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Collection<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
