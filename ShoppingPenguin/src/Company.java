public class Company {
	
	private double money;
	private String name;
	private LollipopFactory lollipopFactory;
	private SongFactory songFactory;
	
	public Company(String inputName) {
		name = inputName;
		money = 0;
		lollipopFactory = new LollipopFactory();
		songFactory = new SongFactory();
	}
	
	public void shipOrder() {
		
	}
	
	public void receivePayment() {
		
	}
	
	public void receiveOrder() {
		
	}

}
