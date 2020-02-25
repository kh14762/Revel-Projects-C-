package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ArrangingGUIDemo extends Application {

	private Label lblValue = new Label("Number: ");
	private TextField tfResult = new TextField();
	private Button btnCalc = new Button("Calculate");
	private Button btnReset = new Button("Reset");

	public void start(Stage primaryStage) {

		FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(10));
		pane.setHgap(10);
		pane.getChildren().add(lblValue);
		pane.getChildren().add(tfResult);
		pane.getChildren().add(btnCalc);
		pane.getChildren().add(btnReset);

		tfResult.setOnAction(e -> setSquareRoot());
		btnReset.setOnAction(e -> resetLabel());
		btnCalc.setOnAction(e -> setSquareRoot());

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 320, 100);
		primaryStage.setTitle("Arranging Demo"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	/** 
	 * Calculate the square root of the number in the text field
	 * Note:  Sets a value of 0 if the field is blank
	 *        Does not detect negative numbers
	 */
	private void setSquareRoot() {
		double result = 0.0;
		
		// make sure we have a value from the text field
		if (tfResult.getText() != null && !tfResult.getText().isEmpty()) {
			result = Math.sqrt(Double.parseDouble(tfResult.getText()));
		}
		
		// output our results and update UI to make sense
		lblValue.setText("Sq Root: ");
		tfResult.setText(String.format("%.2f", result));
	}
	
	/** 
	 * Reset the label when a key is pressed
	 * Note: Enter will not fire this since it's the action event generator
	 */
	private void resetLabel() {
		lblValue.setText("Number: ");
		tfResult.setText("");
	}

	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}