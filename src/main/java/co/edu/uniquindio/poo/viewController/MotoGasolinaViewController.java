package co.edu.uniquindio.poo.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.MotoGasolinaController;
import co.edu.uniquindio.poo.model.MotoGasolina;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class MotoGasolinaViewController {
    MotoGasolinaController motoGasolinaController;
    ObservableList<MotoGasolina> listMotoGasolinas = FXCollections.observableArrayList();
    MotoGasolina selectedMotoGasolina;
    
    private App app;

    @FXML
    private TableColumn<MotoGasolina, String> tbcMarca;

    @FXML
    private Button btnLimpiarMotoGasolina;

    @FXML
    private ComboBox<String> cbxTransmision;

    @FXML
    private TextField txtPrecio;

    @FXML
    private TextField txtTanque;

    @FXML
    private Button dtnAtras;

    @FXML
    private TableColumn<MotoGasolina, String> tbcModelo;

    @FXML
    private Button btnEliminarMotoGasolina;

    @FXML
    private TextField txtModelo;

    @FXML
    private Button btnVender;

    @FXML
    private TableColumn<MotoGasolina, Double> tbcCilindraje;

    @FXML
    private TableColumn<MotoGasolina, Double> tbcPrecio;

    @FXML
    private TableColumn<MotoGasolina, Double> tbcVelocidadMax;

    @FXML
    private TextField txtPlaca;

    @FXML
    private TableView<MotoGasolina> tblListMotoGasolina;

    @FXML
    private TableColumn<MotoGasolina, Double> tbcTanque;

    @FXML
    private TableColumn<MotoGasolina, String> tbcTransmision;

    @FXML
    private Button btnComprar;

    @FXML
    private TableColumn<MotoGasolina, String> tbcPlaca;

    @FXML
    private TextField txtVelocidadMax;

    @FXML
    private ComboBox<String> cbxNuevoUsado;

    @FXML
    private TextField txtCilindraje;

    @FXML
    private TableColumn<MotoGasolina, String> tbcEstado;

    @FXML
    private TextField txtMarca;

    @FXML
    private Button btbAgregarMotoGasolina;

    @FXML
    private Button btnActualizarMotoGasolina;

    @FXML
    void onActualizarMotoGasolina() {
        actualizarMotoGasolina();

    }

    @FXML
    void onAgregarMotoGasolina() {
        agregarMotoGasolina();

    }

    @FXML
    void onOpenMenu() {
        app.openCrudSubMenuVehiculoGasolina();
    }

    @FXML
    void onVender() {
        agregarMotoGasolina();
    }

    @FXML
    void onComprar() {
        comprarVehiculo();
    }

    @FXML
    void onLimpiarMotoGasolina() {
        limpiarSeleccion();

    }

    @FXML
    void onEliminarMotoGasolina() {
        eliminarMotoGasolina();

    }
    @FXML
    void initialize() {
       motoGasolinaController = new MotoGasolinaController(app.consecionario);
       cbxNuevoUsado.getItems().addAll("Nuevo", "Usado");
       cbxTransmision.getItems().addAll("Automatica", "Manual");

        initView();
    }

    private void comprarVehiculo() {
        Vehiculo motoGasolina = buildVehiculo();
        if (motoGasolinaController.comprarVehiculo(motoGasolina)) {
            listMotoGasolinas.remove(motoGasolina);
            limpiarCamposMotoGasolina();
        }
    }

    private MotoGasolina buildVehiculo() {
        MotoGasolina motoGasolina = new MotoGasolina(txtMarca.getText(), txtModelo.getText(), txtPlaca.getText(), cbxNuevoUsado.getValue(), cbxTransmision.getValue(), Double.parseDouble(txtVelocidadMax.getText()), Double.parseDouble(txtCilindraje.getText()), Double.parseDouble(txtPrecio.getText()), Double.parseDouble(txtTanque.getText()));
        return motoGasolina;
    }
    // private void listenerSelectionComprar() {
    //     tblListMotoGasolina.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
    //         selectedMotoGasolina = newSelection;
    //         comprarVehiculo(newSelection);
    //     });
    // }

    private void initView() {
        // Traer los datos del cliente a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerMotoGasolina();

        // Limpiar la tabla
        tblListMotoGasolina.getItems().clear();

        // Agregar los elementos a la tabla
        tblListMotoGasolina.setItems(listMotoGasolinas);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    
    private void initDataBinding() {
        tbcPlaca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPlaca()));
        tbcCilindraje.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getCilindraje()));
        tbcEstado.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getNuevoUsado()));
        tbcMarca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
        tbcModelo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
        tbcPrecio.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getPrecio()));
        tbcTanque.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getGalonesGasolina()));
        tbcTransmision.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getTransmision()));
        tbcVelocidadMax.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getVelocidadmax()));

    }

    private void obtenerMotoGasolina() {
        listMotoGasolinas.addAll(motoGasolinaController.obtenerListaMotoGasolina());
    }

    private void listenerSelection() {
        tblListMotoGasolina.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedMotoGasolina = newSelection;
            mostrarInformacionMotoGasolina(newSelection);
        });
    }

    private void mostrarInformacionMotoGasolina(MotoGasolina motoGasolina) {
        if (motoGasolina != null) {
            txtPlaca.setText(String.valueOf(motoGasolina.getPlaca()));
            txtCilindraje.setText(String.valueOf(motoGasolina.getCilindraje()));
            txtMarca.setText(String.valueOf(motoGasolina.getMarca()));
            txtModelo.setText(String.valueOf(motoGasolina.getModelo()));
            txtTanque.setText(String.valueOf(motoGasolina.getGalonesGasolina()));
            txtVelocidadMax.setText(String.valueOf(motoGasolina.getVelocidadmax()));
            txtPrecio.setText(String.valueOf(motoGasolina.getPrecio()));
            cbxNuevoUsado.setValue(motoGasolina.getNuevoUsado());
            cbxTransmision.setValue(motoGasolina.getTransmision());
            
        }
    }

    private void agregarMotoGasolina() {
        MotoGasolina motoGasolina = buildMotoGasolina();
        if (motoGasolinaController.crearMotoGasolina(motoGasolina)) {
            listMotoGasolinas.add(motoGasolina);
            limpiarCamposMotoGasolina();
        }
    }

    private MotoGasolina buildMotoGasolina() {
        MotoGasolina motoGasolina = new MotoGasolina(txtMarca.getText(), txtModelo.getText(), txtPlaca.getText(), cbxNuevoUsado.getValue(), cbxTransmision.getValue(), Double.parseDouble(txtVelocidadMax.getText()), Double.parseDouble(txtCilindraje.getText()), Double.parseDouble(txtPrecio.getText()), Double.parseDouble(txtTanque.getText()));
        return motoGasolina;
    }

    private void eliminarMotoGasolina() {
        if (motoGasolinaController.eliminarMotoGasolina(txtPlaca.getText())) {
            listMotoGasolinas.remove(selectedMotoGasolina);
            limpiarCamposMotoGasolina();
            limpiarSeleccion();
        }
    }

    private void actualizarMotoGasolina() {

        if (selectedMotoGasolina != null && motoGasolinaController.actualizarMotoGasolina(selectedMotoGasolina.getPlaca(), buildMotoGasolina())) {

            int index = listMotoGasolinas.indexOf(selectedMotoGasolina);
            if (index >= 0) {
                listMotoGasolinas.set(index, buildMotoGasolina());
            }

            tblListMotoGasolina.refresh();
            limpiarSeleccion();
            limpiarCamposMotoGasolina();
        }
    }

    private void limpiarSeleccion() {
        tblListMotoGasolina.getSelectionModel().clearSelection();
        limpiarCamposMotoGasolina();
    }

    private void limpiarCamposMotoGasolina() {
        txtCilindraje.clear();
        txtMarca.clear();
        txtModelo.clear();
        txtPlaca.clear();
        txtTanque.clear();
        txtVelocidadMax.clear();
        txtPrecio.clear();
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

