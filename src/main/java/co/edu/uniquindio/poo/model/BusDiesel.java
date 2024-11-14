package co.edu.uniquindio.poo.model;

public class BusDiesel {
    
    private int numeroEjes, numSalidasEmergencias, numPasajero, numPuertas, numBolsas;
    private double capaMaletero;
    private boolean camaraReversa;

    public BusDiesel(int numeroEjes, int numSalidasEmergencias, int numPasajero, int numPuertas, int numBolsas,
            double capaMaletero, boolean camaraReversa) {
        this.numeroEjes = numeroEjes;
        this.numSalidasEmergencias = numSalidasEmergencias;
        this.numPasajero = numPasajero;
        this.numPuertas = numPuertas;
        this.numBolsas = numBolsas;
        this.capaMaletero = capaMaletero;
        this.camaraReversa = camaraReversa;
    }


    public int getNumPasajero() {
        return numPasajero;
    }

    public void setNumPasajero(int numPasajero) {
        this.numPasajero = numPasajero;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumBolsas() {
        return numBolsas;
    }

    public void setNumBolsas(int numBolsas) {
        this.numBolsas = numBolsas;
    }

    public double getCapaMaletero() {
        return capaMaletero;
    }

    public void setCapaMaletero(double capaMaletero) {
        this.capaMaletero = capaMaletero;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public int getNumSalidasEmergencias() {
        return numSalidasEmergencias;
    }

    public void setNumSalidasEmergencias(int numSalidasEmergencias) {
        this.numSalidasEmergencias = numSalidasEmergencias;
    }

    
}
