package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;

public class Consecionario {
    
    private Collection<Admin> admins;
    private Collection<Empleado> empleados;
    private Collection<Cliente> clientes;
    int tipoPersona;
    private String nombre;
    private Collection<Vehiculo> vehiculos;
    private Collection<DeportivoHibrido> deportivoHibridos;
    private Collection<PickUpHibrido> pickUpHibridos;
    private Collection<MotoGasolina> motoGasolinas;
    private Collection<VanGasolina> vanGasolinas;
    Empleado empleado1;
    Admin admin1;

    public Consecionario(String nombre) {
        this.nombre = nombre;
        deportivoHibridos = new LinkedList<>();
        pickUpHibridos = new LinkedList<>();
        motoGasolinas = new LinkedList<>();
        vanGasolinas = new LinkedList<>();
        this.admins = new LinkedList<>();
        this.empleados = new LinkedList<>();
        this.clientes = new LinkedList<>();
        this.vehiculos = new LinkedList<>();
        //personas = new LinkedList<>();
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Collection<Vehiculo> getVehiculos() {
        System.out.println("GetVehiculo"+vehiculos);
        return vehiculos;
    }

    public void setVehiculos(Collection<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }



    public boolean crearAdmin(Admin admin) {
        System.out.println(admin);
        boolean centinela = false;
        if (!verificarAdmin(admin.getId())) {
            admins.add(admin);
            admin1=admin;
            centinela = true;
        }
        return centinela;
    }

    public int tipoPersona(){
        int tipo = tipoPersona;
        return tipo;
    }

    public boolean eliminarAdmin(String cedula) {
        boolean centinela = false;
        for (Admin admin : admins) {
            if (admin.getId().equals(cedula)) {
                admins.remove(admin);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean verificarAdmin(String cedula) {
        boolean centinela = false;
        for (Admin admin : admins) {
            if (admin.getId().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean actualizarAdmin(String cedula, Admin actualizado) {
        boolean centinela = false;
        for (Admin admin : admins) {
            if (admin.getId().equals(cedula)) {
                admin.setId(actualizado.getId());
                admin.setGmail(actualizado.getGmail());
                admin.setTelefono(actualizado.getTelefono());
                admin.setPalabraSecreta(actualizado.getPalabraSecreta());
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean palabraSecreta(String palabra){
        boolean centinela=false;
        // if (clientes.getPalabraSecreta().equals(palabra)) {
        //     centinela = true;
        // }else if (empleados.stream().anyMatch(empleado -> empleado.getPalabraSecreta().equals(palabra))) {
        //     centinela = true;
        // }else if (admins.stream().anyMatch(admin -> admin.getPalabraSecreta().equals(palabra))) {
        //     centinela = true;
        // }
        return centinela;
    }

    public int login(String correo, String contrasena){
        //verificaUser(correo, contrasena);
        // System.out.println(correo + contrasena);
        int tipo = 0;
        System.out.println(empleados);
        // System.err.println("Lista de clientes"+ clientes.getClientes());
        // System.err.println("Lista de Empleados"+ empleados);
        // System.err.println("Lista de Admins"+ admins);
        for (Admin admin : admins) {
            if (admin.getGmail().equals(correo) && admin.getId().equals(contrasena)) {
                tipo = 3;
                tipoPersona = tipo;
                admin1 = admin;
            }
        }
        for (Cliente cliente : listarClientes()) {
            if (cliente.getGmail().equals(correo) && cliente.getId().equals(contrasena)) {
                tipo = 1;
                tipoPersona = tipo;
            }
        }
        for (Empleado empleado : listarEmpleados()) {
            if (empleado.getGmail().equals(correo) && empleado.getId().equals(contrasena)) {
                tipo = 2;
                tipoPersona = tipo;
                empleado1 = empleado;
            }

        }
        return tipo;
    }
    public Collection<Empleado> listarEmpleados(){
        return admin1.getEmpleados();
    }
    public Collection<Cliente> listarClientes(){
        Collection<Cliente> lista = new LinkedList<>();
        for (Cliente cliente : admin1.getClientes()) {
            lista.add(cliente);
        }
        for (Cliente cliente : empleado1.getClientes()) {
            lista.add(cliente);
        }

        return admin1.getClientes();
    }

    public boolean crearCompraMoto(Vehiculo vehiculo){
        boolean centinela = false;
        if (eliminarMotoGasolina(vehiculo.getPlaca())) {
            agregarVehiculo(vehiculo);
            centinela = true;
        }
        return centinela;
    }
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
        System.err.println("Lista DE CONSESIONARIO "+ vehiculo);
        System.err.println("Lista DE CONSESIONARIO "+ vehiculos);
    }
    // public Collection<Cliente> listarClientesE(){
    //     return empleado1.getClientes();
    // }

    public boolean agregarEmpleado(Empleado empleado){
        boolean centinela=false;
        if (admin1.crearEmpleado(empleado)) {
            empleado1 = empleado;
            centinela = true;
        }
        return centinela;
    }

    public boolean eliminarEmpleado(String cedula){
        boolean centinela=false;
        if (admin1.eliminarEmpleado(cedula)) {
            centinela = true;
        }
        return centinela;
    }

    public boolean actualizarEmpleado(String cedula, Empleado empleado){
        boolean centinela=false;
        if (admin1.actualizarEmpleado(cedula, empleado)) {
            centinela = true;
        }
        return centinela;
    }

    public boolean eliminarCliente(String cedula){
        boolean centinela=false;
        if (tipoPersona == 2) {
            if (empleado1.eliminarCliente(cedula)) {
                centinela = true;
            }   
        }else if (tipoPersona == 3) {
            if (admin1.eliminarCliente(cedula)) {
                centinela = true;   
            }
        }
        return centinela;
    }

    public boolean actualizarCliente(String cedula, Cliente empleado){
        boolean centinela=false;
        if (tipoPersona == 2) {
            if (empleado1.actualizarCliente(cedula, empleado)) {
                centinela = true;
            }   
        }else if (tipoPersona == 3) {
            if (admin1.actualizarCliente(cedula, empleado)) {
                centinela = true;   
            }
        }
        return centinela;
    }

    
    public boolean agregarCliente(Cliente cliente){
        boolean centinela=false;
        if (tipoPersona == 3) {
            if (admin1.crearCliente(cliente)) {
                centinela = true;   
            }
        }
        if (tipoPersona == 2) {
            if (empleado1.crearCliente(cliente)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public Collection<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(Collection<Admin> admins) {
        this.admins = admins;
    }


    public Collection<DeportivoHibrido> getDeportivoHibridos() {
        return deportivoHibridos;
    }



    public void setDeportivoHibridos(Collection<DeportivoHibrido> deportivoHibridos) {
        this.deportivoHibridos = deportivoHibridos;
    }
    



    public Collection<MotoGasolina> getMotoGasolinas() {
        return motoGasolinas;
    }



    public void setMotoGasolinas(Collection<MotoGasolina> motoGasolinas) {
        this.motoGasolinas = motoGasolinas;
    }



    public Collection<VanGasolina> getVanGasolinas() {
        return vanGasolinas;
    }



    public void setVanGasolinas(Collection<VanGasolina> vanGasolinas) {
        this.vanGasolinas = vanGasolinas;
    }



    public Collection<PickUpHibrido> getPickUpHibridos() {
        return pickUpHibridos;
    }



    public void setPickUpHibridos(Collection<PickUpHibrido> pickUpHibridos) {
        this.pickUpHibridos = pickUpHibridos;
    }



    /**
     * Se agregaron los vehiculos a la lista de deportivos Hibridos
     * @param deportivoHibrido
     * @return
     */
    public boolean agregarDeportivoHibrido(DeportivoHibrido deportivoHibrido) {
        boolean centinela = false;
        if (!verificarDeportivoHibrido(deportivoHibrido.getPlaca())) {
            deportivoHibridos.add(deportivoHibrido);
            centinela = true;
        }
        return centinela;
    }


    /**
     * Se eliminaron los vehiculos que estan repetidos por el atributo placa
     * @param placa
     * @return
     */
    public boolean eliminarDeportivoHibrido(String placa) {
        boolean centinela = false;
        for (DeportivoHibrido deportivoHibrido : deportivoHibridos) {
            if (deportivoHibrido.getPlaca().equals(placa)) {
                deportivoHibridos.remove(deportivoHibrido);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    /**
     * Se realiz+o la actualización de los vehiculos deportivos hibridos que entran a la lista
     * @param placa
     * @param actualizado
     * @return
     */
    public boolean actualizarDeportivoHibrido(String placa, DeportivoHibrido actualizado) {
        boolean centinela = false;
        for (DeportivoHibrido deportivoHibrido : deportivoHibridos) {
            if (deportivoHibrido.getPlaca().equals(placa)) {
                deportivoHibrido.setPlaca(actualizado.getPlaca());
                deportivoHibrido.setMarca(actualizado.getMarca());
                deportivoHibrido.setModelo(actualizado.getModelo());
                deportivoHibrido.setNuevoUsado(actualizado.getNuevoUsado());
                deportivoHibrido.setTransmision(actualizado.getTransmision());
                deportivoHibrido.setVelocidadmax(actualizado.getVelocidadmax());
                deportivoHibrido.setCilindraje(actualizado.getCilindraje());
                deportivoHibrido.setEnchufable(actualizado.getEnchufable());
                deportivoHibrido.setTipoHibrido(actualizado.getTipoHibrido());
                deportivoHibrido.setNumBolsas(actualizado.getNumBolsas());
                deportivoHibrido.setNumPasajero(actualizado.getNumPasajero());
                deportivoHibrido.setNumPuerta(actualizado.getNumPuerta());
                deportivoHibrido.setNumCaballoFuerza(actualizado.getNumCaballoFuerza());
                deportivoHibrido.setTiempo0a100km(actualizado.getTiempo0a100km());
                deportivoHibrido.setPrecio(actualizado.getPrecio());
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    /**
     * Se realizó la verificación de los vehiculos deportivos hibridos que entran a la lista
     * @param placa
     * @return
     */
    public boolean verificarDeportivoHibrido(String placa) {
        boolean centinela = false;
        for (DeportivoHibrido deportivoHibrido : deportivoHibridos) {
            if (deportivoHibrido.getPlaca().equals(placa)) {
                centinela = true;
            }
        }
        return centinela;
    }
    /**
     * Se agregaron los vehiculos a la lista de pick up Hibridos
     * @param deportivoHibrido
     * @return
     */
    public boolean agregarPickUpHibrido(PickUpHibrido pickUpHibrido) {
        boolean centinela = false;
        if (!verificarPickUpHibrido(pickUpHibrido.getPlaca())) {
            pickUpHibridos.add(pickUpHibrido);
            centinela = true;
        }
        return centinela;
    }


    /**
     * Se eliminaron los vehiculos que estan repetidos por el atributo placa
     * @param placa
     * @return
     */
    public boolean eliminarPickUpHibrido(String placa) {
        boolean centinela = false;
        for (PickUpHibrido pickUpHibrido : pickUpHibridos) {
            if (pickUpHibrido.getPlaca().equals(placa)) {
                pickUpHibridos.remove(pickUpHibrido);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    /**
     * Se realizó la actualización de los vehiculos pick up hibridos que entran a la lista
     * @param placa
     * @param actualizado
     * @return
     */
    public boolean actualizarPickUpHibrido(String placa, PickUpHibrido actualizado) {
        boolean centinela = false;
        for (PickUpHibrido pickUpHibrido : pickUpHibridos) {
            if (pickUpHibrido.getPlaca().equals(placa)) {
                pickUpHibrido.setPlaca(actualizado.getPlaca());
                pickUpHibrido.setMarca(actualizado.getMarca());
                pickUpHibrido.setModelo(actualizado.getModelo());
                pickUpHibrido.setNuevoUsado(actualizado.getNuevoUsado());
                pickUpHibrido.setTransmision(actualizado.getTransmision());
                pickUpHibrido.setVelocidadmax(actualizado.getVelocidadmax());
                pickUpHibrido.setCilindraje(actualizado.getCilindraje());
                pickUpHibrido.setEnchufable(actualizado.getEnchufable());
                pickUpHibrido.setTipoHibrido(actualizado.getTipoHibrido());
                pickUpHibrido.setNumBolsas(actualizado.getNumBolsas());
                pickUpHibrido.setNumPasajero(actualizado.getNumPasajero());
                pickUpHibrido.setNumPuerta(actualizado.getNumPuerta());
                pickUpHibrido.setCamReversa(actualizado.getCamReversa());
                pickUpHibrido.setAbs(actualizado.getAbs());
                pickUpHibrido.setCapacidadCajaCarga(actualizado.getCapacidadCajaCarga());
                pickUpHibrido.setAireAcondicionado(actualizado.getAireAcondicionado());
                pickUpHibrido.setCuatroXcuatro(actualizado.getCuatroXcuatro());
                pickUpHibrido.setPrecio(actualizado.getPrecio());
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    /**
     * Se realizó la verificación de los vehiculos pick up hibridos que entran a la lista
     * @param placa
     * @return
     */
    public boolean verificarPickUpHibrido(String placa) {
        boolean centinela = false;
        for (PickUpHibrido pickUpHibrido : pickUpHibridos) {
            if (pickUpHibrido.getPlaca().equals(placa)) {
                centinela = true;
            }
        }
        return centinela;
    }
    /**
     * Se agregaron los vehiculos a la lista de moto gasolina
     * @param deportivoHibrido
     * @return
     */
    public boolean agregarMotoGasolina(MotoGasolina motoGasolina) {
        boolean centinela = false;
        if (!verificarMotoGasolina(motoGasolina.getPlaca())) {
            motoGasolinas.add(motoGasolina);
            centinela = true;
        }
        return centinela;
    }


    /**
     * Se eliminaron los vehiculos que estan repetidos por el atributo placa
     * @param placa
     * @return
     */
    public boolean eliminarMotoGasolina(String placa) {
        boolean centinela = false;
        for (MotoGasolina motoGasolina : motoGasolinas) {
            if (motoGasolina.getPlaca().equals(placa)) {
                motoGasolinas.remove(motoGasolina);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    /**
     * Se realizó la actualización de los vehiculos moto gasolina que entran a la lista
     * @param placa
     * @param actualizado
     * @return
     */
    public boolean actualizarMotoGasolina(String placa, MotoGasolina actualizado) {
        boolean centinela = false;
        for (MotoGasolina motoGasolina : motoGasolinas) {
            if (motoGasolina.getPlaca().equals(placa)) {
                motoGasolina.setPlaca(actualizado.getPlaca());
                motoGasolina.setMarca(actualizado.getMarca());
                motoGasolina.setModelo(actualizado.getModelo());
                motoGasolina.setNuevoUsado(actualizado.getNuevoUsado());
                motoGasolina.setTransmision(actualizado.getTransmision());
                motoGasolina.setVelocidadmax(actualizado.getVelocidadmax());
                motoGasolina.setCilindraje(actualizado.getCilindraje());
                motoGasolina.setGalonesGasolina(actualizado.getGalonesGasolina());
                motoGasolina.setPrecio(actualizado.getPrecio());
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    /**
     * Se realizó la verificación de los vehiculos moto gasolina que entran a la lista
     * @param placa
     * @return
     */
    public boolean verificarMotoGasolina(String placa) {
        boolean centinela = false;
        for (MotoGasolina motoGasolina : motoGasolinas) {
            if (motoGasolina.getPlaca().equals(placa)) {
                centinela = true;
            }
        }
        return centinela;
    }
    
    /**
     * Se agregaron los vehiculos a la lista de van Gasolina
     * @param deportivoHibrido
     * @return
     */
    public boolean agregarVanGasolina(VanGasolina vanGasolina) {
        boolean centinela = false;
        if (!verificarVanGasolina(vanGasolina.getPlaca())) {
            vanGasolinas.add(vanGasolina);
            centinela = true;
        }
        return centinela;
    }


    /**
     * Se eliminaron los vehiculos que estan repetidos por el atributo placa
     * @param placa
     * @return
     */
    public boolean eliminarVanGasolina(String placa) {
        boolean centinela = false;
        for (VanGasolina vanGasolina : vanGasolinas) {
            if (vanGasolina.getPlaca().equals(placa)) {
                vanGasolinas.remove(vanGasolina);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    /**
     * Se realizó la actualización de los vehiculos van Gasolina que entran a la lista
     * @param placa
     * @param actualizado
     * @return
     */
    public boolean actualizarVanGasolina(String placa, VanGasolina actualizado) {
        boolean centinela = false;
        for (VanGasolina vanGasolina : vanGasolinas) {
            if (vanGasolina.getPlaca().equals(placa)) {
                vanGasolina.setPlaca(actualizado.getPlaca());
                vanGasolina.setMarca(actualizado.getMarca());
                vanGasolina.setModelo(actualizado.getModelo());
                vanGasolina.setNuevoUsado(actualizado.getNuevoUsado());
                vanGasolina.setTransmision(actualizado.getTransmision());
                vanGasolina.setVelocidadmax(actualizado.getVelocidadmax());
                vanGasolina.setCilindraje(actualizado.getCilindraje());
                vanGasolina.setGalonesGasolina(actualizado.getGalonesGasolina());
                vanGasolina.setCapacidadMaletero(actualizado.getCapacidadMaletero());
                vanGasolina.setNumPuertas(actualizado.getNumPuertas());
                vanGasolina.setNumBolsas(actualizado.getNumBolsas());
                vanGasolina.setAireAcondicionado(actualizado.getAireAcondicionado());
                vanGasolina.setCamTrasera(actualizado.getCamTrasera());
                vanGasolina.setAbs(actualizado.getAbs());
                vanGasolina.setPrecio(actualizado.getPrecio());
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    /**
     * Se realizó la verificación de los vehiculos van Gasolina que entran a la lista
     * @param placa
     * @return
     */
    public boolean verificarVanGasolina(String placa) {
        boolean centinela = false;
        for (VanGasolina vanGasolina : vanGasolinas) {
            if (vanGasolina.getPlaca().equals(placa)) {
                centinela = true;
            }
        }
        return centinela;
    }

    
}
