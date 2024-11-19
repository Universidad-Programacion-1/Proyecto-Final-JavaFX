package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Empleado extends Persona implements IGestionarConsecionario{

   private Collection<Cliente> clientes;
   Cliente cliente;
    
    public Empleado(String id, String gmail, String telefono, String palabraSecreta) {
        super(id, gmail, telefono, palabraSecreta);
        this.clientes = new LinkedList<>();
    }

    @Override
    public boolean crearCliente(Cliente cliente) {
        boolean centinela = false;
        if (!verificarCliente(cliente.getId())) {
            clientes.add(cliente);
            centinela = true;
        }
        return centinela;
    }

    @Override
    public boolean eliminarCliente(String cedula) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(cedula)) {
                clientes.remove(cliente);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    @Override
    public boolean verificarCliente(String cedula) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    @Override
    public boolean actualizarCliente(String cedula, Cliente actualizado) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(cedula)) {
                cliente.setId(actualizado.getId());
                cliente.setGmail(actualizado.getGmail());
                cliente.setTelefono(actualizado.getTelefono());
                cliente.setPalabraSecreta(actualizado.getPalabraSecreta());
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    @Override
    public void crearAlquiler(Vehiculo vehiculo) {
        double total = (vehiculo.getPrecio() / 2) * 0.15; 
        vehiculo.setPrecio(total);
        cliente.getVehiculos().add(vehiculo);
    }

    @Override
    public void eliminarAlquiler(Vehiculo vehiculo) {
        cliente.getVehiculos().remove(vehiculo);
    }

    @Override
    public boolean crearCompra(Vehiculo vehiculo) {
        cliente.getVehiculos().add(vehiculo);
        return true;
    }

    @Override
    public boolean eliminarCompra(Vehiculo vehiculo) {
        cliente.getVehiculos().remove(vehiculo);
        return true;
    }

    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }
}
