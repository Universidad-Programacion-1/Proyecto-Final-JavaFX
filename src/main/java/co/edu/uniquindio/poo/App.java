package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;
import java.time.LocalDate;

import co.edu.uniquindio.poo.controller.DeportivoHibridoController;
import co.edu.uniquindio.poo.controller.VanGasolinaController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Consecionario;
import co.edu.uniquindio.poo.model.VanGasolina;
import co.edu.uniquindio.poo.viewController.DeportivoHibridoViewController;
import co.edu.uniquindio.poo.viewController.MenuVehiculoViewController;
import co.edu.uniquindio.poo.viewController.MotoGasolinaViewController;
import co.edu.uniquindio.poo.viewController.PickUpHibridoViewController;
import co.edu.uniquindio.poo.viewController.SubMenuVehiculoGasolinaViewController;
import co.edu.uniquindio.poo.viewController.SubMenuVehiculoHibridoViewController;
import co.edu.uniquindio.poo.viewController.VanGasolinaViewController;

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
		this.primaryStage.setTitle("Concesionario");
        openCrudMenuVehiculo();
    }

    private void openViewPrincipal() {
        //inicializarData();
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("CrudMenuVehiculo.fxml"));
            javafx.scene.layout.VBox rootLayout = (javafx.scene.layout.VBox) loader.load();
            MenuVehiculoViewController menuVehiculoViewController = loader.getController();
            menuVehiculoViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

    public void openCrudVanGasolina() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("CrudVanGasolina.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            VanGasolinaViewController vanGasolinaViewController = loader.getController();
            vanGasolinaViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void openCrudMotoGasolina() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("CrudMotoGasolina.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            MotoGasolinaViewController motoGasolinaViewController = loader.getController();
            motoGasolinaViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void openCrudDeportivoHibrido() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("CrudDeportivoHibrido.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            DeportivoHibridoViewController deportivoHibridoViewController = loader.getController();
            deportivoHibridoViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void openCrudPickUpHibrido() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("CrudPickUpHibrido.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            PickUpHibridoViewController pickUpHibridoViewController = loader.getController();
            pickUpHibridoViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void openCrudSubMenuVehiculoGasolina() {
        //inicializarData();
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("CrudSubMenuVehiculoGasolina.fxml"));
            javafx.scene.layout.VBox rootLayout = (javafx.scene.layout.VBox) loader.load();
            //AnchorPane rootLayout = (AnchorPane) loader.load();
            SubMenuVehiculoGasolinaViewController subMenuVehiculoGasolinaViewController = loader.getController();
            subMenuVehiculoGasolinaViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openCrudSubMenuVehiculoHibrido() {
        //inicializarData();
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("CrudSubMenuVehiculoHibrido.fxml"));
            javafx.scene.layout.VBox rootLayout = (javafx.scene.layout.VBox) loader.load();
            //AnchorPane rootLayout = (AnchorPane) loader.load();
            SubMenuVehiculoHibridoViewController subMenuVehiculoHibridoViewController = loader.getController();
            subMenuVehiculoHibridoViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void openCrudMenuVehiculo() {
        //inicializarData();
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("CrudMenuVehiculo.fxml"));
            javafx.scene.layout.VBox rootLayout = (javafx.scene.layout.VBox) loader.load();
            //AnchorPane rootLayout = (AnchorPane) loader.load();
            MenuVehiculoViewController menuVehiculoViewController = loader.getController();
            menuVehiculoViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}