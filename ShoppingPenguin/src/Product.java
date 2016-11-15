public abstract class Product {
	
	private String name;
	private double cost;
	
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
	
}
