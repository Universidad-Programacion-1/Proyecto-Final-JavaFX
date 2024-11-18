package co.edu.uniquindio.poo.model;



public class VehiculoDiesel extends Vehiculo {

    private String aireAcondicionado, abs;

    public VehiculoDiesel(String marca, String modelo, String placa, String nuevoUsado, String transmision,
            double velocidadmax, double cilindraje, double precio, String aireAcondicionado, String abs) {
        super(marca, modelo, placa, nuevoUsado, transmision, velocidadmax, cilindraje, precio);
        this.aireAcondicionado = aireAcondicionado;
        this.abs = abs;
    }

    public String getAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(String aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }


    }


