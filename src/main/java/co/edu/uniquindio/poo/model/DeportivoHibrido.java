package co.edu.uniquindio.poo.model;

import javafx.scene.control.ComboBox;

public class DeportivoHibrido extends VehiculoHibrido {
    
    private double numCaballoFuerza, tiempo0a100km;

    

    public DeportivoHibrido(String marca, String modelo, String placa, String nuevoUsado, String transmision,
            double velocidadmax, double cilindraje, double precio, String enchufable, String tipoHibrido,
            Double numBolsas, Double numPasajero, Double numPuerta, double numCaballoFuerza, double tiempo0a100km) {
        super(marca, modelo, placa, nuevoUsado, transmision, velocidadmax, cilindraje, precio, enchufable, tipoHibrido,
                numBolsas, numPasajero, numPuerta);
        this.numCaballoFuerza = numCaballoFuerza;
        this.tiempo0a100km = tiempo0a100km;
    }

    public double getNumCaballoFuerza() {
        return numCaballoFuerza;
    }

    public void setNumCaballoFuerza(double numCaballoFuerza) {
        this.numCaballoFuerza = numCaballoFuerza;
    }

    public double getTiempo0a100km() {
        return tiempo0a100km;
    }

    public void setTiempo0a100km(double tiempo0a100km) {
        this.tiempo0a100km = tiempo0a100km;
    }
    

    
}
