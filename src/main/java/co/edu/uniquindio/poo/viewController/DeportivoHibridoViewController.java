package co.edu.uniquindio.poo.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.DeportivoHibridoController;
import co.edu.uniquindio.poo.controller.DeportivoHibridoController;
import co.edu.uniquindio.poo.model.DeportivoHibrido;
import co.edu.uniquindio.poo.model.MotoGasolina;
import co.edu.uniquindio.poo.model.VanGasolina;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableCell;
import co.edu.uniquindio.poo.controller.VanGasolinaController;
import co.edu.uniquindio.poo.model.Cliente;

public class DeportivoHibridoViewController {
    DeportivoHibridoController deportivoHibridoController;
    ObservableList<DeportivoHibrido> listDeportivoHibridos = FXCollections.observableArrayList();
    DeportivoHibrido selectedDeportivoHibrido;
    
    private App app;

    @FXML
    private ComboBox<String> cbxTransmision;

    @FXML
    private TableColumn<DeportivoHibrido, String> tbcTransmision;

    @FXML
    private ComboBox<String> cbxTipoHibrido;

    @FXML
    private TableColumn<DeportivoHibrido, String> tbcMarca;

    @FXML
    private TableColumn<DeportivoHibrido, Double> tbcBolsasAire;

    @FXML
    private TableView<DeportivoHibrido> tblListDeportivoHibrido;

    @FXML
    private Button btnActualizarDeportivoHibrido;

    @FXML
    private TextField txtPrecio;

    @FXML
    private Button btnEliminarDeportivoHibrido;

    @FXML
    private TextField txtVelocidad0a100;

    @FXML
    private TableColumn<DeportivoHibrido, Double> tbcPuertas;

    @FXML
    private TextField txtCaballoFuerza;

    @FXML
    private Button dtnAtras;

    @FXML
    private TableColumn<DeportivoHibrido, String> tbcModelo;

    @FXML
    private TableColumn<DeportivoHibrido, Double> tbcTiempo0a100;

    @FXML
    private TableColumn<DeportivoHibrido, Double> tbcCaballoFuerza;

    @FXML
    private TableColumn<DeportivoHibrido, String> tbcEnchufable;

    @FXML
    private TextField txtNumPasajero;

    @FXML
    private TextField txtModelo;

    @FXML
    private Button btnVender;

    @FXML
    private TableColumn<DeportivoHibrido, String> tbcTipoHibrido;

    @FXML
    private Button btnLimpiarDeportivoHibrido;

    @FXML
    private TableColumn<DeportivoHibrido, Double> tbcCilindraje;

    @FXML
    private TableColumn<DeportivoHibrido, Double> tbcPrecio;

    @FXML
    private Button btbAgregarDeportivoHibrido;

    @FXML
    private TextField txtNumBolsas;

    @FXML
    private ComboBox<String> cbxEnchufable;

    @FXML
    private TableColumn<DeportivoHibrido, Double> tbcVelocidadMax;

    @FXML
    private TextField txtPlaca;

    @FXML
    private TextField txtNumPuertas;

    @FXML
    private TableColumn<DeportivoHibrido, Double> tbcNumPasajero;

    @FXML
    private Button btnComprar;

    @FXML
    private TableColumn<DeportivoHibrido, String> tbcPlaca;

    @FXML
    private TextField txtVelocidadMax;

    @FXML
    private ComboBox<String> cbxNuevoUsado;

    @FXML
    private TextField txtCilindraje;

    @FXML
    private TableColumn<DeportivoHibrido, String> tbcEstado;

    @FXML
    private TextField txtMarca;

    @FXML
    void onActualizarDeportivoHibrido() {
        actualizarDeportivoHibrido();
    }

    @FXML
    void onAgregarDeportivoHibrido() {
        agregarDeportivoHibrido();
    }

    @FXML
    void onOpenMenu() {
        app.openCrudSubMenuVehiculoHibrido();
    }

