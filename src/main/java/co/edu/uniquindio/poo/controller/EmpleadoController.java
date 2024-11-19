package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Admin;
import co.edu.uniquindio.poo.model.Consecionario;
import co.edu.uniquindio.poo.model.Empleado;

public class EmpleadoController {

    Consecionario consecionario;
    Admin admin;

    public EmpleadoController(Consecionario consecionario) {
        this.consecionario = consecionario;
    }

    public boolean crearEmpleado(Empleado empleado) {
        return consecionario.agregarEmpleado(empleado);
    }

    public Collection<Empleado> obtenerListaEmpleado() {
        return consecionario.listarEmpleados();
    }

    public boolean eliminarEmpleado(String cedula) {
       return consecionario.eliminarEmpleado(cedula);
    }

    public boolean actualizarEmpleado(String cedula, Empleado empleado) {
       return consecionario.actualizarEmpleado(cedula, empleado);
    }
}