package csci;
import java.util.ArrayList;
import java.util.Arrays;

public class DailyBatchRecipe {
	private int pBagel, sBagel, yy;
	private double numRaisins, numSprinkles;
	private double batchTotal, batchRatio;

	private ArrayList<Double> recipeList = new ArrayList<Double>(
			Arrays.asList(12530.0, 455.0, 2390.0, 240.0, 1190.0, 455.0, 11350.0, 11350.0, 125.0));
	private ArrayList<String> ingredientList = new ArrayList<String>(Arrays.asList("Water", "Salt", "Honey", "Malt Syrup",
			"Rye Flour", "Malt Powder", "Sir Lancelot Flour", "Sir Galahad Flour", "Yeast"));
	private ArrayList<Double> batchList = new ArrayList<Double>();

	public DailyBatchRecipe() {

	}

	public DailyBatchRecipe(int numPlainBagel, int numSweetBagel, int numYY) {
		setpBagel(numPlainBagel);
		setsBagel(numSweetBagel);
		setYy(numYY);
	}

	public String BatchCalculator() {
		ArrayList<Double> desiredBatch = new ArrayList<Double>();
		String rString = "";
		// sums all bagel weights in grams
		setBatchTotal((getpBagel() * 148) + (getsBagel() * 142) + (getYy() * 115));
		//Calculate batch ratio
		setBatchRatio(batchTotal / (265 * 148));
		//calculate amount of each ingredient needed
		for (int i = 0; i < ingredientList.size(); i++) {
			desiredBatch.add(batchRatio * recipeList.get(i));
		}
		
		//Calculate amount of raisins and sprinkles if sweet bagels and yys are to be made
		if (getYy() > 0 || getsBagel() > 0) {
			//calculate amount of sprinkles and raisins
			setNumRaisins(getsBagel() * 10);
			setNumSprinkles(getYy() * 3);
			//add amount and descriptors to lists
			desiredBatch.add(getNumRaisins());
			desiredBatch.add(getNumSprinkles());
			ingredientList.add("Raisins");
			ingredientList.add("Sprinkles");	
		}
		
		//create string for recipe 
		for (int i = 0; i < ingredientList.size(); i++) {
			rString += String.format("%s: %.2fg%n", ingredientList.get(i), desiredBatch.get(i));
		}
		return rString;

	}
//getters and setters for ingredients

	public double getNumRaisins() {
		return numRaisins;
	}

	public void setNumRaisins(double numRaisins) {
		this.numRaisins = numRaisins;
	}

	public double getNumSprinkles() {
		return numSprinkles;
	}

	public void setNumSprinkles(double numSprinkles) {
		this.numSprinkles = numSprinkles;
	}

	public int getpBagel() {
		return pBagel;
	}

	public void setpBagel(int pBagel) {
		this.pBagel = pBagel;
	}

	public int getsBagel() {
		return sBagel;
	}

	public void setsBagel(int sBagel) {
		this.sBagel = sBagel;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}

	public void setIngredientList(ArrayList<String> ingredientList) {
		this.ingredientList = ingredientList;
	}
	
	public double getBatchTotal() {
		return batchTotal;
	}
	
	public void setBatchTotal(double batchTotal) {
			this.batchTotal = batchTotal;	
	} 
	
	public double getBatchRatio() {
		return batchRatio;
	}
	
	public void setBatchRatio(double batchRatio) {
		this.batchRatio = batchRatio;
	}
	
	public ArrayList<Double> getRecipeList() {
		return recipeList;
	}

	public void setRecipeList(ArrayList<Double> recipeList) {
		this.recipeList = recipeList;

	}

	public ArrayList<String> getIngredientList() {
		return ingredientList;
	}

}
