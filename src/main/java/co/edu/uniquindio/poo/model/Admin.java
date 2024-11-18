package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.Collection;

public class Admin extends Persona implements IGestionarConsecionario{

    private Collection<Admin> admins;
    Cliente clientes;
    Empleado empleados;

    public Admin(String id, String gmail, String telefono, String palabraSecreta, int tipoPersona) {
        super(id, gmail, telefono, palabraSecreta, tipoPersona);
        admins = new ArrayList<>();
    }

    public boolean crearEmpleado(Empleado empleado) {
        boolean centinela = false;
        if (!verificarEmpleado(empleado.getId())) {
            empleados.getEmpleados().add(empleado);
            centinela = true;
        }
        return centinela;
    }

    public boolean eliminarEmpleado(String cedula) {
        boolean centinela = false;
        for (Empleado empleado : empleados.getEmpleados()) {
            if (empleado.getId().equals(cedula)) {
                empleados.getEmpleados().remove(empleado);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean verificarEmpleado(String cedula) {
        boolean centinela = false;
        for (Empleado empleado : empleados.getEmpleados()) {
            if (empleado.getId().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean actualizarEmpleado(String cedula, Empleado actualizado) {
        boolean centinela = false;
        for (Empleado empleado : empleados.getEmpleados()) {
            if (empleado.getId().equals(cedula)) {
                empleado.setId(actualizado.getId());
                empleado.setGmail(actualizado.getGmail());
                empleado.setTelefono(actualizado.getTelefono());
                empleado.setPalabraSecreta(actualizado.getPalabraSecreta());
                centinela = true;
                break;
            }
        }
        return centinela;
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearAlquiler'");
    }

    @Override
    public void eliminarAlquiler(Vehiculo vehiculo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarAlquiler'");
    }

    public Collection<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(Collection<Admin> admins) {
        this.admins = admins;
    }

    @Override
    public boolean crearCompra(Vehiculo vehiculo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearCompra'");
    }

    @Override
    public boolean eliminarCompra(Vehiculo vehiculo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarCompra'");
    }
}
