package day04homework;

import java.util.Scanner;

public class IfSatatement04 {
	
	/*
	 * A shop will give discount of 10% if the cost of purchased quantity is more than 1000. 
       Ask user for quantity and unit price then judge and print total cost for user. 
       If the quantity is less than 1000 output will be “No discount.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter the quantity and unit price for the purcahed item");
		
		int quantity = scan.nextInt();
		double unitPrice = scan.nextDouble();
		
		double totalCoast = quantity * unitPrice;
		if (quantity > 1000) {
			
			double discountedCoast = totalCoast - (totalCoast*10)/100;
			
			System.out.println(" Discounted sell, your total coast is " + discountedCoast);
			
			
		} else {
			System.out.println("No discount, your total coast is " + totalCoast);
		}
		
			
		

	}

}
