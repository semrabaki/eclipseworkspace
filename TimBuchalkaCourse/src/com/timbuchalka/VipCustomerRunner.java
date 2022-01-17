package com.timbuchalka;

public class VipCustomerRunner {

	public static void main(String[] args) {
		
		VipCustomer person1= new VipCustomer();
		
		System.out.println(person1.getCustomerName());
		
		VipCustomer person2= new VipCustomer("Bob", 25000.00);
		
		System.out.println(person2.getCustomerName());
		System.out.println(person2.getEmailAddress());
		
		VipCustomer person3= new VipCustomer("Tim", 100.00,"tim@rmail.com");
		System.out.println(person3.getCustomerName());
		System.out.println(person3.getEmailAddress());
		
		
	}

}
