package co.edu.uniquindio.poo.model;



public abstract class VehiculoElectrico extends Vehiculo {
    
    private String autonomiaCarga, tiempoCarga;
    private double capacidadMaletero, numBolsas, numPasajero, numPuerta;
    private  String sensorTraficoCR, asistenteCarril, aireAcondicionado, velocidadCrucero, sensoresColision, abs, camReversa;
    public VehiculoElectrico(String marca, String modelo, String placa, String nuevoUsado, String transmision,
            double velocidadmax, double cilindraje, double precio, String autonomiaCarga, String tiempoCarga,
            double capacidadMaletero, double numBolsas, double numPasajero, double numPuerta, String sensorTraficoCR,
            String asistenteCarril, String aireAcondicionado, String velocidadCrucero, String sensoresColision,
            String abs, String camReversa) {
        super(marca, modelo, placa, nuevoUsado, transmision, velocidadmax, cilindraje, precio);
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
    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }
    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }
    public double getNumBolsas() {
        return numBolsas;
    }
    public void setNumBolsas(double numBolsas) {
        this.numBolsas = numBolsas;
    }
    public double getNumPasajero() {
        return numPasajero;
    }
    public void setNumPasajero(double numPasajero) {
        this.numPasajero = numPasajero;
    }
    public double getNumPuerta() {
        return numPuerta;
    }
    public void setNumPuerta(double numPuerta) {
        this.numPuerta = numPuerta;
    }
    public String getSensorTraficoCR() {
        return sensorTraficoCR;
    }
    public void setSensorTraficoCR(String sensorTraficoCR) {
        this.sensorTraficoCR = sensorTraficoCR;
    }
    public String getAsistenteCarril() {
        return asistenteCarril;
    }
    public void setAsistenteCarril(String asistenteCarril) {
        this.asistenteCarril = asistenteCarril;
    }
    public String getAireAcondicionado() {
        return aireAcondicionado;
    }
    public void setAireAcondicionado(String aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
    public String getVelocidadCrucero() {
        return velocidadCrucero;
    }
    public void setVelocidadCrucero(String velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }
    public String getSensoresColision() {
        return sensoresColision;
    }
    public void setSensoresColision(String sensoresColision) {
        this.sensoresColision = sensoresColision;
    }
    public String getAbs() {
        return abs;
    }
    public void setAbs(String abs) {
        this.abs = abs;
    }
    public String getCamReversa() {
        return camReversa;
    }
    public void setCamReversa(String camReversa) {
        this.camReversa = camReversa;
    }


}
