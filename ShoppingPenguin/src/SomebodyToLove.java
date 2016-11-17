
public class SomebodyToLove implements IProduct.ISong{
	private static String genre = "Rock";
	private static double cost = 2.49;
	private static String name = "Somebody to Love";
	
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
