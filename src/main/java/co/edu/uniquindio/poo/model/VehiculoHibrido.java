package co.edu.uniquindio.poo.model;

import javafx.scene.control.ComboBox;

public abstract class VehiculoHibrido extends Vehiculo  {
    
    private String enchufable;
    private String tipoHibrido;
    private Double numBolsas, numPasajero, numPuerta;
    
    
    
    public VehiculoHibrido(String marca, String modelo, String placa, String nuevoUsado, String transmision,
            double velocidadmax, double cilindraje, double precio, String enchufable, String tipoHibrido,
            Double numBolsas, Double numPasajero, Double numPuerta) {
        super(marca, modelo, placa, nuevoUsado, transmision, velocidadmax, cilindraje, precio);
        this.enchufable = enchufable;
        this.tipoHibrido = tipoHibrido;
        this.numBolsas = numBolsas;
        this.numPasajero = numPasajero;
        this.numPuerta = numPuerta;
    }
    public String getEnchufable() {
        return enchufable;
    }
    public void setEnchufable(String enchufable) {
        this.enchufable = enchufable;
    }
    public String getTipoHibrido() {
        return tipoHibrido;
    }
    public void setTipoHibrido(String tipoHibrido) {
        this.tipoHibrido = tipoHibrido;
    }
    public Double getNumBolsas() {
        return numBolsas;
    }
    public void setNumBolsas(Double numBolsas) {
        this.numBolsas = numBolsas;
    }
    public Double getNumPasajero() {
        return numPasajero;
    }
    public void setNumPasajero(Double numPasajero) {
        this.numPasajero = numPasajero;
    }
    public Double getNumPuerta() {
        return numPuerta;
    }
    public void setNumPuerta(Double numPuerta) {
        this.numPuerta = numPuerta;
    }
    

    
}
