package co.edu.uniquindio.poo.model;

import javafx.scene.control.ComboBox;

public class Vehiculo {
    
    private String marca , modelo, placa;
    private String nuevoUsado; 
    private String transmision;
    private double velocidadmax, cilindraje, precio;
    public Vehiculo(String marca, String modelo, String placa, String nuevoUsado, String transmision,
            double velocidadmax, double cilindraje, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.nuevoUsado = nuevoUsado;
        this.transmision = transmision;
        this.velocidadmax = velocidadmax;
        this.cilindraje = cilindraje;
        this.precio = precio;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getNuevoUsado() {
        return nuevoUsado;
    }
    public void setNuevoUsado(String nuevoUsado) {
        this.nuevoUsado = nuevoUsado;
    }
    public String getTransmision() {
        return transmision;
    }
    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
    public double getVelocidadmax() {
        return velocidadmax;
    }
    public void setVelocidadmax(double velocidadmax) {
        this.velocidadmax = velocidadmax;
    }
    public double getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }



    


    


    
}
