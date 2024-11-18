/**
 * Sample Skeleton for 'CrudCamionetaElectrico.fxml' Controller Class
 */

package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.model.CamionetaElectrico;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CamionetaElectricoViewController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btAtras"
    private Button btAtras; // Value injected by FXMLLoader

    @FXML // fx:id="comboTransmision"
    private ComboBox<String> comboTransmision; // Value injected by FXMLLoader

    @FXML // fx:id="combosensoresColision"
    private ComboBox<String> combosensoresColision; // Value injected by FXMLLoader

    @FXML // fx:id="txtPrecio"
    private TextField txtPrecio; // Value injected by FXMLLoader

    @FXML // fx:id="txtVelocidadMaxima"
    private TextField txtVelocidadMaxima; // Value injected by FXMLLoader

    @FXML // fx:id="tbcCsensorTraficoCR"
    private TableColumn<CamionetaElectrico, String> tbcCsensorTraficoCR; // Value injected by FXMLLoader

    @FXML // fx:id="txtTiempoCarga"
    private TextField txtTiempoCarga; // Value injected by FXMLLoader

    @FXML // fx:id="tbcabs"
    private TableColumn<CamionetaElectrico, String> tbcabs; // Value injected by FXMLLoader

    @FXML // fx:id="tbcCsensoresColision"
    private TableColumn<CamionetaElectrico, String> tbcCsensoresColision; // Value injected by FXMLLoader

    @FXML // fx:id="tbcTiempoCarga"
    private TableColumn<CamionetaElectrico, String> tbcTiempoCarga; // Value injected by FXMLLoader

    @FXML // fx:id="tbcCvelocidadCrucero"
    private TableColumn<CamionetaElectrico, String> tbcCvelocidadCrucero; // Value injected by FXMLLoader

    @FXML // fx:id="tbcCasistenteCarril"
    private TableColumn<CamionetaElectrico, String> tbcCasistenteCarril; // Value injected by FXMLLoader

    @FXML // fx:id="tbcnumPasajeros"
    private TableColumn<CamionetaElectrico, Double> tbcnumPasajeros; // Value injected by FXMLLoader

    @FXML // fx:id="comboCuatroXcuatro"
    private ComboBox<String> comboCuatroXcuatro; // Value injected by FXMLLoader

    @FXML // fx:id="comboabs"
    private ComboBox<String> comboabs; // Value injected by FXMLLoader

    @FXML // fx:id="txtAutonomiaCarga"
    private TextField txtAutonomiaCarga; // Value injected by FXMLLoader

    @FXML // fx:id="txtnumPuertas"
    private TextField txtnumPuertas; // Value injected by FXMLLoader

    @FXML // fx:id="txtnumPasajeros"
    private TextField txtnumPasajeros; // Value injected by FXMLLoader

    @FXML // fx:id="tbcCargaTonelasdas"
    private TableColumn<CamionetaElectrico, String> tbcCargaTonelasdas; // Value injected by FXMLLoader

    @FXML // fx:id="tbcCaireAcondicionado"
    private TableColumn<CamionetaElectrico, String> tbcCaireAcondicionado; // Value injected by FXMLLoader

    @FXML // fx:id="tbcCVelocidadMaxima"
    private TableColumn<CamionetaElectrico, Double> tbcCVelocidadMaxima; // Value injected by FXMLLoader

    @FXML // fx:id="btnVenderCamioneta"
    private Button btnVenderCamioneta; // Value injected by FXMLLoader

    @FXML // fx:id="txtnumBolsas"
    private TextField txtnumBolsas; // Value injected by FXMLLoader

    @FXML // fx:id="combosensorTraficoCR"
    private ComboBox<String> combosensorTraficoCR; // Value injected by FXMLLoader

    @FXML // fx:id="comboaireAcondicionado"
    private ComboBox<String> comboaireAcondicionado; // Value injected by FXMLLoader

    @FXML // fx:id="tbccamReversa"
    private TableColumn<CamionetaElectrico, String> tbccamReversa; // Value injected by FXMLLoader

    @FXML // fx:id="tbcCModelo"
    private TableColumn<CamionetaElectrico, String> tbcCModelo; // Value injected by FXMLLoader

    @FXML // fx:id="tblListCamioneta"
    private TableView<String> tblListCamioneta; // Value injected by FXMLLoader

    @FXML // fx:id="tbcCMarca"
    private TableColumn<CamionetaElectrico, String> tbcCMarca; // Value injected by FXMLLoader

    @FXML // fx:id="btnComprarCamioneta"
    private Button btnComprarCamioneta; // Value injected by FXMLLoader

    @FXML // fx:id="tbcCPrecio"
    private TableColumn<CamionetaElectrico, Double> tbcCPrecio; // Value injected by FXMLLoader

    @FXML // fx:id="btnActualizarCamioneta"
    private Button btnActualizarCamioneta; // Value injected by FXMLLoader

    @FXML // fx:id="tbcCNumeroMatricula"
    private TableColumn<CamionetaElectrico, String> tbcCNumeroMatricula; // Value injected by FXMLLoader

    @FXML // fx:id="tbcAutonomiaCarga"
    private TableColumn<CamionetaElectrico, String> tbcAutonomiaCarga; // Value injected by FXMLLoader

    @FXML // fx:id="btbAgregarCamioneta"
    private Button btbAgregarCamioneta; // Value injected by FXMLLoader

    @FXML // fx:id="txtModelo"
    private TextField txtModelo; // Value injected by FXMLLoader

    @FXML // fx:id="tbcCCuatroXcuatro"
    private TableColumn<CamionetaElectrico, String> tbcCCuatroXcuatro; // Value injected by FXMLLoader

    @FXML // fx:id="btnLimpiar"
    private Button btnLimpiar; // Value injected by FXMLLoader

    @FXML // fx:id="comboNuevoUsado"
    private ComboBox<String> comboNuevoUsado; // Value injected by FXMLLoader

    @FXML // fx:id="tbcnumPuertas"
    private TableColumn<CamionetaElectrico, Double> tbcnumPuertas; // Value injected by FXMLLoader

    @FXML // fx:id="combocamReversa"
    private ComboBox<String> combocamReversa; // Value injected by FXMLLoader

    @FXML // fx:id="tbcCilindraje"
    private TableColumn<CamionetaElectrico, Double> tbcCilindraje; // Value injected by FXMLLoader

    @FXML // fx:id="combovelocidadCrucero"
    private ComboBox<String> combovelocidadCrucero; // Value injected by FXMLLoader

    @FXML // fx:id="tbcnumBolsas"
    private TableColumn<CamionetaElectrico, Double> tbcnumBolsas; // Value injected by FXMLLoader

    @FXML // fx:id="comboasistenteCarril"
    private ComboBox<String> comboasistenteCarril; // Value injected by FXMLLoader

    @FXML // fx:id="txtPlaca"
    private TextField txtPlaca; // Value injected by FXMLLoader

    @FXML // fx:id="btnEliminar"
    private Button btnEliminar; // Value injected by FXMLLoader

    @FXML // fx:id="txtCapacidadMaletero"
    private TextField txtCapacidadMaletero; // Value injected by FXMLLoader

    @FXML // fx:id="txtMarca"
    private TextField txtMarca; // Value injected by FXMLLoader

    @FXML
    void onEliminar() {

    }

    @FXML
    void onLimpiar() {

    }

    @FXML
    void onAgregarCamioneta() {

    }

    @FXML
    void onVenderCamioneta() {

    }

    @FXML
    void onActualizarCamioneta() {

    }

    @FXML
    void onOpenMenu() {

    }

    @FXML
    void onComprarCamioneta() {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btAtras != null
                : "fx:id=\"btAtras\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert comboTransmision != null
                : "fx:id=\"comboTransmision\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert combosensoresColision != null
                : "fx:id=\"combosensoresColision\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert txtPrecio != null
                : "fx:id=\"txtPrecio\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert txtVelocidadMaxima != null
                : "fx:id=\"txtVelocidadMaxima\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert tbcCsensorTraficoCR != null
                : "fx:id=\"tbcCsensorTraficoCR\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert txtTiempoCarga != null
                : "fx:id=\"txtTiempoCarga\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert tbcabs != null
                : "fx:id=\"tbcabs\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert tbcCsensoresColision != null
                : "fx:id=\"tbcCsensoresColision\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert tbcTiempoCarga != null
                : "fx:id=\"tbcTiempoCarga\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert tbcCvelocidadCrucero != null
                : "fx:id=\"tbcCvelocidadCrucero\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert tbcCasistenteCarril != null
                : "fx:id=\"tbcCasistenteCarril\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert tbcnumPasajeros != null
                : "fx:id=\"tbcnumPasajeros\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert comboCuatroXcuatro != null
                : "fx:id=\"comboCuatroXcuatro\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert comboabs != null
                : "fx:id=\"comboabs\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert txtAutonomiaCarga != null
                : "fx:id=\"txtAutonomiaCarga\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert txtnumPuertas != null
                : "fx:id=\"txtnumPuertas\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert txtnumPasajeros != null
                : "fx:id=\"txtnumPasajeros\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert tbcCargaTonelasdas != null
                : "fx:id=\"tbcCargaTonelasdas\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert tbcCaireAcondicionado != null
                : "fx:id=\"tbcCaireAcondicionado\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert tbcCVelocidadMaxima != null
                : "fx:id=\"tbcCVelocidadMaxima\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert btnVenderCamioneta != null
                : "fx:id=\"btnVenderCamioneta\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert txtnumBolsas != null
                : "fx:id=\"txtnumBolsas\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert combosensorTraficoCR != null
                : "fx:id=\"combosensorTraficoCR\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert comboaireAcondicionado != null
                : "fx:id=\"comboaireAcondicionado\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert tbccamReversa != null
                : "fx:id=\"tbccamReversa\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert tbcCModelo != null
                : "fx:id=\"tbcCModelo\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert tblListCamioneta != null
                : "fx:id=\"tblListCamioneta\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert tbcCMarca != null
                : "fx:id=\"tbcCMarca\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert btnComprarCamioneta != null
                : "fx:id=\"btnComprarCamioneta\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert tbcCPrecio != null
                : "fx:id=\"tbcCPrecio\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert btnActualizarCamioneta != null
                : "fx:id=\"btnActualizarCamioneta\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert tbcCNumeroMatricula != null
                : "fx:id=\"tbcCNumeroMatricula\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert tbcAutonomiaCarga != null
                : "fx:id=\"tbcAutonomiaCarga\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert btbAgregarCamioneta != null
                : "fx:id=\"btbAgregarCamioneta\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert txtModelo != null
                : "fx:id=\"txtModelo\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert tbcCCuatroXcuatro != null
                : "fx:id=\"tbcCCuatroXcuatro\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert btnLimpiar != null
                : "fx:id=\"btnLimpiar\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert comboNuevoUsado != null
                : "fx:id=\"comboNuevoUsado\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert tbcnumPuertas != null
                : "fx:id=\"tbcnumPuertas\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert combocamReversa != null
                : "fx:id=\"combocamReversa\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert tbcCilindraje != null
                : "fx:id=\"tbcCilindraje\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert combovelocidadCrucero != null
                : "fx:id=\"combovelocidadCrucero\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert tbcnumBolsas != null
                : "fx:id=\"tbcnumBolsas\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert comboasistenteCarril != null
                : "fx:id=\"comboasistenteCarril\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert txtPlaca != null
                : "fx:id=\"txtPlaca\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert btnEliminar != null
                : "fx:id=\"btnEliminar\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert txtCapacidadMaletero != null
                : "fx:id=\"txtCapacidadMaletero\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";
        assert txtMarca != null
                : "fx:id=\"txtMarca\" was not injected: check your FXML file 'CrudCamionetaElectrico.fxml'.";

    }

    public void setApp(App app) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setApp'");
    }
}
