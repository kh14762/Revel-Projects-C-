package csci;

import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public class IngredientPane extends BorderPane {

	private TextArea taPrintout = new TextArea();
	
	//constrcutor for IngredientPane
	public IngredientPane() {
		
		//set font for TextArea
		taPrintout.setFont(new Font("Arial", 20));
		taPrintout.setWrapText(true);
		taPrintout.setEditable(false);
		
		
		ScrollPane scrollPane = new ScrollPane(taPrintout);
		setCenter(scrollPane);
	    setPadding(new Insets(5, 5, 5, 5));
	}
	
	public void setDescription(String text) {
		taPrintout.setText(text);
	}
	
	
}
