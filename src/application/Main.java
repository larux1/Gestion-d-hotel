package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	
	public static Stage stg;
	@Override
	public void start(Stage primaryStage) {
		
		try {
			stg= primaryStage;
			Parent root=FXMLLoader.load(getClass().getResource("/view/AccueilView.fxml"));
			Scene scene = new Scene(root);
			stg.setScene(scene);
			stg.show();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
