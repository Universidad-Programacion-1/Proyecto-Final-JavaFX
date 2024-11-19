package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.LoginController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginViewController {

    @FXML
    private ResourceBundle resources;

    App app;

    LoginController loginController;

    @FXML
    private URL location;

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Label txtTitleLogin;

    @FXML
    private TextField txtContrasena;

    @FXML
    private Label txtOlvidoContrasena;

    @FXML
    private TextField txtCorreo;

    @FXML
    void onIniciarSesion() {
        redirect();
    }

    @FXML
    void onOlvidoContrasena() {
        app.openViewOlvidoContrasena();
    }

    public void setApp(App app) {
        this.app = app;
    }

    @FXML
    void initialize() {
        loginController = new LoginController(app.consecionario);
    }

    private void redirect(){
        System.out.println("Entro a redirec "+ txtCorreo.getText()+ txtContrasena.getText());
        int tipo = loginController.IniciarSecion(txtCorreo.getText(), txtContrasena.getText());
        System.out.println("Tipo persona "+ tipo);

        if (tipo == 1) { 
            app.openMenuCliente();
        }else if (tipo == 2) {
            app.openMenuEmpleado();
        }else if (tipo == 3) {
            app.openMenuAdmin();
        }
    }
}
