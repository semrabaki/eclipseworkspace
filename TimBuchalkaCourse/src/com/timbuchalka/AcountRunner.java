package com.timbuchalka;

/*
 Create a new class fora bank account
 Create fields for the accoun number, balance, customer name, email, and phone number.
 Create getters and stters for each field
 Create two additonal methods
 1. To allow the customer to deposit funds (this shouls increment the balance fields
 2.To allow the customer to withdraw funds. This should deduct from the balance field, but not allow
 the withdrawal to complete if their have insufficient funds
 you will want to create various code in the main class(the one created by intelliJ) to confirm your code is wokring
 //Add some System.out.Println`s inthe two methods avobe as well. 
 */

public class AcountRunner {

	public static void main(String[] args) {
	
		Account bobsAccount= new Account(); //("12345", 0.00, "Bob Brown", "myemail.@bob.com", "2107405932");
		
		System.out.println(bobsAccount.getNumber());
		System.out.println(bobsAccount.getBalance());
		System.out.println(bobsAccount.getCustumerName());
		System.out.println(bobsAccount.getCustumerEmailAdress());
		System.out.println(bobsAccount.getNumber());
		
//		bobsAccount.setNumber("12345");
//		bobsAccount.setBalance(0.00);
//		bobsAccount.setCustumerName("Bob Brown");
//		bobsAccount.setCustumerEmailAdress("sdkhsjd@gmail.com");
//		bobsAccount.setCustomerPhoneNumber("2107405932");
		
		
		bobsAccount.withdrawal(100.0);
		
		bobsAccount.deposit(50.0);
		bobsAccount.withdrawal(100.0);
		
		bobsAccount.deposit(51.0);
		bobsAccount.withdrawal(100.0);
		
		
		
		
		
	}

}
