package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Consecionario;

public class LoginController {
    
    Consecionario consecionario;

    public LoginController(Consecionario consecionario) {
        this.consecionario = consecionario;
    }

    public int IniciarSecion(String correo, String contrasena){
        return consecionario.login(correo, contrasena);
    }

}
