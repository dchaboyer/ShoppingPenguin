public class BoogieWonderland implements IProduct.ISong {

	private static String genre = "Boogie";
	private static double cost = 2.00;
	private static String name = "Boogie Wonderland";
	
	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}
	
	public void setGenre(String inputGenre) {
		genre = inputGenre;
	}
	
	public String getGenre() {
		return genre;
	}

	public void setName(String inputName) {
		name = inputName;
		
	}

	public void setCost(double inputCost) {
		cost = inputCost;
		
	}



}
