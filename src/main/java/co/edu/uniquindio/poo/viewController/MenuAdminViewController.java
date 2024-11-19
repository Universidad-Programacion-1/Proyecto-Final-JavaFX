package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MenuAdminViewController {

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
    private Button btGestioAdmin;

    @FXML
    private Label txtTitleVehiculos;

    @FXML
    private Button btGestioVehiculos;

    @FXML
    private Button btGestioEmpleado;

    @FXML
    void onOpenCrudAdmin() {
        app.openCrudAdmin();
    }

    @FXML
    void onOpenCrudEmpleados() {
        app.openCrudEmpleado();
    }

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

