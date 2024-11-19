package co.edu.uniquindio.poo.model;

import javafx.scene.control.ComboBox;

public class VehiculoGasolina extends Vehiculo{
    
    private double galonesGasolina;


    public VehiculoGasolina(String marca, String modelo, String placa, String nuevoUsado, String transmision,
            double velocidadmax, double cilindraje, double precio, double galonesGasolina) {
        super(marca, modelo, placa, nuevoUsado, transmision, velocidadmax, cilindraje, precio);
        this.galonesGasolina = galonesGasolina;
    }

    public double getGalonesGasolina() {
        return galonesGasolina;
    }

    public void setGalonesGasolina(double galonesGasolina) {
        this.galonesGasolina = galonesGasolina;
    }
    
}
