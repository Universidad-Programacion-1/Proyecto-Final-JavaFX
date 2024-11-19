package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Admin;
import co.edu.uniquindio.poo.model.Consecionario;

public class AdminController {
    
    Consecionario consecionario;
    Admin admin;

    public AdminController(Consecionario consecionario) {
        this.consecionario = consecionario;
    }

    public boolean crearAdmin(Admin admin) {
        return consecionario.crearAdmin(admin);
    }

    public Collection<Admin> obtenerListaAdmin() {
        return consecionario.getAdmins();
    }

    public boolean eliminarAdmin(String cedula) {
       return consecionario.eliminarAdmin(cedula);
    }

    public boolean actualizarAdmin(String cedula, Admin admin) {
       return consecionario.actualizarAdmin(cedula, admin);
    }
}
