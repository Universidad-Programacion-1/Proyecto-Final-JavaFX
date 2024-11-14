package co.edu.uniquindio.poo.model;

public abstract class VehiculoHibrido {
    
    private boolean enchufable;
    private int numBolsas, numPasajero, numPuerta;

    public VehiculoHibrido(boolean enchufable, int numBolsas, int numPasajero, int numPuerta) {
        this.enchufable = enchufable;
        this.numBolsas = numBolsas;
        this.numPasajero = numPasajero;
        this.numPuerta = numPuerta;
    }

    public boolean isEnchufable() {
        return enchufable;
    }

    public void setEnchufable(boolean enchufable) {
        this.enchufable = enchufable;
    }

    public int getNumBolsas() {
        return numBolsas;
    }

    public void setNumBolsas(int numBolsas) {
        this.numBolsas = numBolsas;
    }

    public int getNumPasajero() {
        return numPasajero;
    }

    public void setNumPasajero(int numPasajero) {
        this.numPasajero = numPasajero;
    }

    public int getNumPuerta() {
        return numPuerta;
    }

    public void setNumPuerta(int numPuerta) {
        this.numPuerta = numPuerta;
    }

    public abstract boolean definirEnchufe();
}
