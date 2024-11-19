package co.edu.uniquindio.poo.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;

public class SubMenuVehiculoHibridoViewController {
    App app;
    @FXML
    private URL location;

    @FXML
    private ResourceBundle resources;

    @FXML
    private Button btAtras;

    @FXML
    private Button btPickHibrido;

    @FXML
    private Label txtTitleVehiculo;

    @FXML
    private Button btDeporHibrido;

    @FXML
    void onOpenMenu() {
        app.openCrudMenuVehiculo();

    }

    @FXML
    void onOpenCrudDeportivoHibrido() {
        app.openCrudDeportivoHibrido();

    }

    @FXML
    void onOpenCrudPickUpHibrido() {
        app.openCrudPickUpHibrido();

    }
    public void setApp(App app) {
        this.app = app;
    }
    @FXML
    void initialize() {

    }

}

