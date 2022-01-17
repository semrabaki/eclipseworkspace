package day05homework;

import java.util.Scanner;

public class Ternary02 {
	/*
	 * Type java code by using using ternary. 
       Take values of length and width of a rectangle from user and check if it is square or not.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter two integers");
		
		int num1 = scan.nextInt();
		
		int num2 = scan.nextInt();
		
		System.out.println(num1==num2? "it is square":"it is regtangle");
		

	}

}
