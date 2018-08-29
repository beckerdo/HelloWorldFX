package com.example;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
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
//		try {
//		    // Note to be found resources should be in same package as class, src/main/resources/com/example
//		    // Alternatively the resource can be loaded from the rout context, /application.css
//			// BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("HelloWorldFX.fxml"));
//		    BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
	    
        primaryStage.setTitle("JavaFX Welcome");

        // Set up pane and properties
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Add form to pane
        createForm( grid );
        // Add a button with action
        createFormAction( grid );
        
        // Show the scene
        Scene scene = new Scene(grid, 400, 400);
        primaryStage.setScene(scene);
        
        primaryStage.show();
	}
	
	protected void createForm( GridPane grid ) {
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);        
	}
	
	protected void createFormAction( GridPane grid ) {
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        btn.setOnAction(new EventHandler<ActionEvent>() {            
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign in button pressed");
            }
        });
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}