package co.edu.uniquindio.poo.model;


public class VanGasolina extends VehiculoGasolina {
    
    private double capacidadMaletero;
    private double numPuertas, numBolsas;
    private String aireAcondicionado;
    private String camTrasera;
    private String abs;
    
    public VanGasolina(String marca, String modelo, String placa, String nuevoUsado, String transmision,
            double velocidadmax, double cilindraje, double precio, double galonesGasolina, double capacidadMaletero,
            double numPuertas, double numBolsas, String aireAcondicionado, String camTrasera, String abs) {
        super(marca, modelo, placa, nuevoUsado, transmision, velocidadmax, cilindraje, precio, galonesGasolina);
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

    public String getAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(String aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public String getCamTrasera() {
        return camTrasera;
    }

    public void setCamTrasera(String camTrasera) {
        this.camTrasera = camTrasera;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }
    
}
