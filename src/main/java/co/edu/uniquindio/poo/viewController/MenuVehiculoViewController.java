package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MenuVehiculoViewController {
    
    App app;

    @FXML
    private Button btAtras;

    @FXML
    private Button btVehDiesel;

    @FXML
    private Button btVehGasolina;

    @FXML
    private Label txtTitleCombustible;

    @FXML
    private Button btVehElectrico;

    @FXML
    private Button btVehHibrido;

    @FXML
    void onOpenMenu() {
        app.openMenuAdmin();
    }

    @FXML
    void onOpenCrudSubMenuVehiculoGasolina() {
        app.openCrudSubMenuVehiculoGasolina();

    }

    @FXML
    void onOpenCrudSubMenuVehiculoHibrido() {
        app.openCrudSubMenuVehiculoHibrido();

    }

    @FXML
    void onOpenCrudSubMenuVehiculoElectrico() {
    }

    @FXML
    void onOpenCrudSubMenuVehiculoDiesel() {

    }
    public void setApp(App app) {
        this.app = app;
    }

}

