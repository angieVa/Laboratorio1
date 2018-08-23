package interfaz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Sort;

public class Main extends Application {

	private Sort sort;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
	
		Parent root = FXMLLoader.load(getClass().getResource("/view/inicio.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Sorting Program");
		primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
		
	}

}
