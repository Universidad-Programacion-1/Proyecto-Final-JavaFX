package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
public class MenuClienteViewController {

    @FXML
    private ResourceBundle resources;

    App app;
    
    @FXML
    private URL location;

    @FXML
    private Label btnAtras;

    @FXML
    private TableColumn<?, ?> tbcTelefono;

    @FXML
    private TableView<?> tblListCliente;

    @FXML
    private Label btnAtras1;

    @FXML
    private TableColumn<?, ?> tbcCedula;

    @FXML
    private TableColumn<?, ?> tbcPalabraSecreta;

    @FXML
    private TableColumn<?, ?> tbcCorreo;

    @FXML
    void onIniciaeSesion() {

    }

    public void setApp(App app) {
        this.app = app;
    }
}

