package com.example;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
// import javafx.fxml.FXMLLoader;

/**
 * A simple application to show JavaFX development as a Maven project.
 * <p>
 * This project shows use of com.zenjava:javafx-maven-plugin to build as Maven target.
 * Example targets are jfx:jar, jfx:run, and jfx:native.
 * <p>
 * Native application requires:
 * <ul>
 * <li>Inno Setup 5 or later from http://www.jrsoftware.org
 * <li>WiX 3.0 or later from http://wix.sf.net
 * </ul>
 * 
 * @author <a href="mailto:dan@danbecker.info">Dan Becker</a>
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
		    // Note to be found resources should be in same package as class, src/main/resources/com/example
		    // Alternatively the resource can be loaded from the rout context, /application.css
			// BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("HelloWorldFX.fxml"));
		    BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}