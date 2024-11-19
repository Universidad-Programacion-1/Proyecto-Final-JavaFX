package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.EmpleadoController;
import co.edu.uniquindio.poo.model.Empleado;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class EmpleadoViewController {

    EmpleadoController empleadoController;
    ObservableList<Empleado> listEmpleados = FXCollections.observableArrayList();
    Empleado selectedEmpleado;
    private App app;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtPalabraSecretaE;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btbAgregarEmpleado;

    @FXML
    private Button btbAtras;

    @FXML
    private TableColumn<Empleado, String> tbcCedula;

    @FXML
    private TextField txtCorreoE;

    @FXML
    private TableColumn<Empleado, String> tbcCorreo;

    @FXML
    private TableColumn<Empleado, String> tbcTelefono;

    @FXML
    private Button btnActualizarEmpleado;

    @FXML
    private TextField txtTelefonoE;

    @FXML
    private TableView<Empleado> tblListEmpleado;

    @FXML
    private Button btnEliminar;

    @FXML
    private TextField txtCedulaE;

    @FXML
    private TableColumn<Empleado, String> tbcPalabraSecreta;

    @FXML
    void onAgregarCliente() {
        agregarEmpleado();
    }

    @FXML
    void onActualizarCliente() {
        actualizarEmpleado();
    }

    @FXML
    void onbAtrasAction() {
        app.openMenuAdmin();;
    }

    @FXML
    void onLimpiar() {
        limpiarSeleccion();
    }

    @FXML
    void onEliminar() {
        eliminarEmpleado();
    }

    @FXML
    void initialize() {
        empleadoController = new EmpleadoController(app.consecionario);
        initView();
    }


    private void initView() {
        // Traer los datos del cliente a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerEmpleado();

        // Limpiar la tabla
        tblListEmpleado.getItems().clear();

        // Agregar los elementos a la tabla
        tblListEmpleado.setItems(listEmpleados);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    private void initDataBinding() {
        tbcCedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getId()));
        tbcCorreo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getGmail()));
        tbcTelefono.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTelefono()));
        tbcPalabraSecreta.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPalabraSecreta()));
        // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
    }

    private void obtenerEmpleado() {
        listEmpleados.addAll(empleadoController.obtenerListaEmpleado());
    }

    private void listenerSelection() {
        tblListEmpleado.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedEmpleado = newSelection;
            mostrarInformacionEmpleado(selectedEmpleado);
        });
    }

    private void mostrarInformacionEmpleado(Empleado empleado) {
        if (empleado != null) {
            txtCedulaE.setText(empleado.getId());
            txtCorreoE.setText(empleado.getGmail());
            txtTelefonoE.setText(empleado.getTelefono());
            txtPalabraSecretaE.setText(empleado.getPalabraSecreta());
        }
    }

    private void agregarEmpleado() {
        Empleado empleado = buildEmpleado();
        if (empleadoController.crearEmpleado(empleado)) {
            listEmpleados.add(empleado);
            limpiarCamposCliente();
        }
    }

    private Empleado buildEmpleado() {
        Empleado empleado = new Empleado(txtCedulaE.getText(), txtCorreoE.getText(), txtTelefonoE.getText(), txtPalabraSecretaE.getText());
        return empleado;
    }

    private void eliminarEmpleado() {
        if (empleadoController.eliminarEmpleado(txtCedulaE.getText())) {
            listEmpleados.remove(selectedEmpleado);
            limpiarCamposCliente();
            limpiarSeleccion();
        }
    }

    private void actualizarEmpleado() {

        if (selectedEmpleado != null &&
                empleadoController.actualizarEmpleado(selectedEmpleado.getId(), buildEmpleado())) {

            int index = listEmpleados.indexOf(selectedEmpleado);
            if (index >= 0) {
                listEmpleados.set(index, buildEmpleado());
            }

            tblListEmpleado.refresh();
            limpiarSeleccion();
            limpiarCamposCliente();
        }
    }

    private void limpiarSeleccion() {
        tblListEmpleado.getSelectionModel().clearSelection();
        limpiarCamposCliente();
    }

    private void limpiarCamposCliente() {
        txtCedulaE.clear();
        txtCorreoE.clear();
        txtTelefonoE.clear();
        txtPalabraSecretaE.clear();
    }

    public void setApp(App app) {
        this.app = app;
    }

}

