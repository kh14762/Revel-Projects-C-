package csci;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BagelCalc extends Application {
	// Create Textfields & Btns
	private TextField tfPBagels = new TextField();
	private TextField tfSBagels = new TextField();
	private TextField tfTwists = new TextField();
	private Button btCalc = new Button("Calculate");
	
	
	@Override
	public void start(Stage primaryStage) {
		
		// Create UI with Labels, TextFields, and Buttons
		BorderPane bp = new BorderPane();
		GridPane gPane = new GridPane();
		IngredientPane iPane = new IngredientPane();
		
		gPane.setHgap(5);
		gPane.setVgap(5);
		gPane.add(new Label("Plain Bagels"), 0, 0);
		gPane.add(tfPBagels, 1, 0);
		gPane.add(new Label("Sweet Bagels"), 0, 1);
		gPane.add(tfSBagels, 1, 1);
		gPane.add(new Label("Twists"), 0, 2);
		gPane.add(tfTwists, 1, 2);
		gPane.add(btCalc, 1, 3);
		
		bp.setCenter(gPane);
		bp.setBottom(iPane);
		
		//set properties for UI
		gPane.setAlignment(Pos.CENTER);
		tfPBagels.setAlignment(Pos.BOTTOM_RIGHT);
		tfSBagels.setAlignment(Pos.BOTTOM_RIGHT);
		tfTwists.setAlignment(Pos.BOTTOM_RIGHT);
		
		GridPane.setHalignment(btCalc, HPos.RIGHT);
		
		
		// Process events w/ a lambda expression to call calculate batch
			btCalc.setOnAction(e -> calculateBatch());
		
		
		// Create scene and place it in the stage
		Scene scene = new Scene(bp, 400, 450);
		primaryStage.setTitle("Batch Calculator");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	private void calculateBatch() {
		if (tfPBagels.getText() != null && !tfPBagels.getText().isEmpty() &&
				tfSBagels.getText() != null && !tfSBagels.getText().isEmpty() && 
				tfTwists.getText() != null && !tfTwists.getText().isEmpty()) {
			int pBagels = Integer.parseInt(tfPBagels.getText());
			int sBagels = Integer.parseInt(tfSBagels.getText());
			int twists = Integer.parseInt(tfTwists.getText());
			
			DailyBatchRecipe batch = new DailyBatchRecipe(pBagels, sBagels, twists);
			iPane.setText()
			
			
			}
		}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