    @FXML
    void onVender() {
        agregarDeportivoHibrido();
    }

    @FXML
    void onComprar() {
        comprarVehiculo();
    }

    @FXML
    void onLimpiarDeportivoHibrido() {
        limpiarSeleccion();
    }

    @FXML
    void onEliminarDeportivoHibrido() {
        eliminarDeportivoHibrido();
    }
    @FXML
    void initialize() {
       deportivoHibridoController = new DeportivoHibridoController(app.consecionario);
       cbxTipoHibrido.getItems().addAll("ligero", "Pesado");
       cbxEnchufable.getItems().addAll("Si", "No");
       cbxNuevoUsado.getItems().addAll("Nuevo", "Usado");
       cbxTransmision.getItems().addAll("Automatica", "Manual");

        initView();
    }

    private void comprarVehiculo() {
        Vehiculo deportivoHibrido = buildVehiculo();
        if (deportivoHibridoController.comprarVehiculo(deportivoHibrido)) {
            listDeportivoHibridos.remove(deportivoHibrido);
            limpiarCamposDeportivoHibrido();
        }
    }

    private DeportivoHibrido buildVehiculo() {
        DeportivoHibrido deportivoHibrido = new DeportivoHibrido(txtMarca.getText(), txtModelo.getText(), txtPlaca.getText(), cbxNuevoUsado.getValue(), cbxTransmision.getValue(), Double.parseDouble(txtVelocidadMax.getText()), Double.parseDouble(txtCilindraje.getText()), Double.parseDouble(txtPrecio.getText()), cbxEnchufable.getValue(), cbxTipoHibrido.getValue(), Double.parseDouble(txtNumBolsas.getText()), Double.parseDouble(txtNumPasajero.getText()), Double.parseDouble(txtNumPuertas.getText()), Double.parseDouble(txtCaballoFuerza.getText()), Double.parseDouble(txtVelocidad0a100.getText()));
        return deportivoHibrido;
    }

