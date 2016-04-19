package qcm.controllers;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import qcm.MainApp;
import qcm.models.pojo.Utilisateur;

public class AccueilController {
	@FXML
	private ProgressBar pbTasks;
	@FXML
    private TableView<Utilisateur> personnTable;
    @FXML
    private TableColumn<Utilisateur, String> firstNameColumn;
    @FXML
    private TableColumn<Utilisateur, String> lastNameColumn;
    protected MainApp mainApp;

    public void setMainApp(MainApp mainApp) {
    	this.mainApp = mainApp;
    	personnTable.setItems(mainApp.getPersonData());
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    	// Initialize the person table with the two columns.
    	firstNameColumn.setCellValueFactory((CellDataFeatures<Utilisateur, String> feature) -> {
    				Utilisateur user = feature.getValue();
    				return new SimpleObjectProperty<>(user.getPrenom());
    			});
    	lastNameColumn.setCellValueFactory((CellDataFeatures<Utilisateur, String> feature) -> {
    				Utilisateur user = feature.getValue();
    				return new SimpleObjectProperty<>(user.getNom());
    			});
    }
    
    public ProgressBar getPbTasks() {
		return pbTasks;
	}
}