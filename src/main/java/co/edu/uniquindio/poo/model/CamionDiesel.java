package co.edu.uniquindio.poo.model;


public class CamionDiesel extends VehiculoDiesel {
    
    private double numeroEjes;
    private String tipoCamion;
    public CamionDiesel(String marca, String modelo, String placa, String nuevoUsado, String transmision,
            double velocidadmax, double cilindraje, double precio, String aireAcondicionado, String abs,
            double numeroEjes, String tipoCamion) {
        super(marca, modelo, placa, nuevoUsado, transmision, velocidadmax, cilindraje, precio, aireAcondicionado, abs);
        this.numeroEjes = numeroEjes;
        this.tipoCamion = tipoCamion;
    }
    public double getNumeroEjes() {
        return numeroEjes;
    }
    public void setNumeroEjes(double numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
    public String getTipoCamion() {
        return tipoCamion;
    }
    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    

    
}
