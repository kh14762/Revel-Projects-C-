package sample;

import java.util.ArrayList;



import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JavaFXSample extends Application{
	Group root = new Group();

	@Override
	public void start(Stage primaryStage) {
		//create Shape list
		ArrayList<Node> shapeList = new ArrayList<>();
		//create things to add to group
		Rectangle rect1 = new Rectangle(100, 100, 200, 300);
		rect1.setStroke(Color.BLACK);
		rect1.setFill(Color.GREY);
		shapeList.add(rect1);
		
		
		
		
		//loop that adds shape objects to root group
		for (int i = 0; i < shapeList.size(); i++) {
			root.getChildren().add(shapeList.get(i));
		}
		
		//create scene, set title, place, and show
		Scene scene = new Scene(root, 400, 500, Color.WHITE);
		primaryStage.setTitle("Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String args[]) {
		launch(args);
	}
}
