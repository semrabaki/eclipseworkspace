package day03homework;

import java.util.Scanner;

public class PrintFirstLastName {
	
	/*
	  Type a program which asks user to enter his/her first name and last name, 
      then print it on the console. 
      Hint: To get String, use nextLine()
      
      */
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println(" Please enter your first and last name:");
		String firstName = scan.nextLine();
		String lastName = scan.nextLine();
		
		System.out.println(" Please enter your address:");
		String address = scan.nextLine();
		
		
		
		System.out.println("Entered first and last name: " + firstName+ " " + lastName);
		
		System.out.println("Entered address: " + address);
		scan.close();
		
		
		

	}

}
