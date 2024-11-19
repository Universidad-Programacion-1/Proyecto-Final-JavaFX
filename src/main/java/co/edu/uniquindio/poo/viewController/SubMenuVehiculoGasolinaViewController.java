package co.edu.uniquindio.poo.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;


public class SubMenuVehiculoGasolinaViewController {
    App app;
    @FXML
    private URL location;

    @FXML
    private ResourceBundle resources;

    @FXML
    private Button btAtras;

    @FXML
    private Button btMotoGaso;

    @FXML
    private Label txtTitleVehiculo;

    @FXML
    private Button btVanGaso;

    @FXML
    void onOpenCrudMotoGasolina() {
        app.openCrudMotoGasolina();
    }

    @FXML
    void onOpenCrudVanGasolina() {
        app.openCrudVanGasolina();

    }

    public void setApp(App app) {
        this.app = app;
    }

    @FXML
    void initialize() {

    }
    @FXML
    void onOpenMenu() {
        app.openCrudMenuVehiculo();
        

    }

}

