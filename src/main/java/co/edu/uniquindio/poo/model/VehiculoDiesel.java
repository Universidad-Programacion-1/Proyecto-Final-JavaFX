package co.edu.uniquindio.poo.model;

public class VehiculoDiesel {

    private boolean aireAcondicionado, abs;

    
    public VehiculoDiesel(boolean aireAcondicionado, boolean abs) {
        this.aireAcondicionado = aireAcondicionado;
        this.abs = abs;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }


    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }


    public boolean isAbs() {
        return abs;
    }


    public void setAbs(boolean abs) {
        this.abs = abs;
    }
}
