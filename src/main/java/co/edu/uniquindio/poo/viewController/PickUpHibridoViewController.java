package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.DeportivoHibridoController;
import co.edu.uniquindio.poo.controller.PickUpHibridoController;
import co.edu.uniquindio.poo.model.DeportivoHibrido;
import co.edu.uniquindio.poo.model.PickUpHibrido;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PickUpHibridoViewController {
    PickUpHibridoController pickUpHibridoController;
    ObservableList<PickUpHibrido> listPickUpHibridos = FXCollections.observableArrayList();
    PickUpHibrido selectedPickUpHibrido;
    
    private App app;

    @FXML
    private ComboBox<String> cbxTipoHibrido;

    @FXML
    private TableColumn<PickUpHibrido, String> tbcAireAcondicionado;

    @FXML
    private TableColumn<PickUpHibrido, String> tbcMarca;

    @FXML
    private TableColumn<PickUpHibrido, Double> tbcBolsasAire;

    @FXML
    private ComboBox<String> cbxAireAcondicionado;

    @FXML
    private Button btnActualizarPickUpHibrido;

    @FXML
    private ComboBox<String> cbxCamReversa;

    @FXML
    private Button btbAgregarPickUpHibrido;

    @FXML
    private TableView<PickUpHibrido> tblListPickUpHibrido;

    @FXML
    private ComboBox<String> cbxTransmision;

    @FXML
    private TextField txtPrecio;

    @FXML
    private TableColumn<PickUpHibrido, String> tbcCamTrasera;

    @FXML
    private TableColumn<PickUpHibrido, Double> tbcPuertas;

    @FXML
    private Button dtnAtras;

    @FXML
    private TableColumn<PickUpHibrido, String> tbcModelo;

    @FXML
    private Button btnEliminarPickUpHibrido;

    @FXML
    private ComboBox<String> cbx4x4;

    @FXML
    private TableColumn<PickUpHibrido, String> tbcEnchufable;

    @FXML
    private TableColumn<PickUpHibrido, String> tbc4Por4;

    @FXML
    private TextField txtNumPasajero;

    @FXML
    private TableColumn<PickUpHibrido, String> tbcCapaCarga;

    @FXML
    private TextField txtModelo;

    @FXML
    private Button btnVender;

    @FXML
    private TableColumn<PickUpHibrido, String> tbcTipoHibrido;

    @FXML
    private TableColumn<PickUpHibrido, Double> tbcCilindraje;

    @FXML
    private TableColumn<PickUpHibrido, Double> tbcPrecio;

    @FXML
    private TextField txtCapacidadCarga;

    @FXML
    private TextField txtNumBolsas;

    @FXML
    private ComboBox<String> cbxEnchufable;

    @FXML
    private TableColumn<PickUpHibrido, Double> tbcVelocidadMax;

    @FXML
    private TextField txtPlaca;

    @FXML
    private TextField txtNumPuertas;

    @FXML
    private ComboBox<String> cbxAbs;

    @FXML
    private TableColumn<PickUpHibrido, Double> tbcNumPasajero;

    @FXML
    private Button btnLimpiarPickUpHibrido;

    @FXML
    private TableColumn<PickUpHibrido, String> tbcTransmision;

    @FXML
    private Button btnComprar;

    @FXML
    private TableColumn<PickUpHibrido, String> tbcAbs;

    @FXML
    private TableColumn<PickUpHibrido, String> tbcPlaca;

    @FXML
    private TextField txtVelocidadMax;

    @FXML
    private ComboBox<String> cbxNuevoUsado;

    @FXML
    private TextField txtCilindraje;

    @FXML
    private TableColumn<PickUpHibrido, String> tbcEstado;

    @FXML
    private TextField txtMarca;

    @FXML
    void onActualizarPickUpHibrido() {
        actualizarPickUpHibrido();

    }

    @FXML
    void onAgregarPickUpHibrido() {
        agregarPickUpHibrido();

    }

    @FXML
    void onOpenMenu() {
        app.openCrudSubMenuVehiculoHibrido();

    }

    @FXML
    void onVender() {

    }

    @FXML
    void onComprar() {

    }

    @FXML
    void onLimpiarPickUpHibrido() {
        limpiarSeleccion();

    }

    @FXML
    void onEliminarPickUpHibrido() {
        eliminarPickUpHibrido();

    }
    @FXML
    void initialize() {
       pickUpHibridoController = new PickUpHibridoController(app.consecionario);
       cbxTipoHibrido.getItems().addAll("ligero", "Pesado");
       cbxEnchufable.getItems().addAll("Si", "No");
       cbxNuevoUsado.getItems().addAll("Nuevo", "Usado");
       cbxTransmision.getItems().addAll("Automatica", "Manual");
       cbx4x4.getItems().addAll("Si", "No");
       cbxAbs.getItems().addAll("Si", "No");
       cbxCamReversa.getItems().addAll("Si", "No");
       cbxAireAcondicionado.getItems().addAll("Si", "No");

        initView();
    }

    private void initView() {
        // Traer los datos del cliente a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerPickUpHibrido();

        // Limpiar la tabla
        tblListPickUpHibrido.getItems().clear();

        // Agregar los elementos a la tabla
        tblListPickUpHibrido.setItems(listPickUpHibridos);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    
    private void initDataBinding() {
        tbcPlaca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPlaca()));
        tbcEnchufable.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getEnchufable()));
        tbcCapaCarga.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getCapacidadCajaCarga()));
        tbcBolsasAire.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getNumBolsas()));
        tbcNumPasajero.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getNumPasajero()));
        tbcCilindraje.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getCilindraje()));
        tbcEstado.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getNuevoUsado()));
        tbc4Por4.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getCuatroXcuatro()));
        tbcMarca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
        tbcModelo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
        tbcPrecio.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getPrecio()));
        tbcPuertas.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getNumPuerta()));
        tbcVelocidadMax.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getVelocidadmax()));
        tbcTipoHibrido.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getTipoHibrido()));
        tbcTransmision.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getTransmision()));
        tbcAireAcondicionado.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getAireAcondicionado()));
        tbcCamTrasera.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getCamReversa()));
        tbcAbs.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getAbs()));
        

    }

    private void obtenerPickUpHibrido() {
        listPickUpHibridos.addAll(pickUpHibridoController.obtenerListaPickUpHibrido());
    }

    private void listenerSelection() {
        tblListPickUpHibrido.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedPickUpHibrido = newSelection;
            mostrarInformacionPickUpHibrido(newSelection);
        });
    }

    private void mostrarInformacionPickUpHibrido(PickUpHibrido pickUpHibrido) {
        if (pickUpHibrido != null) {
            txtPlaca.setText(String.valueOf(pickUpHibrido.getPlaca()));
            txtCilindraje.setText(String.valueOf(pickUpHibrido.getCilindraje()));
            txtMarca.setText(String.valueOf(pickUpHibrido.getMarca()));
            txtModelo.setText(String.valueOf(pickUpHibrido.getModelo()));
            txtNumBolsas.setText(String.valueOf(pickUpHibrido.getNumBolsas()));
            txtNumPuertas.setText(String.valueOf(pickUpHibrido.getNumPuerta()));
            txtCapacidadCarga.setText(String.valueOf(pickUpHibrido.getCapacidadCajaCarga()));
            txtVelocidadMax.setText(String.valueOf(pickUpHibrido.getVelocidadmax()));
            txtPrecio.setText(String.valueOf(pickUpHibrido.getPrecio()));
            txtNumPasajero.setText(String.valueOf(pickUpHibrido.getNumPasajero()));
            cbxNuevoUsado.setValue(pickUpHibrido.getNuevoUsado());
            cbxTransmision.setValue(pickUpHibrido.getTransmision());
            cbxTipoHibrido.setValue(pickUpHibrido.getTipoHibrido());
            cbxEnchufable.setValue(pickUpHibrido.getEnchufable());
            cbx4x4.setValue(pickUpHibrido.getCuatroXcuatro());
            cbxAbs.setValue(pickUpHibrido.getAbs());
            cbxAireAcondicionado.setValue(pickUpHibrido.getAireAcondicionado());
            cbxCamReversa.setValue(pickUpHibrido.getCamReversa());
            
        }
    }

    private void agregarPickUpHibrido() {
        PickUpHibrido pickUpHibrido = buildPickUpHibrido();
        if (pickUpHibridoController.crearPickUpHibrido(pickUpHibrido)) {
            listPickUpHibridos.add(pickUpHibrido);
            limpiarCamposPickUpHibrido();
        }
    }

    private PickUpHibrido buildPickUpHibrido() {
        PickUpHibrido pickUpHibrido = new PickUpHibrido(txtMarca.getText(), txtModelo.getText(), txtPlaca.getText(), cbxNuevoUsado.getValue(), cbxTransmision.getValue(), Double.parseDouble(txtVelocidadMax.getText()), Double.parseDouble(txtCilindraje.getText()), Double.parseDouble(txtPrecio.getText()), cbxEnchufable.getValue(), cbxTipoHibrido.getValue(), Double.parseDouble(txtNumBolsas.getText()), Double.parseDouble(txtNumPasajero.getText()), Double.parseDouble(txtNumPuertas.getText()), cbx4x4.getValue(), cbxAireAcondicionado.getValue(), cbxCamReversa.getValue(), cbxAbs.getValue(), Double.parseDouble(txtCapacidadCarga.getText()));
        return pickUpHibrido;
    }

    private void eliminarPickUpHibrido() {
        if (pickUpHibridoController.eliminarPickUpHibrido(txtPlaca.getText())) {
            listPickUpHibridos.remove(selectedPickUpHibrido);
            limpiarCamposPickUpHibrido();
            limpiarSeleccion();
        }
    }

    private void actualizarPickUpHibrido() {

        if (selectedPickUpHibrido != null && pickUpHibridoController.actualizarPickUpHibrido(selectedPickUpHibrido.getPlaca(), buildPickUpHibrido())) {

            int index = listPickUpHibridos.indexOf(selectedPickUpHibrido);
            if (index >= 0) {
                listPickUpHibridos.set(index, buildPickUpHibrido());
            }

            tblListPickUpHibrido.refresh();
            limpiarSeleccion();
            limpiarCamposPickUpHibrido();
        }
    }

    private void limpiarSeleccion() {
        tblListPickUpHibrido.getSelectionModel().clearSelection();
        limpiarCamposPickUpHibrido();
    }

    private void limpiarCamposPickUpHibrido() {
        txtCapacidadCarga.clear();
        txtCilindraje.clear();
        txtMarca.clear();
        txtModelo.clear();
        txtNumBolsas.clear();
        txtNumPuertas.clear();
        txtPlaca.clear();
        txtNumPasajero.clear();
        txtVelocidadMax.clear();
        txtPrecio.clear();
        cbx4x4.setValue(null);
        cbxEnchufable.setValue(null);
        cbxTipoHibrido.setValue(null);
        cbxNuevoUsado.setValue(null);
        cbxTransmision.setValue(null);
        cbxAbs.setValue(null);
        cbxAireAcondicionado.setValue(null);
        cbxCamReversa.setValue(null);
    }


    /**
     * @param app
     */
    public void setApp(App app) {
        this.app = app;
    }



}



