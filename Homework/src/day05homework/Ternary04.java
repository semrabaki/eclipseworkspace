package day05homework;

import java.util.Scanner;

public class Ternary04 {
	/*
	 * Ask user to enter an integer. If the number has 3 digits, output will be 
       “This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”
       How can you decide the number of digits of an integer?
	 */

	public static void main(String[] args) {
		
       Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter a number..");
		
		int number = scan.nextInt();
		//2.way
		Integer wrappedNumber= number;
		//int length= wrappedNumber.le
		
		//2.way
		String stringNumber = Integer.toString(number);
		
		System.out.println(stringNumber.length()==3 ? "This number has 3 digits." : "This number has no 3 digits");

	}

}
