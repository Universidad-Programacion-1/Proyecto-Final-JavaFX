package co.edu.uniquindio.poo.model;

import java.util.Collection;

public interface IGestionarConsecionario {
   
    //public void login();
    //Gestion de Cliente
    public boolean crearCliente (Cliente cliente);
    public boolean eliminarCliente(String cedula);
    public boolean verificarCliente(String cedula);
    public boolean actualizarCliente(String cedula, Cliente actualizado);

    //Gestion de Alquiler
    public void crearAlquiler (Vehiculo vehiculo);
    public void eliminarAlquiler(Vehiculo vehiculo);

    //Gestion de Compra
    public boolean crearCompra(Vehiculo vehiculo);
    public boolean eliminarCompra(Vehiculo vehiculo);
}
