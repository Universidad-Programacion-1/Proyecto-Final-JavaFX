package co.edu.uniquindio.poo.model;

import javafx.scene.control.ComboBox;

public class PickUpHibrido extends VehiculoHibrido {
    
    private String cuatroXcuatro; 
    private String aireAcondicionado;
    private String camReversa;
    private String abs;
    private double capacidadCajaCarga;
    
    public PickUpHibrido(String marca, String modelo, String placa, String nuevoUsado, String transmision,
            double velocidadmax, double cilindraje, double precio, String enchufable, String tipoHibrido,
            Double numBolsas, Double numPasajero, Double numPuerta, String cuatroXcuatro, String aireAcondicionado,
            String camReversa, String abs, double capacidadCajaCarga) {
        super(marca, modelo, placa, nuevoUsado, transmision, velocidadmax, cilindraje, precio, enchufable, tipoHibrido,
                numBolsas, numPasajero, numPuerta);
        this.cuatroXcuatro = cuatroXcuatro;
        this.aireAcondicionado = aireAcondicionado;
        this.camReversa = camReversa;
        this.abs = abs;
        this.capacidadCajaCarga = capacidadCajaCarga;
    }
    public String getCuatroXcuatro() {
        return cuatroXcuatro;
    }
    public void setCuatroXcuatro(String cuatroXcuatro) {
        this.cuatroXcuatro = cuatroXcuatro;
    }
    public String getAireAcondicionado() {
        return aireAcondicionado;
    }
    public void setAireAcondicionado(String aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
    public String getCamReversa() {
        return camReversa;
    }
    public void setCamReversa(String camReversa) {
        this.camReversa = camReversa;
    }
    public String getAbs() {
        return abs;
    }
    public void setAbs(String abs) {
        this.abs = abs;
    }
    public double getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }
    public void setCapacidadCajaCarga(double capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    

    



    
    
}
