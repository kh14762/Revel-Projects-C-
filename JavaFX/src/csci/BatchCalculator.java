package csci;

public class BatchCalculator {
	private double[] iArray = {12530, 454, 2390, 240, 1190, 454, 11350, 11350, 125};
	private String[] nameArray = {"Water", "Salt", "Honey", "Malt Syrup", "Rye Flour", "Malt Powder", "Lancelot Flour", "Galahad Flour", "Yeast"};
	private int numPBagels;
	private int numSBagels;
	private int numTwists;
	
	public BatchCalculator() {
		
	}
	public BatchCalculator(int numPBagels, int numSBagels, int numTwists) {
		setNumPBagels(numPBagels);
		setNumSBagels(numSBagels);
		setNumTwists(numTwists);
	}
	
	// Getters and setters
	public double[] getiArray() {
		return iArray;
	}
	public void setiArray(double[] iArray) {
		this.iArray = iArray;
	}
	public String[] getNameArray() {
		return nameArray;
	}
	public void setNameArray(String[] nameArray) {
		this.nameArray = nameArray;
	}
	public int getNumPBagels() {
		return numPBagels;
	}
	public void setNumPBagels(int numPBagels) {
		this.numPBagels = numPBagels;
	}
	public int getNumSBagels() {
		return numSBagels;
	}
	public void setNumSBagels(int numSBagels) {
		this.numSBagels = numSBagels;
	}
	public int getNumTwists() {
		return numTwists;
	}
	public void setNumTwists(int numTwists) {
		this.numTwists = numTwists;
	}
}
