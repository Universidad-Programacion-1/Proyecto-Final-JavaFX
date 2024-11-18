package co.edu.uniquindio.poo.model;

import java.util.Collection;

public class Consecionario {
    
    private String nombre;
    private Collection<CamionDiesel> CamionDiesels;
    private Collection<CamionetaElectrico> CamionetaElectricos;
    private Collection<SedanElectrico> sedanElectricos;
    private Collection<BusDiesel> BusesDiesels;
    public Consecionario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Creación de CamionDiesel
public boolean agregarCamionDiesel(CamionDiesel CamionDiesel) {
    boolean centinela = false;
    if (!verificarCamionDiesel(CamionDiesel.getPlaca())) {
        CamionDiesels.add(CamionDiesel); // Asegúrate de tener una lista llamada 'CamionDiesels'
        centinela = true;
    }
    return centinela;
}

// Eliminación de CamionDiesel
public boolean eliminarCamionDiesel(String placa) {
    boolean centinela = false;
    for (CamionDiesel CamionDiesel : CamionDiesels) {
        if (CamionDiesel.getPlaca().equals(placa)) {
            CamionDiesels.remove(CamionDiesel);
            centinela = true;
            break;
        }
    }
    return centinela;
}

public boolean actualizarCamionDiesel(String placa, CamionDiesel actualizado) {
    boolean centinela = false;
    for (CamionDiesel camionDiesel : CamionDiesels) {
        if (camionDiesel.getPlaca().equals(placa)) {
            camionDiesel.setPlaca(actualizado.getPlaca());
            camionDiesel.setMarca(actualizado.getMarca());
            camionDiesel.setModelo(actualizado.getModelo());
            camionDiesel.setNuevoUsado(actualizado.getNuevoUsado());
            camionDiesel.setTransmision(actualizado.getTransmision());
            camionDiesel.setVelocidadmax(actualizado.getVelocidadmax());
            camionDiesel.setCilindraje(actualizado.getCilindraje());
            camionDiesel.setPrecio(actualizado.getPrecio());
            camionDiesel.setAireAcondicionado(actualizado.getAireAcondicionado());
            camionDiesel.setAbs(actualizado.getAbs());
            camionDiesel.setNumeroEjes(actualizado.getNumeroEjes());
            camionDiesel.setTipoCamion(actualizado.getTipoCamion());
            centinela = true;
            break;
        }
    }
    return centinela;
}


// Verificación de CamionDiesel
public boolean verificarCamionDiesel(String placa) {
    boolean centinela = false;
    for (CamionDiesel CamionDiesel : CamionDiesels) {
        if (CamionDiesel.getPlaca().equals(placa)) {
            centinela = true;
        }
    }
    return centinela;
}
public boolean agregarBusDiesel(BusDiesel busDiesel) {
    boolean centinela = false;
    if (!verificarBusDiesel(busDiesel.getPlaca())) {
        BusesDiesels.add(busDiesel);
        centinela = true;
    }
    return centinela;
}
public boolean eliminarBusDiesel(String placa) {
    boolean centinela = false;
    for (BusDiesel busDiesel :  BusesDiesels) {
        if (busDiesel.getPlaca().equals(placa)) {
            BusesDiesels.remove(busDiesel);
            centinela = true;
            break;
        }
    }
    return centinela;
}
public boolean verificarBusDiesel(String placa) {
    boolean centinela = false;
    for (BusDiesel busDiesel :  BusesDiesels) {
        if (busDiesel.getPlaca().equals(placa)) {
            centinela = true;
            break;
        }
    }
    return centinela;
}

public boolean actualizarBusDiesel(String placa, BusDiesel actualizado) {
    boolean centinela = false;
    for (BusDiesel busDiesel : BusesDiesels) {
        if (busDiesel.getPlaca().equals(placa)) {
            // Atributos heredados de VehiculoDiesel
            busDiesel.setPlaca(actualizado.getPlaca());
            busDiesel.setMarca(actualizado.getMarca());
            busDiesel.setModelo(actualizado.getModelo());
            busDiesel.setNuevoUsado(actualizado.getNuevoUsado());
            busDiesel.setTransmision(actualizado.getTransmision());
            busDiesel.setVelocidadmax(actualizado.getVelocidadmax());
            busDiesel.setCilindraje(actualizado.getCilindraje());
            busDiesel.setPrecio(actualizado.getPrecio());
            busDiesel.setAireAcondicionado(actualizado.getAireAcondicionado());
            busDiesel.setAbs(actualizado.getAbs());

            // Atributos específicos de BusDiesel
            busDiesel.setNumeroEjes(actualizado.getNumeroEjes());
            busDiesel.setNumSalidasEmergencias(actualizado.getNumSalidasEmergencias());
            busDiesel.setNumPasajero(actualizado.getNumPasajero());
            busDiesel.setNumPuertas(actualizado.getNumPuertas());
            busDiesel.setNumBolsas(actualizado.getNumBolsas());
            busDiesel.setCapaMaletero(actualizado.getCapaMaletero());
            busDiesel.setCamaraReversa(actualizado.getCamaraReversa());
            
            centinela = true;
            break;
        }
    }
    return centinela;
}
    public boolean agregarCamionetaElectrico(CamionetaElectrico camionetaElectrico) {
        boolean centinela = false;
        if (!verificarSedanElectrico(camionetaElectrico.getPlaca())) {
            CamionetaElectricos.add(camionetaElectrico);
            centinela = true;
        }
        return centinela;
    }

public boolean eliminarCamionetaElectrico(String placa) {
    boolean centinela = false;
    for (CamionetaElectrico camioneta : CamionetaElectricos) {
        if (camioneta.getPlaca().equals(placa)) {
            CamionetaElectricos.remove(camioneta);
            centinela = true;
            break;
        }
    }
    return centinela;
}


public boolean actualizarCamionetaElectrico(String autonomiaCarga, CamionetaElectrico actualizada) {
    boolean centinela = false;
    for (CamionetaElectrico camioneta : CamionetaElectricos) {
        if (camioneta.getAutonomiaCarga().equals(autonomiaCarga)) {
            camioneta.setAutonomiaCarga(actualizada.getAutonomiaCarga());
            camioneta.setTiempoCarga(actualizada.getTiempoCarga());
            camioneta.setCapacidadMaletero(actualizada.getCapacidadMaletero());
            camioneta.setNumBolsas(actualizada.getNumBolsas());
            camioneta.setNumPasajero(actualizada.getNumPasajero());
            camioneta.setNumPuerta(actualizada.getNumPuerta());
            camioneta.setSensorTraficoCR(actualizada.getSensorTraficoCR());
            camioneta.setAsistenteCarril(actualizada.getAsistenteCarril());
            camioneta.setAireAcondicionado(actualizada.getAireAcondicionado());
            camioneta.setVelocidadCrucero(actualizada.getVelocidadCrucero());
            camioneta.setSensoresColision(actualizada.getSensoresColision());
            camioneta.setAbs(actualizada.getAbs());
            camioneta.setCamReversa(actualizada.getCamReversa());
            camioneta.setCuatroXcuatro(actualizada.getCuatroXcuatro());

            centinela = true;
            break;
        }
    }
    return centinela;
}
public boolean verificarCamionetaElectrico(String placa) {
    boolean centinela = false;
    for (CamionetaElectrico camionetaElectrico : CamionetaElectricos) {
        if (camionetaElectrico.getPlaca().equals(placa)) {
            centinela = true;
            break;
        }
    }
    return centinela;
}
public boolean agregarSedanElectrico(SedanElectrico sedanElectrico) {
    boolean centinela = false;
    if (!verificarSedanElectrico(sedanElectrico.getPlaca())) {
        sedanElectricos.add(sedanElectrico); 
        centinela = true;
    }
    return centinela;
}
public boolean eliminarSedanElectrico(String placa) {
    boolean centinela = false;
    for (SedanElectrico sedanElectrico : sedanElectricos) {
        if (sedanElectrico.getPlaca().equals(placa)) {
            sedanElectricos.remove(sedanElectrico);
            centinela = true;
            break;
        }
    }
    return centinela;
}

public boolean actualizarSedanElectrico(String placa, SedanElectrico actualizado) {
    boolean centinela = false;
    for (SedanElectrico sedanElectrico : sedanElectricos) {
        if (sedanElectrico.getPlaca().equals(placa)) {
            sedanElectrico.setPlaca(actualizado.getPlaca());
            sedanElectrico.setAutonomiaCarga(actualizado.getAutonomiaCarga());
            sedanElectrico.setTiempoCarga(actualizado.getTiempoCarga());
            sedanElectrico.setCapacidadMaletero(actualizado.getCapacidadMaletero());
            sedanElectrico.setNumBolsas(actualizado.getNumBolsas());
            sedanElectrico.setNumPasajero(actualizado.getNumPasajero());
            sedanElectrico.setNumPuerta(actualizado.getNumPuerta());
            sedanElectrico.setSensorTraficoCR(actualizado.getSensorTraficoCR());
            sedanElectrico.setAsistenteCarril(actualizado.getAsistenteCarril());
            sedanElectrico.setAireAcondicionado(actualizado.getAireAcondicionado());
            sedanElectrico.setVelocidadCrucero(actualizado.getVelocidadCrucero());
            sedanElectrico.setSensoresColision(actualizado.getSensoresColision());
            sedanElectrico.setAbs(actualizado.getAbs());
            sedanElectrico.setCamReversa(actualizado.getCamReversa());
            centinela = true;
            break;
        }
    }
    return centinela;
}
public boolean verificarSedanElectrico(String placa) {
    boolean centinela = false;
    for (SedanElectrico sedanElectrico : sedanElectricos) {
        if (sedanElectrico.getPlaca().equals(placa)) {
            centinela = true;
            break;
        }
    }
    return centinela;
}

public Collection<CamionetaElectrico> getCamionetaElectricos() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getCamionetaElectricos'");
}

public Collection<SedanElectrico> getSedanElectricos() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getSedanElectricos'");
}

public Collection<BusDiesel> getBusDiesels() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getBusDiesels'");
}

public Collection<CamionDiesel> getCamionDiesels() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getCamionDiesels'");
}


}
