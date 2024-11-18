package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;

public class Empleado extends Persona implements IGestionarConsecionario{

    private Collection<Empleado> empleados;
    Cliente clientes;
    
    public Empleado(String id, String gmail, String telefono, String palabraSecreta, int tipoPersona) {
        super(id, gmail, telefono, palabraSecreta, tipoPersona);
        empleados=new LinkedList<>();
    }

    @Override
    public boolean crearCliente(Cliente cliente) {
        boolean centinela = false;
        if (!verificarCliente(cliente.getId())) {
            clientes.getClientes().add(cliente);
            centinela = true;
        }
        return centinela;
    }

    @Override
    public boolean eliminarCliente(String cedula) {
        boolean centinela = false;
        for (Cliente cliente : clientes.getClientes()) {
            if (cliente.getId().equals(cedula)) {
                clientes.getClientes().remove(cliente);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    @Override
    public boolean verificarCliente(String cedula) {
        boolean centinela = false;
        for (Cliente cliente : clientes.getClientes()) {
            if (cliente.getId().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    @Override
    public boolean actualizarCliente(String cedula, Cliente actualizado) {
        boolean centinela = false;
        for (Cliente cliente : clientes.getClientes()) {
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
        clientes.getVehiculos().add(vehiculo);
    }

    @Override
    public void eliminarAlquiler(Vehiculo vehiculo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarAlquiler'");
    }

    @Override
    public boolean crearCompra(Vehiculo vehiculo) {
        clientes.getVehiculos().add(vehiculo);
        return true;
    }

    @Override
    public boolean eliminarCompra(Vehiculo vehiculo) {
        clientes.getVehiculos().remove(vehiculo);
        return true;
    }

    

    public Collection<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Collection<Empleado> empleados) {
        this.empleados = empleados;
    }
}
