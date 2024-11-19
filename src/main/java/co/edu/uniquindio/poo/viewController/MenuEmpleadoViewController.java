package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MenuEmpleadoViewController {

    @FXML
    private ResourceBundle resources;

    App app;
    
    @FXML
    private URL location;

    @FXML
    private Label btnAtras;

    @FXML
    private Button btGestioCliente;

    @FXML
    private Label txtTitleVehiculos;

    @FXML
    private Button btGestioVehiculos;

    @FXML
    void onOpenCrudCliente() {
        app.openCrudCliente();
    }

    @FXML
    void onOpenCrudVehiculos() {
        app.openCrudMenuVehiculo();
    }

    @FXML
    void onIniciaeSesion() {
        app.openViewLogin();
    }

    public void setApp(App app) {
        this.app = app;
    }
}

