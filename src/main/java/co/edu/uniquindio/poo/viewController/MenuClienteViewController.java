package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.ClienteController;
import co.edu.uniquindio.poo.controller.MenuClienteController;
import co.edu.uniquindio.poo.model.MotoGasolina;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
public class MenuClienteViewController {

    MenuClienteController menuClienteController;
    ObservableList<Vehiculo> listVehiculos = FXCollections.observableArrayList();
    Vehiculo selectedVehiculo;

    @FXML
    private ResourceBundle resources;

    App app;
    
    @FXML
    private URL location;

    @FXML
    private Label btnAtras;

    @FXML
    private TableColumn<Vehiculo, Double> tbcVelocidadMax;

    @FXML
    private TableColumn<Vehiculo, String> tbcMarca;

    @FXML
    private TableColumn<Vehiculo, String> tbcModelo;

    @FXML
    private TableColumn<Vehiculo, String> tbcTanque;

    @FXML
    private TableColumn<Vehiculo, String> tbcTransmision;

    @FXML
    private Label btnAtras1;

    @FXML
    private TableColumn<Vehiculo, String> tbcPlaca;

    @FXML
    private TableColumn<Vehiculo, Double> tbcCilindraje;

    @FXML
    private TableColumn<Vehiculo, String> tbcEstado;

    @FXML
    private TableColumn<Vehiculo, Double> tbcPrecio;

    @FXML
    private TableView<Vehiculo> tblListVehiculosCliente;

    @FXML
    void onIniciaeSesion() {
        app.openViewLogin();
    }

    public void setApp(App app) {
        this.app = app;
    }

    @FXML
    void initialize() {
        menuClienteController = new MenuClienteController(app.consecionario);
        initView();
        obtenerMotoGasolina();
    }

    private void initView() {
        // Traer los datos del cliente a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerMotoGasolina();

        tblListVehiculosCliente.getItems().clear();;
        // Agregar los elementos a la tabla
        
        tblListVehiculosCliente.setItems(listVehiculos);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    
    // private void initDataBinding() {
    //     tbcPlaca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPlaca()));s
    //     tbcCilindraje.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getCilindraje()));
    //     tbcEstado.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getNuevoUsado()));
    //     tbcMarca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
    //     tbcModelo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
    //     tbcPrecio.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getPrecio()));
    //     tbcTanque.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getGalonesGasolina()));
    //     tbcTransmision.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getTransmision()));
    //     tbcVelocidadMax.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getVelocidadmax()));

    // }

    private void obtenerMotoGasolina() {
        System.out.println("Lista vehiculos "+menuClienteController.obtenerListaVehiculo());
        listVehiculos.addAll(menuClienteController.obtenerListaVehiculo());
        tblListVehiculosCliente.setItems(listVehiculos);
        listenerSelection();
    }

    private void listenerSelection() {
        tblListVehiculosCliente.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedVehiculo = newSelection;
            mostrarInformacionVehiculo(newSelection);
        });
    }

    private void initDataBinding() {
        tbcPlaca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPlaca()));
        tbcCilindraje.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getCilindraje()));
        tbcEstado.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getNuevoUsado()));
        tbcMarca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
        tbcModelo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
        tbcPrecio.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getPrecio()));
        tbcTransmision.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getTransmision()));
        tbcVelocidadMax.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getVelocidadmax()));

    }

    private void mostrarInformacionVehiculo(Vehiculo motoGasolina) {
        if (motoGasolina != null) {
            System.out.println("Placa de la moto"+motoGasolina.getPlaca());
            tbcPlaca.setText(String.valueOf(motoGasolina.getPlaca()));
            tbcCilindraje.setText(String.valueOf(motoGasolina.getCilindraje()));
            tbcMarca.setText(String.valueOf(motoGasolina.getMarca()));
            tbcModelo.setText(String.valueOf(motoGasolina.getModelo()));
            tbcVelocidadMax.setText(String.valueOf(motoGasolina.getVelocidadmax()));
            tbcPrecio.setText(String.valueOf(motoGasolina.getPrecio()));
            tbcEstado.setText(motoGasolina.getNuevoUsado());
            tbcTransmision.setText(motoGasolina.getTransmision());
            
        }
    }
}

