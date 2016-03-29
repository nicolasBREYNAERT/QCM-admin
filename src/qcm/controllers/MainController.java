package qcm.controllers;

import javafx.application.Platform;
import qcm.MainApp;

public class MainController {
	private MainApp mainApp;

	public MainController() {
		// TODO Auto-generated constructor stub
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

}