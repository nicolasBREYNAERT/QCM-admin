package qcm;

import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import qcm.controllers.AccueilController;
import qcm.controllers.MainController;
import qcm.models.pojo.Utilisateur;
import qcm.utils.WebGate;
import qcm.utils.saves.TaskQueue;

public class MainApp extends Application implements Observer {

	private Stage primaryStage;
	private BorderPane rootLayout;
	private ObservableList<Utilisateur> usersList;
	private AccueilController accueilController;
	private WebGate webGate;
	private TaskQueue taskQueue;
	private MainController mainController;
	
	public MainApp() {
		super();
		webGate = new WebGate();
		taskQueue = new TaskQueue("mainFx", webGate);
		taskQueue.addObserver(this);
		
		usersList = webGate.getList(Utilisateur.class);
		
	}

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("QCM-admin");
        initRootLayout();
        taskQueue.start();
        loadLists();
        showAccueil();
    }

    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("views/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    /**
     * Shows the person overview inside the root layout.
     */
    public void showAccueil() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("views/Accueil.fxml"));
            AnchorPane accueil = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(accueil);
            
         // Give the controller access to the main app.
            accueilController = loader.getController();
            accueilController.setMainApp(this);
            //accueilController.getPbTasks().progressProperty().bind(taskQueue.getService().progressProperty());
            

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /*public void handleDelete() {
    	AccueilController.deleteUser();
	}*/

    /**
	 * Returns the main stage.
	 * 
	 * @return
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}

	public ObservableList<Utilisateur> getPersonData() {
		return usersList;
	}

	public void setPersonData(ObservableList<Utilisateur> personData) {
		this.usersList = personData;
	}

	public WebGate getWebGate() {
		return webGate;
	}

	public TaskQueue getTaskQueue() {
		return taskQueue;
	}

	@Override
	public void stop() throws Exception {
		taskQueue.stop();
		super.stop();
	}
	
	public void loadLists() {
		taskQueue.getAll(Utilisateur.class);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}