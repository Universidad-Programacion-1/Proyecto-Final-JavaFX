package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.VanGasolinaController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.VanGasolina;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class VanGasolinaViewController {
    VanGasolinaController vanGasolinaController;
    ObservableList<VanGasolina> listVanGasolinas = FXCollections.observableArrayList();
    VanGasolina selectedVanGasolina;
    
    private App app;

    @FXML
    private TableColumn<VanGasolina, String> tbcAireAcondicionado;

    @FXML
    private TextField txtPrecio;

    @FXML
    private TableColumn<VanGasolina, String> tbcMarca;

    @FXML
    private TableColumn<VanGasolina, String> tbcBolsasAire;

    @FXML
    private ComboBox<String> cbxAireAcondicionado;

    @FXML
    private ComboBox<String> cbxTransmision;

    @FXML
    private TextField txtTanque;

    @FXML
    private TableColumn<VanGasolina, Double> tbcPuertas;

    @FXML
    private Button dtnAtras;

    @FXML
    private TableColumn<VanGasolina, String> tbcModelo;

    @FXML
    private TableView<VanGasolina> tblListVanGasolina;

    @FXML
    private TextField txtModelo;

    @FXML
    private Button btnActualizarVanGasolina;

    @FXML
    private Button btnVender;

    @FXML
    private ComboBox<String> cbxCamTrasera;

    @FXML
    private TableColumn<VanGasolina, String> tbcCamara;

    @FXML
    private TableColumn<VanGasolina, Double> tbcCilindraje;

    @FXML
    private TableColumn<VanGasolina, Double> tbcMaletero;

    @FXML
    private Button btnEliminarVanGasolina;

    @FXML
    private TextField txtNumBolsas;

    @FXML
    private TableColumn<VanGasolina, Double> tbcVelocidadMax;

    @FXML
    private TextField txtPlaca;

    @FXML
    private TextField txtNumPuertas;

    @FXML
    private ComboBox<String> cbxAbs;

    @FXML
    private TableColumn<VanGasolina, Double> tbcTanque;

    @FXML
    private Button btbAgregarVanGasolina;

    @FXML
    private TableColumn<VanGasolina, String> tbcTransmision;

    @FXML
    private TableColumn<VanGasolina, String> tbcAbs;

    @FXML
    private TableColumn<VanGasolina, Double> tbcPrecio;

    @FXML
    private TextField txtCapacidadMaletero;

    @FXML
    private Button btnLimpiarVanGasolina;

    @FXML
    private TableColumn<VanGasolina, String> tbcPlaca;

    @FXML
    private TextField txtVelocidadMax;

    @FXML
    private ComboBox<String> cbxNuevoUsado;

    @FXML
    private TextField txtCilindraje;

    @FXML
    private TableColumn<VanGasolina, String> tbcEstado;

    @FXML
    private TextField txtMarca;
    

    @FXML
    void onActualizarVanGasolina() {
        actualizarVanGasolina();

    }

    @FXML
    void onAgregarVanGasolina() {
        agregarVanGasolina();

    }

    @FXML
    void onOpenMenu() {
        app.openCrudSubMenuVehiculoGasolina();
        

    }

    @FXML
    void onVender() {

    }

    @FXML
    void onLimpiarVanGasolina() {
        limpiarSeleccion();

    }

    @FXML
    void onEliminarVanGasolina() {
        eliminarVanGasolina();

    }
    
    @FXML
    void initialize() {
       vanGasolinaController = new VanGasolinaController(app.consecionario);
       cbxAbs.getItems().addAll("Si", "No");
       cbxAireAcondicionado.getItems().addAll("Si", "No");
       cbxCamTrasera.getItems().addAll("Si", "No");
       cbxNuevoUsado.getItems().addAll("Nuevo", "Usado");
       cbxTransmision.getItems().addAll("Automatica", "Manual");

        initView();
    }

    private void initView() {
        // Traer los datos del cliente a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerVanGasolina();

        // Limpiar la tabla
        tblListVanGasolina.getItems().clear();

        // Agregar los elementos a la tabla
        tblListVanGasolina.setItems(listVanGasolinas);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    
    private void initDataBinding() {
        tbcPlaca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPlaca()));
        tbcAireAcondicionado.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getAireAcondicionado()));
        tbcAbs.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getAbs()));
        tbcBolsasAire.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getNumBolsas()));
        tbcCamara.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getCamTrasera()));
        tbcCilindraje.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getCilindraje()));
        tbcEstado.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getNuevoUsado()));
        tbcMaletero.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getCapacidadMaletero()));
        tbcMarca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
        tbcModelo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
        tbcPlaca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPlaca()));
        tbcPrecio.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getPrecio()));
        tbcPuertas.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getNumPuertas()));
        tbcTanque.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getGalonesGasolina()));
        tbcTransmision.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getTransmision()));
        tbcVelocidadMax.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getVelocidadmax()));

    }

    private void obtenerVanGasolina() {
        listVanGasolinas.addAll(vanGasolinaController.obtenerListaVanGasolina());
    }

    private void listenerSelection() {
        tblListVanGasolina.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedVanGasolina = newSelection;
            mostrarInformacionVanGasolina(newSelection);
        });
    }

    private void mostrarInformacionVanGasolina(VanGasolina vanGasolina) {
        if (vanGasolina != null) {
            txtPlaca.setText(String.valueOf(vanGasolina.getPlaca()));
            txtCilindraje.setText(String.valueOf(vanGasolina.getCilindraje()));
            txtMarca.setText(String.valueOf(vanGasolina.getMarca()));
            txtModelo.setText(String.valueOf(vanGasolina.getModelo()));
            txtNumBolsas.setText(String.valueOf(vanGasolina.getNumBolsas()));
            txtNumPuertas.setText(String.valueOf(vanGasolina.getNumPuertas()));
            txtTanque.setText(String.valueOf(vanGasolina.getGalonesGasolina()));
            txtVelocidadMax.setText(String.valueOf(vanGasolina.getVelocidadmax()));
            txtPrecio.setText(String.valueOf(vanGasolina.getPrecio()));
            txtCapacidadMaletero.setText(String.valueOf(vanGasolina.getCapacidadMaletero()));
            cbxNuevoUsado.setValue(vanGasolina.getNuevoUsado());
            cbxTransmision.setValue(vanGasolina.getTransmision());
            cbxAbs.setValue(vanGasolina.getAbs());
            cbxCamTrasera.setValue(vanGasolina.getCamTrasera());
            cbxAireAcondicionado.setValue(vanGasolina.getAireAcondicionado());
            
        }
    }

    private void agregarVanGasolina() {
        VanGasolina vanGasolina = buildVanGasolina();
        if (vanGasolinaController.crearVanGasolina(vanGasolina)) {
            listVanGasolinas.add(vanGasolina);
            limpiarCamposVanGasolina();
        }
    }

    private VanGasolina buildVanGasolina() {
        VanGasolina vanGasolina = new VanGasolina(txtMarca.getText(), txtModelo.getText(), txtPlaca.getText(), cbxNuevoUsado.getValue(), cbxTransmision.getValue(), Double.parseDouble(txtVelocidadMax.getText()), Double.parseDouble(txtCilindraje.getText()), Double.parseDouble(txtPrecio.getText()), Double.parseDouble(txtTanque.getText()), Double.parseDouble(txtCapacidadMaletero.getText()), Double.parseDouble(txtNumPuertas.getText()), Double.parseDouble(txtNumBolsas.getText()), cbxAireAcondicionado.getValue(), cbxCamTrasera.getValue(), cbxAbs.getValue());
        return vanGasolina;
    }

    private void eliminarVanGasolina() {
        if (vanGasolinaController.eliminarVanGasolina(txtPlaca.getText())) {
            listVanGasolinas.remove(selectedVanGasolina);
            limpiarCamposVanGasolina();
            limpiarSeleccion();
        }
    }

    private void actualizarVanGasolina() {

        if (selectedVanGasolina != null && vanGasolinaController.actualizarVanGasolina(selectedVanGasolina.getPlaca(), buildVanGasolina())) {

            int index = listVanGasolinas.indexOf(selectedVanGasolina);
            if (index >= 0) {
                listVanGasolinas.set(index, buildVanGasolina());
            }

            tblListVanGasolina.refresh();
            limpiarSeleccion();
            limpiarCamposVanGasolina();
        }
    }

    private void limpiarSeleccion() {
        tblListVanGasolina.getSelectionModel().clearSelection();
        limpiarCamposVanGasolina();
    }

    private void limpiarCamposVanGasolina() {
        txtCapacidadMaletero.clear();
        txtCilindraje.clear();
        txtMarca.clear();
        txtModelo.clear();
        txtNumBolsas.clear();
        txtNumPuertas.clear();
        txtPlaca.clear();
        txtTanque.clear();
        txtVelocidadMax.clear();
        txtPrecio.clear();
        cbxAbs.setValue(null);
        cbxAireAcondicionado.setValue(null);
        cbxCamTrasera.setValue(null);
        cbxNuevoUsado.setValue(null);
        cbxTransmision.setValue(null);
    }


    /**
     * @param app
     */
    public void setApp(App app) {
        this.app = app;
    }


}


