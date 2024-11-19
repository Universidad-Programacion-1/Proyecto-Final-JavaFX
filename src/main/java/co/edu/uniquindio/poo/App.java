package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import co.edu.uniquindio.poo.model.Admin;
import co.edu.uniquindio.poo.model.Consecionario;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.viewController.AdminViewController;
import co.edu.uniquindio.poo.viewController.ClienteViewController;
import co.edu.uniquindio.poo.viewController.EmpleadoViewController;
import co.edu.uniquindio.poo.viewController.LoginViewController;
import co.edu.uniquindio.poo.viewController.MenuAdminViewController;
import co.edu.uniquindio.poo.viewController.MenuClienteViewController;
import co.edu.uniquindio.poo.viewController.MenuEmpleadoViewController;
import co.edu.uniquindio.poo.viewController.OlvidoContrasnaViewController;

/**
 * JavaFX App
 */
public class App extends Application {

    private Stage primaryStage;
    @SuppressWarnings("exports")
    public static Consecionario consecionario = new Consecionario("UQ");

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Gestion de Consecionario");
        openViewLogin();
    }

    public int tipoPersona(){
        return consecionario.tipoPersona();
    }
    public static void main(String[] args) {
        launch();
    }

    public void openViewLogin() {
        inicializarData();
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("login.fxml"));
            javafx.scene.layout.VBox rootLayout = (javafx.scene.layout.VBox) loader.load();
            LoginViewController loginViewController = loader.getController();
            loginViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openViewOlvidoContrasena() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("OlvidoContrasna.fxml"));
            javafx.scene.layout.VBox rootLayout = (javafx.scene.layout.VBox) loader.load();
            OlvidoContrasnaViewController olvidoContrasnaViewController = loader.getController();
            olvidoContrasnaViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openMenuAdmin() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("MenuAdmin.fxml"));
            javafx.scene.layout.VBox rootLayout = (javafx.scene.layout.VBox) loader.load();
            //AnchorPane rootLayout = (AnchorPane) loader.load();
            MenuAdminViewController menuAdminViewController = loader.getController();
            menuAdminViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openMenuEmpleado() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("MenuEmpleado.fxml"));
            javafx.scene.layout.VBox rootLayout = (javafx.scene.layout.VBox) loader.load();
            MenuEmpleadoViewController menuEmpleadoViewController = loader.getController();
            menuEmpleadoViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openMenuCliente() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("MenuCliente.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            MenuClienteViewController clienteViewController = loader.getController();
            clienteViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void inicializarData(){
        Admin admin = new Admin("12345", "carlos", "3213232", "escobar");
        //Empleado empleado = new Empleado("123", "carlos", "3213232", "234");
        consecionario.crearAdmin(admin);
        //consecionario.agregarEmpleado(empleado);
    }

    public void openCrudAdmin() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("CrudAdmin.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            AdminViewController adminViewController = loader.getController();
            adminViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openCrudEmpleado() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("CrudEmpleado.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            EmpleadoViewController empleadoViewController = loader.getController();
            empleadoViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openCrudCliente() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("CrudCliente.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            ClienteViewController clienteViewController = loader.getController();
            clienteViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}