    private void initView() {
        // Traer los datos del cliente a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerDeportivoHibrido();

        // Limpiar la tabla
        tblListDeportivoHibrido.getItems().clear();

        // Agregar los elementos a la tabla
        tblListDeportivoHibrido.setItems(listDeportivoHibridos);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    
    private void initDataBinding() {
        tbcPlaca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPlaca()));
        tbcEnchufable.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getEnchufable()));
        tbcCaballoFuerza.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getNumCaballoFuerza()));
        tbcBolsasAire.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getNumBolsas()));
        tbcNumPasajero.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getNumPasajero()));
        tbcCilindraje.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getCilindraje()));
        tbcEstado.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getNuevoUsado()));
        tbcTiempo0a100.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getTiempo0a100km()));
        tbcMarca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
        tbcModelo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
        tbcPrecio.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getPrecio()));
        tbcPuertas.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getNumPuerta()));
        tbcVelocidadMax.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getVelocidadmax()));
        tbcTipoHibrido.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getTipoHibrido()));
        tbcTransmision.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getTransmision()));

    }

    private void obtenerDeportivoHibrido() {
        listDeportivoHibridos.addAll(deportivoHibridoController.obtenerListaDeportivoHibrido());
    }

    private void listenerSelection() {
        tblListDeportivoHibrido.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedDeportivoHibrido = newSelection;
            mostrarInformacionDeportivoHibrido(newSelection);
        });
    }

    private void mostrarInformacionDeportivoHibrido(DeportivoHibrido deportivoHibrido) {
        if (deportivoHibrido != null) {
            txtVelocidad0a100.setText(String.valueOf(deportivoHibrido.getTiempo0a100km()));
            txtPlaca.setText(String.valueOf(deportivoHibrido.getPlaca()));
            txtCilindraje.setText(String.valueOf(deportivoHibrido.getCilindraje()));
            txtMarca.setText(String.valueOf(deportivoHibrido.getMarca()));
            txtModelo.setText(String.valueOf(deportivoHibrido.getModelo()));
            txtNumBolsas.setText(String.valueOf(deportivoHibrido.getNumBolsas()));
            txtNumPuertas.setText(String.valueOf(deportivoHibrido.getNumPuerta()));
            txtCaballoFuerza.setText(String.valueOf(deportivoHibrido.getNumCaballoFuerza()));
            txtVelocidadMax.setText(String.valueOf(deportivoHibrido.getVelocidadmax()));
            txtPrecio.setText(String.valueOf(deportivoHibrido.getPrecio()));
            txtNumPasajero.setText(String.valueOf(deportivoHibrido.getNumPasajero()));
            cbxNuevoUsado.setValue(deportivoHibrido.getNuevoUsado());
            cbxTransmision.setValue(deportivoHibrido.getTransmision());
            cbxTipoHibrido.setValue(deportivoHibrido.getTipoHibrido());
            cbxEnchufable.setValue(deportivoHibrido.getEnchufable());
            
        }
    }

    private void agregarDeportivoHibrido() {
        DeportivoHibrido deportivoHibrido = buildDeportivoHibrido();
        if (deportivoHibridoController.crearDeportivoHibrido(deportivoHibrido)) {
            listDeportivoHibridos.add(deportivoHibrido);
            limpiarCamposDeportivoHibrido();
        }
    }

    private DeportivoHibrido buildDeportivoHibrido() {
        DeportivoHibrido deportivoHibrido = new DeportivoHibrido(txtMarca.getText(), txtModelo.getText(), txtPlaca.getText(), cbxNuevoUsado.getValue(), cbxTransmision.getValue(), Double.parseDouble(txtVelocidadMax.getText()), Double.parseDouble(txtCilindraje.getText()), Double.parseDouble(txtPrecio.getText()), cbxEnchufable.getValue(), cbxTipoHibrido.getValue(), Double.parseDouble(txtNumBolsas.getText()), Double.parseDouble(txtNumPasajero.getText()), Double.parseDouble(txtNumPuertas.getText()), Double.parseDouble(txtCaballoFuerza.getText()), Double.parseDouble(txtVelocidad0a100.getText()));
        return deportivoHibrido;
    }

    private void eliminarDeportivoHibrido() {
        if (deportivoHibridoController.eliminarDeportivoHibrido(txtPlaca.getText())) {
            listDeportivoHibridos.remove(selectedDeportivoHibrido);
            limpiarCamposDeportivoHibrido();
            limpiarSeleccion();
        }
    }

    private void actualizarDeportivoHibrido() {

        if (selectedDeportivoHibrido != null && deportivoHibridoController.actualizarDeportivoHibrido(selectedDeportivoHibrido.getPlaca(), buildDeportivoHibrido())) {

            int index = listDeportivoHibridos.indexOf(selectedDeportivoHibrido);
            if (index >= 0) {
                listDeportivoHibridos.set(index, buildDeportivoHibrido());
            }

            tblListDeportivoHibrido.refresh();
            limpiarSeleccion();
            limpiarCamposDeportivoHibrido();
        }
    }

    private void limpiarSeleccion() {
        tblListDeportivoHibrido.getSelectionModel().clearSelection();
        limpiarCamposDeportivoHibrido();
    }

    private void limpiarCamposDeportivoHibrido() {
        txtCaballoFuerza.clear();
        txtCilindraje.clear();
        txtMarca.clear();
        txtModelo.clear();
        txtNumBolsas.clear();
        txtNumPuertas.clear();
        txtPlaca.clear();
        txtNumPasajero.clear();
        txtVelocidadMax.clear();
        txtPrecio.clear();
        txtVelocidad0a100.clear();
        cbxEnchufable.setValue(null);
        cbxTipoHibrido.setValue(null);
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

