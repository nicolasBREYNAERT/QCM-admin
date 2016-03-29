package qcm.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import qcm.models.Utilisateur;

public class showAccueilController {
	@FXML
    private TableView<Utilisateur> personTable;
    @FXML
    private TableColumn<Utilisateur, String> firstNameColumn;
    @FXML
    private TableColumn<Utilisateur, String> lastNameColumn;
	
    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public showAccueilController() {
    }

    
    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        // Initialize the person table with the two columns.
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
    }
}
