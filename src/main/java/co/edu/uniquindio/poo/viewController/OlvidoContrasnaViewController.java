package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class OlvidoContrasnaViewController {

    @FXML
    private ResourceBundle resources;

    App app;
    @FXML
    private URL location;

    @FXML
    private TextField txtOlvidoPalabraSecreta;

    @FXML
    private Label txtOlvidoContrasena;

    @FXML
    private Button btnOlvidoContrasena;

    @FXML
    private Label txtTitleVehiculos;

    @FXML
    void onIniciarPalabra() {
        
    }

    @FXML
    void onProbarCorreo() {

    }

    public void setApp(App app) {
        this.app = app;
    }

    @FXML
    void initialize() {

    }

    private void redirect(){

    }
}
