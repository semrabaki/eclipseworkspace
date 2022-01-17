package day04homework;

import java.util.Scanner;

public class IfStatement03 {
	/*
	 * Type java code by using if-else statement, 
       Write a program to print absolute value of a number entered by user.
       Absolute Value: If the number is positive or zero return the number itself
       If the number is negative return the number after multiplying by -1

	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter a number");
		
		int num = scan.nextInt();
		
		if (num>=0) {
			System.out.println(" The absolute value of the entered number: " + num);
		} else {
			System.out.println("The absolute value of the entered number: " + (num*-1));
		}
		

	}

}
