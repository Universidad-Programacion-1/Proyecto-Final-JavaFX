package co.edu.uniquindio.poo.model;



public class CamionetaElectrico extends VehiculoElectrico {
    
    private String cuatroXcuatro;

    public CamionetaElectrico(String marca, String modelo, String placa, String nuevoUsado, String transmision,
            double velocidadmax, double cilindraje, double precio, String autonomiaCarga, String tiempoCarga,
            double capacidadMaletero, double numBolsas, double numPasajero, double numPuerta, String sensorTraficoCR,
            String asistenteCarril, String aireAcondicionado, String velocidadCrucero, String sensoresColision,
            String abs, String camReversa, String cuatroXcuatro) {
        super(marca, modelo, placa, nuevoUsado, transmision, velocidadmax, cilindraje, precio, autonomiaCarga,
                tiempoCarga, capacidadMaletero, numBolsas, numPasajero, numPuerta, sensorTraficoCR, asistenteCarril,
                aireAcondicionado, velocidadCrucero, sensoresColision, abs, camReversa);
        this.cuatroXcuatro = cuatroXcuatro;
    }

    public String getCuatroXcuatro() {
        return cuatroXcuatro;
    }

    public void setCuatroXcuatro(String cuatroXcuatro) {
        this.cuatroXcuatro = cuatroXcuatro;
    }

    
    

}
