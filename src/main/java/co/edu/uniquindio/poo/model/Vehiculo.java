package co.edu.uniquindio.poo.model;

public class Vehiculo {
    
    private String marca , modelo, placa;
    private boolean nuevoUsado, transmision;
    private double velocidadmax, cilindraje;


    public Vehiculo(String marca, String modelo, String placa, boolean nuevoUsado, boolean transmision, double velocidadmax, double cilindraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.nuevoUsado = nuevoUsado;
        this.transmision = transmision;
        this.velocidadmax = velocidadmax;
        this.cilindraje = cilindraje;
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


    public boolean isNuevoUsado() {
        return nuevoUsado;
    }


    public void setNuevoUsado(boolean nuevoUsado) {
        this.nuevoUsado = nuevoUsado;
    }


    public boolean isTransmision() {
        return transmision;
    }


    public void setTransmision(boolean transmision) {
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


    
}
