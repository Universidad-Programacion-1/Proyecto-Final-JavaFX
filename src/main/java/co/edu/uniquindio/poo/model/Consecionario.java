package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Consecionario {
    
    private Collection<Admin> admins;
    private Collection<Empleado> empleados;
    private Collection<Cliente> clientes;
    int tipoPersona;
    private String nombre;
    Empleado empleado1;
    Admin admin1;

    public Consecionario(String nombre) {
        this.nombre = nombre;
        this.admins = new LinkedList<>();
        this.empleados = new LinkedList<>();
        this.clientes = new LinkedList<>();
        //personas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean crearAdmin(Admin admin) {
        System.out.println(admin);
        boolean centinela = false;
        if (!verificarAdmin(admin.getId())) {
            admins.add(admin);
            centinela = true;
        }
        return centinela;
    }

    public int tipoPersona(){
        int tipo = tipoPersona;
        return tipo;
    }

    public boolean eliminarAdmin(String cedula) {
        boolean centinela = false;
        for (Admin admin : admins) {
            if (admin.getId().equals(cedula)) {
                admins.remove(admin);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean verificarAdmin(String cedula) {
        boolean centinela = false;
        for (Admin admin : admins) {
            if (admin.getId().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean actualizarAdmin(String cedula, Admin actualizado) {
        boolean centinela = false;
        for (Admin admin : admins) {
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
        // if (clientes.getPalabraSecreta().equals(palabra)) {
        //     centinela = true;
        // }else if (empleados.stream().anyMatch(empleado -> empleado.getPalabraSecreta().equals(palabra))) {
        //     centinela = true;
        // }else if (admins.stream().anyMatch(admin -> admin.getPalabraSecreta().equals(palabra))) {
        //     centinela = true;
        // }
        return centinela;
    }

    public int login(String correo, String contrasena){
        //verificaUser(correo, contrasena);
        // System.out.println(correo + contrasena);
        int tipo = 0;
        System.out.println(empleados);
        // System.err.println("Lista de clientes"+ clientes.getClientes());
        // System.err.println("Lista de Empleados"+ empleados);
        // System.err.println("Lista de Admins"+ admins);
        for (Admin admin : admins) {
            if (admin.getGmail().equals(correo) && admin.getId().equals(contrasena)) {
                tipo = 3;
                tipoPersona = tipo;
                admin1 = admin;
            }
        }
        for (Cliente cliente : clientes) {
            if (cliente.getGmail().equals(correo) && cliente.getId().equals(contrasena)) {
                tipo = 1;
                tipoPersona = tipo;
            }
        }
        for (Empleado empleado : admin1.getEmpleados()) {
            if (empleado.getGmail().equals(correo) && empleado.getId().equals(contrasena)) {
                tipo = 2;
                tipoPersona = tipo;
                empleado1 = empleado;
            }

        }
        return tipo;
    }
    public Collection<Empleado> listarEmpleados(){
        return admin1.getEmpleados();
    }
    public Collection<Cliente> listarClientes(){
        Collection<Cliente> lista = new LinkedList<>();
        for (Cliente cliente : admin1.getClientes()) {
            lista.add(cliente);
        }
        for (Cliente cliente : empleado1.getClientes()) {
            lista.add(cliente);
        }

        return admin1.getClientes();
    }

    // public Collection<Cliente> listarClientesE(){
    //     return empleado1.getClientes();
    // }

    public boolean agregarEmpleado(Empleado empleado){
        boolean centinela=false;
        if (admin1.crearEmpleado(empleado)) {
            // empleados.add(empleado);
            centinela = true;
        }
        return centinela;
    }

    public boolean eliminarEmpleado(String cedula){
        boolean centinela=false;
        if (admin1.eliminarEmpleado(cedula)) {
            centinela = true;
        }
        return centinela;
    }

    public boolean actualizarEmpleado(String cedula, Empleado empleado){
        boolean centinela=false;
        if (admin1.actualizarEmpleado(cedula, empleado)) {
            centinela = true;
        }
        return centinela;
    }

    public boolean eliminarCliente(String cedula){
        boolean centinela=false;
        if (tipoPersona == 2) {
            if (empleado1.eliminarCliente(cedula)) {
                centinela = true;
            }   
        }else if (tipoPersona == 3) {
            if (admin1.eliminarCliente(cedula)) {
                centinela = true;   
            }
        }
        return centinela;
    }

    public boolean actualizarCliente(String cedula, Cliente empleado){
        boolean centinela=false;
        if (tipoPersona == 2) {
            if (empleado1.actualizarCliente(cedula, empleado)) {
                centinela = true;
            }   
        }else if (tipoPersona == 3) {
            if (admin1.actualizarCliente(cedula, empleado)) {
                centinela = true;   
            }
        }
        return centinela;
    }

    
    public boolean agregarCliente(Cliente cliente){
        boolean centinela=false;
        if (tipoPersona == 2) {
            if (empleado1.crearCliente(cliente)) {
                centinela = true;
            }
        }else if (tipoPersona == 3) {
            if (admin1.crearCliente(cliente)) {
                centinela = true;   
            }
        }
        return centinela;
    }

    public Collection<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(Collection<Admin> admins) {
        this.admins = admins;
    }

    
}
