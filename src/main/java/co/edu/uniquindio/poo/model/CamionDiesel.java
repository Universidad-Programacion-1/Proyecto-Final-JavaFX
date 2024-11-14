package co.edu.uniquindio.poo.model;

public class CamionDiesel {
    
    private int numeroEjes;
    private String tipoCamion;

    
    public CamionDiesel(int numeroEjes, String tipoCamion) {
        this.numeroEjes = numeroEjes;
        this.tipoCamion = tipoCamion;
    }


    public int getNumeroEjes() {
        return numeroEjes;
    }


    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }


    public String getTipoCamion() {
        return tipoCamion;
    }


    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    
}
