package ReviewQuestionsPage87;

import java.util.Scanner;

public class ReviewQuestion01 {
	
	/*
	 * Ask user to enter an integer, if it is less than 10, calculate its square and print it on the console. 
       If it is greater than 10 multiply it by 2 and print it on the console. Otherwise keep the number same 
       and print it on the console.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter an integer..");
		
		int number = scan.nextInt();
		
		if(number<10)
		{
			int square= number* number;
			System.out.println(" The sqaure of given number: " +square);
			
		} else if (number > 10)
		{
			int multiply= number* 2;
			System.out.println(" The number *2 is: " +multiply);
		}
		else {
			System.out.println("the same number  "+ number);
		}
		
       scan.close();
	}

}
