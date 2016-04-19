package qcm.controllers;

import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
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
    public TableView<Utilisateur> getPersonnTable() {
		return personnTable;
	}
    public void setPersonnTable(TableView<Utilisateur> personnTable) {
		this.personnTable = personnTable;
	}
    public TableColumn<Utilisateur, String> getFirstNameCloumn() {
		return firstNameColumn;
	}

	public void setPrenomColumn(TableColumn<Utilisateur, String> firstNameColumn) {
		this.firstNameColumn = firstNameColumn;
	}

	public TableColumn<Utilisateur, String> getLastNameColumn() {
		return lastNameColumn;
	}

	public void setNomColumn(TableColumn<Utilisateur, String> lastNameColumn) {
		this.lastNameColumn = lastNameColumn;
	}
	@FXML
	public void deleteUser() {
		int selectedIndex = personnTable.getSelectionModel().getSelectedIndex();
		Utilisateur selectedUser = personnTable.getSelectionModel().getSelectedItem();
		if (selectedIndex >= 0) {
			personnTable.getItems().remove(selectedIndex);
			mainApp.getTaskQueue().delete(selectedUser, selectedUser.getId());
		} else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getPrimaryStage());
			alert.setTitle("No Selection");
			alert.setHeaderText("No Person Selected");
			alert.setContentText("Please select a person in the table.");

			alert.showAndWait();
		}
	}

}