import java.util.ArrayList;

public class Country {
	
	private String name;
	private double funds;
	private ArrayList<IProduct> inventory;
	
	public Country(String inputName) {
		name = inputName;
		funds = 1000;
		inventory = new ArrayList<IProduct>();
	}
	
	public String getName() {
		return name;
	}

	public double getFunds() {
		return funds;
	}
	
	public void placeOrder(ArrayList<String> purchasedItems, Company supplier) {	
		supplier.receiveOrder(purchasedItems, this);	
	}
	
	public void pay(double total) {
		funds -= total;
	}
	
	public void receiveShipment(ArrayList<IProduct> incomingItems) {
		inventory.addAll(incomingItems);
	}
	
}
