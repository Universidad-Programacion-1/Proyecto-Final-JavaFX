package co.edu.uniquindio.poo.viewController;


    /**
     * Sample Skeleton for 'CrudBusDiesel.fxml' Controller Class
     */
    
    
    
    import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.BusDieselController;
import co.edu.uniquindio.poo.model.BusDiesel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
    
        public class BusDieselViewController {
    BusDieselController busDieselController;
    ObservableList<BusDiesel> listBusDiesels = FXCollections.observableArrayList();
    BusDiesel selectedBusDiesel;
    
    @SuppressWarnings("unused")
    private App app;
    
        @FXML // ResourceBundle that was given to the FXMLLoader
        private ResourceBundle resources;
    
        @FXML // URL location of the FXML file that was given to the FXMLLoader
        private URL location;
    
        @FXML // fx:id="btAtras"
        private Button btAtras; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtNumeroDeEjes"
        private TextField txtNumeroDeEjes; // Value injected by FXMLLoader
    
        @FXML // fx:id="comboTipoCamion"
        private ComboBox<String> comboTipoCamion; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCNuevoUsado"
        private TableColumn<BusDiesel,String> tbcCNuevoUsado; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtnumeroDePasajeros"
        private TextField txtnumeroDePasajeros; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCnumeroDePuertas"
        private TableColumn<BusDiesel,String> tbcCnumeroDePuertas; // Value injected by FXMLLoader
    
        @FXML // fx:id="comboTransmision"
        private ComboBox<?> comboTransmision; // Value injected by FXMLLoader
    
        @FXML // fx:id="btnVenderBus"
        private Button btnVenderBus; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCModelo"
        private TableColumn<BusDiesel,String> tbcCModelo; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCcamReversa"
        private TableColumn<BusDiesel,String> tbcCcamReversa; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtPrecio"
        private TextField txtPrecio; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCnumDePasajeros"
        private TableColumn<BusDiesel,String> tbcCnumDePasajeros; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtVelocidadMaxima"
        private TextField txtVelocidadMaxima; // Value injected by FXMLLoader
    
        @FXML // fx:id="tblListCamioneta"
        private TableView<BusDiesel> tblListBus; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCMarca"
        private TableColumn<BusDiesel,String> tbcCMarca; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtnumSalidasDeEmergencias"
        private TextField txtnumSalidasDeEmergencias; // Value injected by FXMLLoader
    
        @FXML // fx:id="btnComprarBus"
        private Button btnComprarBus; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCnumSalidasDeEmergencia"
        private TableColumn<BusDiesel,String> tbcCnumSalidasDeEmergencia; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCPrecio"
        private TableColumn<BusDiesel,String> tbcCPrecio; // Value injected by FXMLLoader
    
        @FXML // fx:id="btbAgregarBus"
        private Button btbAgregarBus; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCNumeroMatricula"
        private TableColumn<BusDiesel,String> tbcCNumeroMatricula; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtModelo"
        private TextField txtModelo; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCCuatroXcuatro"
        private TableColumn<BusDiesel,String> tbcCCuatroXcuatro; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCabs"
        private TableColumn<BusDiesel,String> tbcCabs; // Value injected by FXMLLoader
    
        @FXML // fx:id="comboabs"
        private ComboBox<String> comboabs; // Value injected by FXMLLoader
    
        @FXML // fx:id="btnLimpiar"
        private Button btnLimpiar; // Value injected by FXMLLoader
    
        @FXML // fx:id="comboNuevoUsado"
        private ComboBox<String> comboNuevoUsado; // Value injected by FXMLLoader
    
        @FXML // fx:id="combocamReversa"
        private ComboBox<String> combocamReversa; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCnumeroDeBolsas"
        private TableColumn<BusDiesel,String> tbcCnumeroDeBolsas; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCilindraje"
        private TableColumn<BusDiesel,String> tbcCilindraje; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtnumeroDePuertas"
        private TextField txtnumeroDePuertas; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCargaTonelasdas"
        private TableColumn<BusDiesel,String> tbcCargaTonelasdas; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtPlaca"
        private TextField txtPlaca; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCVelocidadMaxima"
        private TableColumn<BusDiesel,String> tbcCVelocidadMaxima; // Value injected by FXMLLoader
    
        @FXML // fx:id="btnEliminar"
        private Button btnEliminar; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtnumeroDeBolas"
        private TextField txtnumeroDeBolas; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtCilindraje"
        private TextField txtCilindraje; // Value injected by FXMLLoader
    
        @FXML // fx:id="btnActualizarBus"
        private Button btnActualizarBus; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtMarca"
        private TextField txtMarca; // Value injected by FXMLLoader
    
        @FXML // fx:id="tbcCTransmision"
        private TableColumn<BusDiesel,String> tbcCTransmision; // Value injected by FXMLLoader
        
        @FXML
        void onActualizarBusDiesel() {
            actualizarBusDiesel();
    
        }
    
        @FXML
        void onAgregarBusDiesel() {
            onAgregarBusDiesel();
        }
            
                @FXML
                void onOpenMenu() {
                    app.openCrudVehiculoDiesel();
                }
            
                @FXML
                void onEliminar() {
            
                }
            
                @FXML
                void onLimpiar() {
                    limpiarCamposBusDiesel();
                }
            
                @FXML
                void onAgregarBus() {
                    onAgregarBusDiesel();
                }
            
                @FXML
                void onVenderBus() {
            
                }
            
                @FXML
                void onActualizarBus() {
            
                }
            
                @FXML
                void onComprarBus() {
            
                }
            
                /**@FXML // This method is called by the FXMLLoader when initialization is complete
                void initialize() {
                    assert btAtras != null : "fx:id=\"btAtras\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert txtNumeroDeEjes != null : "fx:id=\"txtNumeroDeEjes\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert comboTipoCamion != null : "fx:id=\"comboTipoCamion\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert tbcCNuevoUsado != null : "fx:id=\"tbcCNuevoUsado\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert txtnumeroDePasajeros != null : "fx:id=\"txtnumeroDePasajeros\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert tbcCnumeroDePuertas != null : "fx:id=\"tbcCnumeroDePuertas\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert comboTransmision != null : "fx:id=\"comboTransmision\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert btnVenderBus != null : "fx:id=\"btnVenderBus\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert tbcCModelo != null : "fx:id=\"tbcCModelo\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert tbcCcamReversa != null : "fx:id=\"tbcCcamReversa\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert txtPrecio != null : "fx:id=\"txtPrecio\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert tbcCnumDePasajeros != null : "fx:id=\"tbcCnumDePasajeros\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert txtVelocidadMaxima != null : "fx:id=\"txtVelocidadMaxima\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert tblListBus != null : "fx:id=\"tblListCamioneta\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert tbcCMarca != null : "fx:id=\"tbcCMarca\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert txtnumSalidasDeEmergencias != null : "fx:id=\"txtnumSalidasDeEmergencias\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert btnComprarBus != null : "fx:id=\"btnComprarBus\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert tbcCnumSalidasDeEmergencia != null : "fx:id=\"tbcCnumSalidasDeEmergencia\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert tbcCPrecio != null : "fx:id=\"tbcCPrecio\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert btbAgregarBus != null : "fx:id=\"btbAgregarBus\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert tbcCNumeroMatricula != null : "fx:id=\"tbcCNumeroMatricula\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert txtModelo != null : "fx:id=\"txtModelo\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert tbcCCuatroXcuatro != null : "fx:id=\"tbcCCuatroXcuatro\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert tbcCabs != null : "fx:id=\"tbcCabs\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert comboabs != null : "fx:id=\"comboabs\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert btnLimpiar != null : "fx:id=\"btnLimpiar\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert comboNuevoUsado != null : "fx:id=\"comboNuevoUsado\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert combocamReversa != null : "fx:id=\"combocamReversa\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert tbcCnumeroDeBolsas != null : "fx:id=\"tbcCnumeroDeBolsas\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert tbcCilindraje != null : "fx:id=\"tbcCilindraje\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert txtnumeroDePuertas != null : "fx:id=\"txtnumeroDePuertas\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert tbcCargaTonelasdas != null : "fx:id=\"tbcCargaTonelasdas\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert txtPlaca != null : "fx:id=\"txtPlaca\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert tbcCVelocidadMaxima != null : "fx:id=\"tbcCVelocidadMaxima\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert btnEliminar != null : "fx:id=\"btnEliminar\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert txtnumeroDeBolas != null : "fx:id=\"txtnumeroDeBolas\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert txtCilindraje != null : "fx:id=\"txtCilindraje\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert btnActualizarBus != null : "fx:id=\"btnActualizarBus\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert txtMarca != null : "fx:id=\"txtMarca\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                    assert tbcCTransmision != null : "fx:id=\"tbcCTransmision\" was not injected: check your FXML file 'CrudBusDiesel.fxml'.";
                
                }/** */


                private void initView() {
                    // Traer los datos del cliente a la tabla
                    initDataBinding();
            
                    // Obtiene la lista
                    obtenerBusDiesel();
            
                    // Limpiar la tabla
                    tblListBus.getItems().clear();
            
                    // Agregar los elementos a la tabla
                    tblListBus.setItems(listBusDiesels);
            
                    // Seleccionar elemento de la tabla
                    listenerSelection();
                }

                private void initDataBinding() {
                    txtPlaca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPlaca()));
                    txtMarca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
                    txtModelo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
                    txtCilindraje.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCilindraje()));
                    txtPrecio.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPrecio()));
                    txtVelocidadMaxima.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getVelocidadMaxima()));
                    txtNumeroDeEjes.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNumeroEjes()));
                    comboAbs.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getAbs()));
                    comboCamaraReversa.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCamaraReversa()));
                    comboTransmision.set
                
                
                
                
                    void initialize() {
                    BusDieselController = new BusBusDiesel BusDieselController.setApp(this);(app.consecionario); BusDieselController.setApp(this);
                    comboabs.getItems().addAll("Si", "No");
                    combocamReversa.getItems().addAll("Si", "No");
                    comboNuevoUsado.getItems().addAll("Nuevo", "Usado");
                    comboTransmision.getItems().addAll("Automatica", "Manual");
             
                     initView();    
                    
                    
                    }


                private void obtenerBusBusDiesel BusDieselController.setApp(this);() {
                    listBusBusDiesel BusDieselController.setApp(this);s.addAll(BusDiesel BusDieselController.setApp(this);.obtenerListaBusBusDiesel BusDieselController.setApp(this);());
                }
            
                
    private void listenerSelection; {
        tblListBus.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedBusDiesel = (BusDiesel) newSelection;
            mostrarInformacionBusDiesel(newSelection);
        });
    }

                private void agregarBusDiesel; {
        BusDiesel busDiesel = buildBusDiesel();
        if (busDieselController.crearBusDiesel(busDiesel)) {
            listBusDiesels.add(busDiesel);
            limpiarCamposBusDiesel();
        }
    }
                
    private BusDiesel buildBusDiesel; {
        BusDiesel busBusDiesel = new BusDiesel (txtCilindraje.getText(), txtMarca.getText(), txtModelo.getText(), txtNumeroDeEjes.getText(), txtnumeroDeBolas.getText(), txtnumeroDePasajeros.getText(), txtnumeroDePuertas.getText(), txtPlaca.getText(), txtPrecio.getText(), txtVelocidadMaxima.getText(), txtnumSalidasDeEmergencias.getText(), comboabs.getValue(), combocamReversa.getValue(), comboNuevoUsado.getValue(), comboTransmision.getValue(), comboTipoCamion.getValue());
        return busBusDiesel;
    }

                
    private void eliminarBusDiesel;{
        if (busDieselController.eliminarBusDiesel(txtPlaca.getText())) {
            listBusDiesels.remove(selectedBusDiesel);
            limpiarCamposBusDiesel();
            limpiarSeleccion();
        }
    }




                private void actualizarBusDiesel; {

                    if (selectedBusDiesel != null && busDieselController.actualizarBusDiesel(selectedBusDiesel.getPlaca(), buildBusDiesel())) {
            
                        int index = listBusDiesels.indexOf(selectedBusDiesel);
                        if (index >= 0) {
                            listBusDiesels.set(index, buildBusDiesel());
                        }
            
                        tblListBusDiesel.refresh();
                        limpiarSeleccion();
                        limpiarCamposBusDiesel();
                    }
                }
    private void limpiarSeleccion;{
        tblListBus.getSelectionModel().clearSelection();
        limpiarCampostblListBus();
    }
        
                private void limpiarCamposBusDiesel; {
                txtCilindraje.clear();
                txtMarca.clear();
                txtModelo.clear();
                txtNumeroDeEjes.clear();
                txtnumeroDeBolas.clear();
                txtnumeroDePasajeros.clear();
                txtnumeroDePuertas.clear();
                txtPlaca.clear();
                txtPrecio.clear();
                txtVelocidadMaxima.clear();
                txtnumSalidasDeEmergencias.clear();
                comboabs.clear();
                combocamReversa.clear();
                comboNuevoUsado.clear();
                comboTransmision.clear();
                comboTipoCamion.clear();
                
                }
        
        
        
                /**
                 * @param app
                 */
                @Override
                public void setApp;App app; {
                    this.app = app;
        }
    
    }
}

