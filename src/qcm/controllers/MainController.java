package qcm.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import qcm.MainApp;

public class MainController {

	private MainApp mainApp;

	@FXML
	private ProgressBar pbTasks;

	public MainController() {
	}

	public MainApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

	public void closeApp() {
		Platform.exit();
	}

	/*public void handleDelete() {
		this.mainApp.handleDelete();
	}*/

	public ProgressBar getPbTasks() {
		return pbTasks;
	}
}