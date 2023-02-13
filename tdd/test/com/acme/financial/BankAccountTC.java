package com.acme.financial;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.acme.financial.BankAccount;

class BankAccountTC {

	@Test
	void testDeposit() throws Exception {
		BankAccount acct = new BankAccount(0);
		
		assertNotNull(acct);
		assertEquals(0, acct.getBalance(), "balance should be 0");
		
		acct.deposit(100);
		assertEquals(100, acct.getBalance(), "balance should be 100");
		
	}
	
	@Test
	void testWithdraw() throws Exception {
		BankAccount acct = new BankAccount(100);
		
		assertNotNull(acct);
		assertEquals(100, acct.getBalance(), "balance should be 100");
		
		acct.withdraw(50);
		assertEquals(50, acct.getBalance(), "balance should be 50");
		
	}
	
	@Test
	void testTransfer() throws Exception {
		BankAccount acct1 = new BankAccount(100);
		BankAccount acct2 = new BankAccount(100);
		
		assertNotNull(acct1);
		assertEquals(100, acct1.getBalance(), "balance should be 100");
		assertNotNull(acct2);
		assertEquals(100, acct2.getBalance(), "balance should be 100");
		
		acct1.transfer(25, acct2);
		assertEquals(75, acct1.getBalance(), "balance should be 75");
		assertEquals(125, acct2.getBalance(), "balance should be 125");
		
	}
	
	
	/*
	 testWithdraw
	 create an account object with 100
	 
	 make sure the object is not null
	 test to make sure that the initial balance is 100
	 
	 acct.withdraw(50);
	 make sure the balance is now 50
	 */
	
	/*
	 testTransfer
	 create one account with 100
	 create another with 100
	 
	 make sure neither object is null
	 make sure the balance of both is 100
	 
	 acct1.transfer(25, acct2);
	 make sure acct1 now has 75
	 make sure acct2 now has 125
	 */

}
