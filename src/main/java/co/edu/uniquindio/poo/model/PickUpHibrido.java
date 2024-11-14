package co.edu.uniquindio.poo.model;

public class PickUpHibrido {
    
    private boolean cuatroXcuatro, aireAcondicionado, camReversa, abs;
    private double capacidadCajaCarga;

    public PickUpHibrido(boolean cuatroXcuatro, boolean aireAcondicionado, boolean camReversa, boolean abs,
            double capacidadCajaCarga) {
        this.cuatroXcuatro = cuatroXcuatro;
        this.aireAcondicionado = aireAcondicionado;
        this.camReversa = camReversa;
        this.abs = abs;
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    public boolean isCuatroXcuatro() {
        return cuatroXcuatro;
    }

    public void setCuatroXcuatro(boolean cuatroXcuatro) {
        this.cuatroXcuatro = cuatroXcuatro;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public double getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }

    public void setCapacidadCajaCarga(double capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    public boolean isCamReversa() {
        return camReversa;
    }

    public void setCamReversa(boolean camReversa) {
        this.camReversa = camReversa;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    
}
