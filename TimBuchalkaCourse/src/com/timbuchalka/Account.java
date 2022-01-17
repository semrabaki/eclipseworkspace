package com.timbuchalka;

public class Account {
	
	private String number;
	private double balance;
	private String custumerName;
	private String custumerEmailAdress;
	private String customerPhoneNumber;
	
	
	
	public Account() {
		
		this("5678", 2.50, "Default name", "Default address", "default phone");
		System.out.println("Emty constructor called");
	}
	
	
	public Account(String number, double balance, String custumerName, String custumerEmailAdress,
			String customerPhoneNumber) {
		
		
		System.out.println("Account constructor with parameter is called");
		this.number = number;
		this.balance = balance;
		this.custumerName = custumerName;
		this.custumerEmailAdress = custumerEmailAdress;
		this.customerPhoneNumber = customerPhoneNumber;
	}


	public void deposit(double depositAmount)
	{
		this.balance+=depositAmount;
		System.out.println("Deposit of"+ depositAmount+ " made. New balance is "+ this.balance);
	}
	public void withdrawal(double withdrawalAmaount)
	{
		if(this.balance-withdrawalAmaount<0)
		{
			System.out.println("Only "+this.balance+" avaliable.Withdrawal not processed");
		}else
		{
			this.balance-=withdrawalAmaount;
			System.out.println("withdrawal of "+withdrawalAmaount+" processed. Remaining balance= " + this.balance);
		}
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustumerName() {
		return custumerName;
	}
	public void setCustumerName(String custumerName) {
		this.custumerName = custumerName;
	}
	public String getCustumerEmailAdress() {
		return custumerEmailAdress;
	}
	public void setCustumerEmailAdress(String custumerEmailAdress) {
		this.custumerEmailAdress = custumerEmailAdress;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	

}
