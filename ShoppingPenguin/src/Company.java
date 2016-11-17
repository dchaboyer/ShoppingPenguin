import java.util.ArrayList;

public class Company {
	
	private double funds;
	private String name;
	private LollipopFactory lollipopFactory;
	private SongFactory songFactory;
	
	public Company(String inputName) {
		name = inputName;
		funds = 0;
		lollipopFactory = new LollipopFactory();
		songFactory = new SongFactory();
	}
	
	public void shipOrder(ArrayList<IProduct> outgoingItems, Country country) {
		country.receiveShipment(outgoingItems);
	}
	
	public void receivePayment(double payment) {
		funds += payment;
	}
	
	public void receiveOrder(ArrayList<String> items, Country customer) {
		ArrayList<IProduct> outgoingItems = new ArrayList<IProduct>();
		double currCost = 0;
		for(String specificItem : items) {
			IProduct product;
			if (specificItem.equalsIgnoreCase("nemo"))
				product = lollipopFactory.makeNemoLollipop();
			else if(specificItem.equalsIgnoreCase("cleo")) 
				product = lollipopFactory.makeCleoLollipop();
			else if(specificItem.equalsIgnoreCase("blinky"))
				product = lollipopFactory.makeBlinkyLollipop();
			else if(specificItem.equalsIgnoreCase("boogie wonderland"))
				product = songFactory.makeBoogieWonderland();
			else if(specificItem.equalsIgnoreCase("somebody to love"))
				product = songFactory.makeSomebodyToLoveWonderland();
			else
				product = null;
			if (product != null)
				currCost+= product.getCost();
				outgoingItems.add(product);
		}
		customer.pay(currCost);
		receivePayment(currCost);
		shipOrder(outgoingItems, customer);
	}
	
}
