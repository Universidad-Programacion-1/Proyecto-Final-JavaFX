package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.AdminController;
import co.edu.uniquindio.poo.model.Admin;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AdminViewController {

    AdminController adminController;
    ObservableList<Admin> listAdmins = FXCollections.observableArrayList();
    Admin selectedAdmin;
    private App app;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btbAtras;

    @FXML
    private TableColumn<Admin, String> tbcCedula;

    @FXML
    private TableColumn<Admin, String> tbcCorreo;

    @FXML
    private TextField txtAPalabraSecreta;

    @FXML
    private TableColumn<Admin, String> tbcTelefono;

    @FXML
    private TextField txtACedula;

    @FXML
    private Button btnActualizarAdmin;

    @FXML
    private TableView<Admin> tblListAdmin;

    @FXML
    private Button btnEliminar;

    @FXML
    private TextField txtATelefono;

    @FXML
    private Button btbAgregarAdmin;

    @FXML
    private TextField txtACorreo;

    @FXML
    private TableColumn<Admin, String> tbcPalabraSecreta;

    @FXML
    void onAgregarAdmin() {
        agregarAdmin();
    }

    @FXML
    void onActualizarAdmin() {
        actualizarAdmin();
    }

    @FXML
    void onbAtrasAction() {
        app.openMenuAdmin();
    }

    @FXML
    void onLimpiar() {
        limpiarSeleccion();
    }

    @FXML
    void onEliminar() {
        eliminarAdmin();
    }

    @FXML
    void initialize() {
        adminController = new AdminController(app.consecionario);
        initView();
    }

    private void initView() {
        // Traer los datos del cliente a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerAdmins();

        // Limpiar la tabla
        tblListAdmin.getItems().clear();

        // Agregar los elementos a la tabla
        tblListAdmin.setItems(listAdmins);

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

    private void obtenerAdmins() {
        listAdmins.addAll(adminController.obtenerListaAdmin());
    }

    private void listenerSelection() {
        tblListAdmin.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedAdmin = newSelection;
            mostrarInformacionCliente(selectedAdmin);
        });
    }

    private void mostrarInformacionCliente(Admin admin) {
        if (admin != null) {
            txtACedula.setText(admin.getId());
            txtACorreo.setText(admin.getGmail());
            txtATelefono.setText(admin.getTelefono());
            txtAPalabraSecreta.setText(admin.getPalabraSecreta());
        }
    }

    private void agregarAdmin() {
        Admin admin = buildAdmin();
        if (adminController.crearAdmin(admin)) {
            listAdmins.add(admin);
            limpiarCamposCliente();
        }
    }

    private Admin buildAdmin() {
        Admin admin = new Admin(txtACedula.getText(), txtACorreo.getText(), txtATelefono.getText(), txtAPalabraSecreta.getText());
        return admin;
    }

    private void eliminarAdmin() {
        if (adminController.eliminarAdmin(txtACedula.getText())) {
            listAdmins.remove(selectedAdmin);
            limpiarCamposCliente();
            limpiarSeleccion();
        }
    }

    private void actualizarAdmin() {

        if (selectedAdmin != null &&
            adminController.actualizarAdmin(selectedAdmin.getId(), buildAdmin())) {

            int index = listAdmins.indexOf(selectedAdmin);
            if (index >= 0) {
                listAdmins.set(index, buildAdmin());
            }

            tblListAdmin.refresh();
            limpiarSeleccion();
            limpiarCamposCliente();
        }
    }

    private void limpiarSeleccion() {
        tblListAdmin.getSelectionModel().clearSelection();
        limpiarCamposCliente();
    }

    private void limpiarCamposCliente() {
        txtACedula.clear();
        txtACorreo.clear();
        txtATelefono.clear();
        txtAPalabraSecreta.clear();
    }

    public void setApp(App app) {
        this.app = app;
    }
}

