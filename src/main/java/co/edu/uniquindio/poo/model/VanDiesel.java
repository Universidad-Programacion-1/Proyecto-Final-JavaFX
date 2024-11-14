package co.edu.uniquindio.poo.model;

public class VanDiesel {
    
    private double capacidadMaletero;
    private int numPuertas, numBolsas;
    private boolean aireAcondicionado, camTrasera, abs;
    
    public VanDiesel(double capacidadMaletero, int numPuertas, int numBolsas, boolean aireAcondicionado,
            boolean camTrasera, boolean abs) {
        this.capacidadMaletero = capacidadMaletero;
        this.numPuertas = numPuertas;
        this.numBolsas = numBolsas;
        this.aireAcondicionado = aireAcondicionado;
        this.camTrasera = camTrasera;
        this.abs = abs;
    }
    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }
    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
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
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
    public boolean isCamTrasera() {
        return camTrasera;
    }
    public void setCamTrasera(boolean camTrasera) {
        this.camTrasera = camTrasera;
    }
    public boolean isAbs() {
        return abs;
    }
    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    
}
