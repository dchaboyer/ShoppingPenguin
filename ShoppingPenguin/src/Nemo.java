public class Nemo implements IProduct.ILollipop {	
	
	private static String colour = "Orange";
	private static double cost = 1;
	private static String name = "Nemo Lollipop";

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
