package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.ClienteController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Consecionario;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ClienteViewController {

    ClienteController clienteController;
    ObservableList<Cliente> listClientes = FXCollections.observableArrayList();
    Cliente selectedCliente;
    private App app;
    Consecionario consecionario;
    int c = 0;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btnActualizarCliente;

    @FXML
    private Button btbAtras;

    @FXML
    private Button btbAgregarCliente;

    @FXML
    private TableColumn<Cliente, String> tbcCedula;

    @FXML
    private TextField txtCedula;

    @FXML
    private TableColumn<Cliente, String> tbcCorreo;

    @FXML
    private TableColumn<Cliente, String> tbcTelefono;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtPalabraSecreta;

    @FXML
    private TableView<Cliente> tblListCliente;

    @FXML
    private Button btnEliminar;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TableColumn<Cliente, String> tbcPalabraSecreta;

    @FXML
    void onAgregarCliente() {
        agregarCliente();
    }

    @FXML
    void onActualizarCliente() {
        actualizarCliente();
    }

    @FXML
    void onbAtrasAction() {
       redirect();
    }

    @FXML
    void onLimpiar() {
        limpiarSeleccion();
    }

    @FXML
    void onEliminar() {
        eliminarCliente();
    }

    @FXML
    void initialize() {
        clienteController = new ClienteController(app.consecionario);
        initView();
    }

    private void redirect(){
        int tipo = app.tipoPersona();
        if (tipo == 2) {
            app.openMenuEmpleado();
        }else if (tipo == 3) {
            app.openMenuAdmin();
        }
    }


    private void initView() {
        // Traer los datos del cliente a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerClientes();

        // Limpiar la tabla
        tblListCliente.getItems().clear();

        // Agregar los elementos a la tabla
        tblListCliente.setItems(listClientes);

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

    private void obtenerClientes() {
        listClientes.addAll(clienteController.obtenerListaClientes());
    }

    private void listenerSelection() {
        tblListCliente.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedCliente = newSelection;
            mostrarInformacionCliente(selectedCliente);
        });
    }

    private void mostrarInformacionCliente(Cliente cliente) {
        if (cliente != null) {
            txtCedula.setText(cliente.getId());
            txtCorreo.setText(cliente.getGmail());
            txtTelefono.setText(cliente.getTelefono());
            txtPalabraSecreta.setText(cliente.getPalabraSecreta());
        }
    }

    private void agregarCliente() {
        Cliente cliente = buildCliente();
        if (clienteController.crearCliente(cliente)) {
            listClientes.add(cliente);
            limpiarCamposCliente();
        }
    }

    private Cliente buildCliente() {
        Cliente cliente = new Cliente(txtCedula.getText(), txtCorreo.getText(), txtTelefono.getText(), txtPalabraSecreta.getText());
        return cliente;
    }

    private void eliminarCliente() {
        if (clienteController.eliminarCliente(txtCedula.getText())) {
            listClientes.remove(selectedCliente);
            limpiarCamposCliente();
            limpiarSeleccion();
        }
    }

    private void actualizarCliente() {

        if (selectedCliente != null &&
                clienteController.actualizarCliente(selectedCliente.getId(), buildCliente())) {

            int index = listClientes.indexOf(selectedCliente);
            if (index >= 0) {
                listClientes.set(index, buildCliente());
            }

            tblListCliente.refresh();
            limpiarSeleccion();
            limpiarCamposCliente();
        }
    }

    private void limpiarSeleccion() {
        tblListCliente.getSelectionModel().clearSelection();
        limpiarCamposCliente();
    }

    private void limpiarCamposCliente() {
        txtCedula.clear();
        txtCorreo.clear();
        txtTelefono.clear();
        txtPalabraSecreta.clear();
    }

    public void setApp(App app) {
        this.app = app;
    }
}
