package co.edu.uniquindio.poo;

import java.io.IOException;

import co.edu.uniquindio.poo.model.Consecionario;
import co.edu.uniquindio.poo.viewController.CamionetaElectricoViewController;
import co.edu.uniquindio.poo.viewController.VehiculoElectricoViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */

    public class App extends Application {

        private Stage primaryStage;
        @SuppressWarnings("exports")
        public static Consecionario consecionario = new Consecionario("UQ");
    
        @Override
        public void start(@SuppressWarnings("exports") Stage primaryStage) throws IOException {
            this.primaryStage = primaryStage;
            this.primaryStage.setTitle("Concesionario");
            openCrudVehiculoElectrico();
        }
        

        
    
        public void openCrudVehiculoElectrico() {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(App.class.getResource("CrudVehiculoElectrico.fxml"));
                javafx.scene.layout.VBox rootLayout = (javafx.scene.layout.VBox) loader.load();
                VehiculoElectricoViewController vehiculoElectricoViewController = loader.getController();
                vehiculoElectricoViewController.setApp(this);
                
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
    
    
    public void openCrudCamionetaElectrico() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("CrudCamionetaElectrico.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            CamionetaElectricoViewController camionetaElectricoViewController = loader.getController();
            camionetaElectricoViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();}
        }

    public static void setRoot(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setRoot'");
    }

}

