package co.edu.uniquindio.poo.model;

public class DeportivoHibrido {
    
    private double numCaballoFuerza, tiempo0a100km;

    public DeportivoHibrido(double numCaballoFuerza, double tiempo0a100km) {
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
