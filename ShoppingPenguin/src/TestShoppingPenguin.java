import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestShoppingPenguin {
	
	Country canada = new Country("Canada");
	Country france = new Country("France");
	Country austrailia = new Country("Austrailia");
	Country antarctica = new Country("Antarctica");
	
	Company penguin = new Company("Shopping Penguin");

	@Test
	public void testCountryGetters() {
		assertTrue(canada.getFunds() == 1000);
		assertTrue(france.getName() == "France");
		assertFalse(austrailia.getFunds() == 1500);
		assertFalse(antarctica.getName() == "ABCD");
	}
	
	@Test
	public void testCountryPay() {
		canada.pay(120);
		assertTrue(canada.getFunds() == 880);
		france.pay(100);
		assertFalse(france.getFunds() == 1000);
	}
	
	@Test
	public void testProcessOrder() {
		ArrayList<IProduct> endResult = new ArrayList<IProduct>();
	}
	
	@Test
	public void testReceivePayment() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testCountryPlaceOrder() {
		fail("Not yet implemented");
	}

}
