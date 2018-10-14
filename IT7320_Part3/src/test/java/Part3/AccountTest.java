package Part3;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	Account obj = new Account(30);
	
	@Test
	public void debitTest() {
		double balanceTest = 30;		
		double withdrawalTest = 5;
		
		//double newBalanceTest = obj.debit(withdrawalTest);
		//double newBalanceTest = balanceTest - withdrawalTest;
		
		assertEquals(25, obj.debit(withdrawalTest), 0.3);
	}
	
	@Test
	public void creditTest() {
		double balanceTest = 30;
		double amountTest = 5;
		
		assertEquals(35, obj.credit(amountTest), 0.3);
	}

}
