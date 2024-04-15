/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class ChoosingCarController implements Initializable {

    @FXML
    private TextField searchBarTF;
    @FXML
    private TextField ModelTF;
    @FXML
    private TextField yearTF;
    @FXML
    private ComboBox<?> priceFilterCB;
    @FXML
    private CheckBox manualCheckBox;
    @FXML
    private CheckBox automaticCheckBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addToCartOnAction(ActionEvent event) {
    }
    
}
