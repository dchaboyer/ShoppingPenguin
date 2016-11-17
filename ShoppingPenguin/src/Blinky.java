
public class Blinky implements IProduct.ILollipop {
	
	private static String colour = "Yellow";
	private static double cost = 3.14;
	private static String name = "Blinky Lollipop";

	public String getColour() {
		return colour;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public void setName(String inputName) {
		name = inputName;
		
	}

	public void setCost(double inputCost) {
		cost = inputCost;
		
	}

	public void setColour(String inputColour) {
		colour = inputColour;
		
	}

}
