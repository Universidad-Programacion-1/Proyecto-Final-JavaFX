package co.edu.uniquindio.poo.model;

public abstract class VehiculoElectrico {
    
    private String autonomiaCarga, tiempoCarga;
    private int capacidadMaletero, numBolsas, numPasajero, numPuerta;
    private boolean sensorTraficoCR, asistenteCarril, aireAcondicionado, velocidadCrucero, sensoresColision, abs, camReversa;

    public VehiculoElectrico(String autonomiaCarga, String tiempoCarga, int capacidadMaletero, int numBolsas,
            int numPasajero, int numPuerta, boolean sensorTraficoCR, boolean asistenteCarril, boolean aireAcondicionado,
            boolean velocidadCrucero, boolean sensoresColision, boolean abs, boolean camReversa) {
        this.autonomiaCarga = autonomiaCarga;
        this.tiempoCarga = tiempoCarga;
        this.capacidadMaletero = capacidadMaletero;
        this.numBolsas = numBolsas;
        this.numPasajero = numPasajero;
        this.numPuerta = numPuerta;
        this.sensorTraficoCR = sensorTraficoCR;
        this.asistenteCarril = asistenteCarril;
        this.aireAcondicionado = aireAcondicionado;
        this.velocidadCrucero = velocidadCrucero;
        this.sensoresColision = sensoresColision;
        this.abs = abs;
        this.camReversa = camReversa;
    }


    public String getAutonomiaCarga() {
        return autonomiaCarga;
    }



    public void setAutonomiaCarga(String autonomiaCarga) {
        this.autonomiaCarga = autonomiaCarga;
    }



    public String getTiempoCarga() {
        return tiempoCarga;
    }



    public void setTiempoCarga(String tiempoCarga) {
        this.tiempoCarga = tiempoCarga;
    }



    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }



    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
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



    public boolean isSensorTraficoCR() {
        return sensorTraficoCR;
    }



    public void setSensorTraficoCR(boolean sensorTraficoCR) {
        this.sensorTraficoCR = sensorTraficoCR;
    }



    public boolean isAsistenteCarril() {
        return asistenteCarril;
    }



    public void setAsistenteCarril(boolean asistenteCarril) {
        this.asistenteCarril = asistenteCarril;
    }



    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }



    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }



    public boolean isVelocidadCrucero() {
        return velocidadCrucero;
    }



    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }



    public boolean isSensoresColision() {
        return sensoresColision;
    }



    public void setSensoresColision(boolean sensoresColision) {
        this.sensoresColision = sensoresColision;
    }



    public boolean isAbs() {
        return abs;
    }



    public void setAbs(boolean abs) {
        this.abs = abs;
    }



    public boolean isCamReversa() {
        return camReversa;
    }



    public void setCamReversa(boolean camReversa) {
        this.camReversa = camReversa;
    }



    public abstract void CalcularAutonomia ();

}
