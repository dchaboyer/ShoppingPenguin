public class Cleo implements IProduct.ILollipop {
	
	private static String colour = "Blue";
	private static double cost = 5.68;
	private static String name = "Cleo Lollipop";

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
