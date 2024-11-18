package co.edu.uniquindio.poo.viewController;


    /**
     * Sample Skeleton for 'CrudVehiculoElectrico.fxml' Controller Class
     */

    import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
    
    public class VehiculoElectricoViewController {
    
        @FXML // ResourceBundle that was given to the FXMLLoader
        private ResourceBundle resources;
    
        @FXML // URL location of the FXML file that was given to the FXMLLoader
        private URL location;
    
        @FXML // fx:id="btAtras"
        private Button btAtras; // Value injected by FXMLLoader
    
        @FXML // fx:id="btnBusDiesel"
        private Button btnBusDiesel; // Value injected by FXMLLoader
    
        @FXML // fx:id="btnCamionetaElectrica"
        private Button btnCamionetaElectrica; // Value injected by FXMLLoader
    
        @FXML
        void CamionetaElectricaAction() {
    
        }
    
        @FXML
        void BusDieselAction() {
    
        }
    
        @FXML
        void onOpenMenu() {
    
        }
    
        @FXML // This method is called by the FXMLLoader when initialization is complete
        void initialize() {
            assert btAtras != null : "fx:id=\"btAtras\" was not injected: check your FXML file 'CrudVehiculoElectrico.fxml'.";
            assert btnBusDiesel != null : "fx:id=\"btnBusDiesel\" was not injected: check your FXML file 'CrudVehiculoElectrico.fxml'.";
            assert btnCamionetaElectrica != null : "fx:id=\"btnCamionetaElectrica\" was not injected: check your FXML file 'CrudVehiculoElectrico.fxml'.";
    
        }

        public void setApp(App app) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'setApp'");
        }
    }
    
