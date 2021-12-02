package application;

import java.io.IOException;

import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.*;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		try {
			primaryStage.setTitle("Electronic Voting Machine");
			// BorderPane root = new BorderPane();
			FXMLLoader root = new FXMLLoader(Main.class.getResource("UI.fxml"));
			Scene scene = new Scene(root.load(), 600, 400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch();
	}
}
