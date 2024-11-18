package co.edu.uniquindio.poo.viewController;


    /**
     * Sample Skeleton for 'CrudCamionDiesel.fxml' Controller Class
     */
    
    
    
    import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
    public class CamionDieselViewController {
    
        @FXML // ResourceBundle that was given to the FXMLLoader
        private ResourceBundle resources;
    
        @FXML // URL location of the FXML file that was given to the FXMLLoader
        private URL location;
    
        @FXML // fx:id="btAtras"
        private Button btAtras; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtNumeroDeEjes"
        private TextField txtNumeroDeEjes; // Value injected by FXMLLoader
    
        @FXML // fx:id="comboTipoCamion"
        private ComboBox<?> comboTipoCamion; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCNuevoUsado"
        private TableColumn<?, ?> tbcCNuevoUsado; // Value injected by FXMLLoader
    
        @FXML // fx:id="comboTransmision"
        private ComboBox<?> comboTransmision; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCModelo"
        private TableColumn<?, ?> tbcCModelo; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCcamReversa"
        private TableColumn<?, ?> tbcCcamReversa; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtPrecio"
        private TextField txtPrecio; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtVelocidadMaxima"
        private TextField txtVelocidadMaxima; // Value injected by FXMLLoader
    
        @FXML // fx:id="tblListCamion"
        private TableView<?> tblListCamion; // Value injected by FXMLLoader
    
        @FXML // fx:id="btbAgregarCamion"
        private Button btbAgregarCamion; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCMarca"
        private TableColumn<?, ?> tbcCMarca; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCPrecio"
        private TableColumn<?, ?> tbcCPrecio; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCNumeroMatricula"
        private TableColumn<?, ?> tbcCNumeroMatricula; // Value injected by FXMLLoader
    
        @FXML // fx:id="btnComprarCamion"
        private Button btnComprarCamion; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtModelo"
        private TextField txtModelo; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCCuatroXcuatro"
        private TableColumn<?, ?> tbcCCuatroXcuatro; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCabs"
        private TableColumn<?, ?> tbcCabs; // Value injected by FXMLLoader
    
        @FXML // fx:id="comboabs"
        private ComboBox<?> comboabs; // Value injected by FXMLLoader
    
        @FXML // fx:id="btnLimpiar"
        private Button btnLimpiar; // Value injected by FXMLLoader
    
        @FXML // fx:id="comboNuevoUsado"
        private ComboBox<?> comboNuevoUsado; // Value injected by FXMLLoader
    
        @FXML // fx:id="combocamReversa"
        private ComboBox<?> combocamReversa; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCilindraje"
        private TableColumn<?, ?> tbcCilindraje; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCargaTonelasdas"
        private TableColumn<?, ?> tbcCargaTonelasdas; // Value injected by FXMLLoader
    
        @FXML // fx:id="btnActualizarCamion"
        private Button btnActualizarCamion; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtPlaca"
        private TextField txtPlaca; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCVelocidadMaxima"
        private TableColumn<?, ?> tbcCVelocidadMaxima; // Value injected by FXMLLoader
    
        @FXML // fx:id="btnEliminar"
        private Button btnEliminar; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtCilindraje"
        private TextField txtCilindraje; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtMarca"
        private TextField txtMarca; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCTransmision"
        private TableColumn<?, ?> tbcCTransmision; // Value injected by FXMLLoader
    
        @FXML // fx:id="btnVenderCamion"
        private Button btnVenderCamion; // Value injected by FXMLLoader
    
        @FXML
        void onOpenMenu() {
    
        }
    
        @FXML
        void onEliminar() {
    
        }
    
        @FXML
        void onLimpiar() {
    
        }
    
        @FXML
        void onAgregarCamion() {
    
        }
    
        @FXML
        void onVenderCamion() {
    
        }
    
        @FXML
        void onActualizarCamion() {
    
        }
    
        @FXML
        void onComprarCamion() {
    
        }
    
        @FXML // This method is called by the FXMLLoader when initialization is complete
        void initialize() {
            assert btAtras != null : "fx:id=\"btAtras\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert txtNumeroDeEjes != null : "fx:id=\"txtNumeroDeEjes\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert comboTipoCamion != null : "fx:id=\"comboTipoCamion\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert tbcCNuevoUsado != null : "fx:id=\"tbcCNuevoUsado\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert comboTransmision != null : "fx:id=\"comboTransmision\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert tbcCModelo != null : "fx:id=\"tbcCModelo\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert tbcCcamReversa != null : "fx:id=\"tbcCcamReversa\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert txtPrecio != null : "fx:id=\"txtPrecio\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert txtVelocidadMaxima != null : "fx:id=\"txtVelocidadMaxima\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert tblListCamion != null : "fx:id=\"tblListCamion\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert btbAgregarCamion != null : "fx:id=\"btbAgregarCamion\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert tbcCMarca != null : "fx:id=\"tbcCMarca\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert tbcCPrecio != null : "fx:id=\"tbcCPrecio\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert tbcCNumeroMatricula != null : "fx:id=\"tbcCNumeroMatricula\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert btnComprarCamion != null : "fx:id=\"btnComprarCamion\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert txtModelo != null : "fx:id=\"txtModelo\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert tbcCCuatroXcuatro != null : "fx:id=\"tbcCCuatroXcuatro\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert tbcCabs != null : "fx:id=\"tbcCabs\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert comboabs != null : "fx:id=\"comboabs\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert btnLimpiar != null : "fx:id=\"btnLimpiar\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert comboNuevoUsado != null : "fx:id=\"comboNuevoUsado\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert combocamReversa != null : "fx:id=\"combocamReversa\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert tbcCilindraje != null : "fx:id=\"tbcCilindraje\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert tbcCargaTonelasdas != null : "fx:id=\"tbcCargaTonelasdas\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert btnActualizarCamion != null : "fx:id=\"btnActualizarCamion\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert txtPlaca != null : "fx:id=\"txtPlaca\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert tbcCVelocidadMaxima != null : "fx:id=\"tbcCVelocidadMaxima\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert btnEliminar != null : "fx:id=\"btnEliminar\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert txtCilindraje != null : "fx:id=\"txtCilindraje\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert txtMarca != null : "fx:id=\"txtMarca\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert tbcCTransmision != null : "fx:id=\"tbcCTransmision\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
            assert btnVenderCamion != null : "fx:id=\"btnVenderCamion\" was not injected: check your FXML file 'CrudCamionDiesel.fxml'.";
    
        }
    }
    

