package day05homework;

import java.util.Scanner;

public class Ternary05 {
	
	/*
	 * Ask user to enter a number. If the number is less than 10 and greater 
       than or equal to 0, calculate its cube. Otherwise, calculate its square. 
       Cube of a = a*a*a Square of a = a*a
	 */

	public static void main(String[] args) {
		
         Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter a number");
		
		int num = scan.nextInt();
		
		String result = num<10 && num>=0 ? "the cube of given number is " + (num*num*num): "The square of the given number is " +(num*num);
        System.out.println(result);
	}

}
