package com.timbuchalka;

/*
 Create a new class VipCustomer
 It should have 3 fields name, creditlimit, email address.
 create 3 cnstructors
 1st constructor empty should call the constructor with 3 paarmeetrs with default values
 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
 3rd constructor should save all fields
create getters
test and cinform
 */

public class VipCustomer {

	private String customerName;
	private double creditLimit;
	private String emailAddress;
	
	
	
	
	
	
	
	public VipCustomer() {
		this("Default name", 100000.0, "Default email");
		System.out.println("Empthy constructor");
	}
	

	public VipCustomer(String customerName, double creditLimit) {
		this(customerName, creditLimit, "unkown@gmail.com");
	}


	public VipCustomer(String customerName, double creditLimit, String emailAddress) {
		this.customerName = customerName;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}

	public String getCustomerName() {
		return customerName;
	}
	
	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	
	

}
