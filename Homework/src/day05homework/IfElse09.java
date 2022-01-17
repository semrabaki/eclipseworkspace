package day05homework;

import java.util.Scanner;

public class IfElse09 {
	/*
	 Ask user to enter year 
     Type java code by using if-else if() statement. 
     Write a program to check if a year is leap year or not. 
     if the year is divisible by 100 then it must be divisible by 400. 
     If a year is not divisible by 100 then it must be divisible by 4.
	 */

	public static void main(String[] args) {
   
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your year..");
		
		int year = scan.nextInt();
		
		if (year%100==0 && year%400==0) 
		{
			System.out.println("It is a leap year");
		} else if (year%100!=0 && year%4==0)
		{
			System.out.println("It is a leap year");
		} else
		{
			System.out.println("It is not a leap year");
		}
		

	}

}
