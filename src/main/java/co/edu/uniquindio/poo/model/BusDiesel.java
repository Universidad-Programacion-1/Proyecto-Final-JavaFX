
package co.edu.uniquindio.poo.model;



public class BusDiesel extends VehiculoDiesel{
    
    private double numeroEjes, numSalidasEmergencias, numPasajero, numPuertas, numBolsas;
    private double capaMaletero;
    
    private String camaraReversa;
    public BusDiesel(String marca, String modelo, String placa, String nuevoUsado, String transmision,
            double velocidadmax, double cilindraje, double precio, String aireAcondicionado, String abs,
            double numeroEjes, double numSalidasEmergencias, double numPasajero, double numPuertas, double numBolsas,
            double capaMaletero, String camaraReversa) {
        super(marca, modelo, placa, nuevoUsado, transmision, velocidadmax, cilindraje, precio, aireAcondicionado, abs);
        this.numeroEjes = numeroEjes;
        this.numSalidasEmergencias = numSalidasEmergencias;
        this.numPasajero = numPasajero;
        this.numPuertas = numPuertas;
        this.numBolsas = numBolsas;
        this.capaMaletero = capaMaletero;
        this.camaraReversa = camaraReversa;
    }
    public double getNumeroEjes() {
        return numeroEjes;
    }
    public void setNumeroEjes(double numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
    public double getNumSalidasEmergencias() {
        return numSalidasEmergencias;
    }
    public void setNumSalidasEmergencias(double numSalidasEmergencias) {
        this.numSalidasEmergencias = numSalidasEmergencias;
    }
    public double getNumPasajero() {
        return numPasajero;
    }
    public void setNumPasajero(double numPasajero) {
        this.numPasajero = numPasajero;
    }
    public double getNumPuertas() {
        return numPuertas;
    }
    public void setNumPuertas(double numPuertas) {
        this.numPuertas = numPuertas;
    }
    public double getNumBolsas() {
        return numBolsas;
    }
    public void setNumBolsas(double numBolsas) {
        this.numBolsas = numBolsas;
    }
    public double getCapaMaletero() {
        return capaMaletero;
    }
    public void setCapaMaletero(double capaMaletero) {
        this.capaMaletero = capaMaletero;
    }
    public String getCamaraReversa() {
        return camaraReversa;
    }
    public void setCamaraReversa(String camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

}