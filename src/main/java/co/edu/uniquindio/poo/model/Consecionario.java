package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;

public class Consecionario {
    
    private String nombre;
    Cliente clientes;
    Empleado empleados;
    Admin admins;

    public Consecionario(String nombre) {
        this.nombre = nombre;
        //personas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean crearAdmin(Admin admin) {
        boolean centinela = false;
        if (!verificarAdmin(admin.getId())) {
            admins.getAdmins().add(admin);
            centinela = true;
        }
        return centinela;
    }

    public boolean eliminarAdmin(String cedula) {
        boolean centinela = false;
        for (Admin admin : admins.getAdmins()) {
            if (admin.getId().equals(cedula)) {
                admins.getAdmins().remove(admin);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean verificarAdmin(String cedula) {
        boolean centinela = false;
        for (Admin admin : admins.getAdmins()) {
            if (admin.getId().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean actualizarAdmin(String cedula, Admin actualizado) {
        boolean centinela = false;
        for (Admin admin : admins.getAdmins()) {
            if (admin.getId().equals(cedula)) {
                admin.setId(actualizado.getId());
                admin.setGmail(actualizado.getGmail());
                admin.setTelefono(actualizado.getTelefono());
                admin.setPalabraSecreta(actualizado.getPalabraSecreta());
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean palabraSecreta(String palabra){
        boolean centinela=false;
        if (clientes.getClientes().stream().anyMatch(cliente -> cliente.getPalabraSecreta().equals(palabra))) {
            centinela = true;
        }else if (empleados.getEmpleados().stream().anyMatch(empleado -> empleado.getPalabraSecreta().equals(palabra))) {
            centinela = true;
        }else if (admins.getAdmins().stream().anyMatch(admin -> admin.getPalabraSecreta().equals(palabra))) {
            centinela = true;
        }
        return centinela;
    }

    public int login(String correo, String contrasena){
        int tipoPersona = 0;
        if (clientes.getClientes().stream().anyMatch(cliente -> cliente.getGmail().equals(correo) && cliente.getPassword().equals(contrasena))) {
            tipoPersona = 1;
        }else if (empleados.getEmpleados().stream().anyMatch(empleado -> empleado.getGmail().equals(correo) && empleado.getPassword().equals(contrasena))) {
            tipoPersona = 2;
        }else if (admins.getAdmins().stream().anyMatch(admin -> admin.getGmail().equals(correo) && admin.getPassword().equals(contrasena))) {
            tipoPersona = 3;
        }

        return tipoPersona;
    }

    public boolean agregarEmpleado(Empleado empleado){
        boolean centinela=false;
        if (admins.crearEmpleado(empleado)) {
            centinela = true;   
        }
        return centinela;
    }

    public boolean eliminarEmpleado(String cedula){
        boolean centinela=false;
        if (admins.eliminarEmpleado(cedula)) {
            centinela = true;
        }
        return centinela;
    }

    public boolean actualizarEmpleado(String cedula, Empleado empleado){
        boolean centinela=false;
        if (admins.actualizarEmpleado(cedula, empleado)) {
            centinela = true;
        }
        return centinela;
    }


    public boolean agregarClienteA(Cliente cliente){
        boolean centinela=false;
        if (admins.crearCliente(cliente)) {
            centinela = true;   
        }
        return centinela;
    }

    public boolean eliminarClienteA(String cedula){
        boolean centinela=false;
        if (admins.eliminarCliente(cedula)) {
            centinela = true;
        }
        return centinela;
    }

    public boolean actualizarClienteA(String cedula, Cliente empleado){
        boolean centinela=false;
        if (admins.actualizarCliente(cedula, empleado)) {
            centinela = true;
        }
        return centinela;
    }

    public boolean agregarClienteE(Cliente cliente){
        boolean centinela=false;
        if (empleados.crearCliente(cliente)) {
            centinela = true;
        }
        return centinela;
    }

    public boolean eliminarClienteE(String cedula){
        boolean centinela=false;
        if (empleados.eliminarCliente(cedula)) {
            centinela = true;
        }
        return centinela;
    }

    public boolean actualizarClienteE(String cedula, Cliente empleado){
        boolean centinela=false;
        if (empleados.actualizarCliente(cedula, empleado)) {
            centinela = true;
        }
        return centinela;
    }

    
}
