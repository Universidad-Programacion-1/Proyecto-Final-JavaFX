package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Admin;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Consecionario;

public class ClienteController {

    Consecionario consecionario;
    Cliente cliente;
    Admin admin;

    public ClienteController(Consecionario consecionario) {
        this.consecionario = consecionario;
    }

    public boolean crearCliente(Cliente cliente) {
        return consecionario.agregarCliente(cliente);
    }

    public Collection<Cliente> obtenerListaClientes() {
        return consecionario.listarClientes();
    }

    public boolean eliminarCliente(String cedula) {
       return consecionario.eliminarCliente(cedula);
    }

    public boolean actualizarCliente(String cedula, Cliente cliente) {
       return consecionario.actualizarCliente(cedula, cliente);
    }
}
