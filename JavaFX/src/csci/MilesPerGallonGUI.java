package csci;

/**
 * File: ch15/MilesPerGallonGUI.java
 * Class: CSCI 1302
 * @author Christopher Williams
 * Created on: July 16, 2018
 * Last Modified: April 15, 2019
 * Description: JavaFX GUI miles per gallon calculator
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MilesPerGallonGUI extends Application {
	private TextField tfMiles = new TextField();
	private TextField tfGallons = new TextField();
	private TextField tfMilesPerGallon = new TextField();
	private Button btCalculate = new Button("Calculate");
	private RadioButton rbMPG = new RadioButton("mpg");
	private RadioButton rbLKM = new RadioButton("L/100KM");
	ToggleGroup tgConversion = new ToggleGroup();
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		rbMPG.setToggleGroup(tgConversion);
		rbLKM.setToggleGroup(tgConversion);
		
		
		
		
		// Create UI with Labels, TextFields, and a Button
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(rbMPG, 0, 0);
		gridPane.add(rbLKM, 1, 0);
		gridPane.add(new Label("Miles:"), 0, 1);
		gridPane.add(tfMiles, 1, 1);
		gridPane.add(new Label("Gallons:"), 0, 2);
		gridPane.add(tfGallons, 1, 2);
		gridPane.add(btCalculate, 1, 3);
		gridPane.add(new Label("Miles Per Gallon:"), 0, 4);
		gridPane.add(tfMilesPerGallon, 1, 4);
		
	
		

		// Set properties for UI
		gridPane.setAlignment(Pos.CENTER);
		tfMiles.setAlignment(Pos.BOTTOM_RIGHT);
		tfGallons.setAlignment(Pos.BOTTOM_RIGHT);
		tfMilesPerGallon.setAlignment(Pos.BOTTOM_RIGHT);
		tfMilesPerGallon.setEditable(false);
		GridPane.setHalignment(btCalculate, HPos.RIGHT);

		// Process events with a lambda expression to call calculate MPG
		btCalculate.setOnAction(e -> calculateMPG());
		tfMiles.setOnAction(e -> calculateMPG());
		tfGallons.setOnAction(e -> calculateMPG());

		// Create a scene and place it in the stage
		Scene scene = new Scene(gridPane, 400, 250);
		primaryStage.setTitle("MPG Calculator"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	private void calculateMPG() {
		// make sure there are no blank or un-entered values
		if (tfMiles.getText() != null && !tfMiles.getText().isEmpty() &&
				tfGallons.getText() != null && !tfGallons.getText().isEmpty()) {
			
			// pull text from TextField(s) and convert to double to do numeric operations
			double miles = Double.parseDouble(tfMiles.getText());
			double gallons = Double.parseDouble(tfGallons.getText());
			double result = miles/gallons;

			// Display miles per gallon in result TextField with 4 decimal places by converting back to string
			tfMilesPerGallon.setText(String.format("%.2f", result));
		}
	}

	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}

