package whileloopquestionspage93;

import java.util.Scanner;

public class Q5 {
	/*
	 * Type java code by using while loop, 
      Write a program to count the factors of an integer which is entered by user.

	 */

	public static void main(String[] args) {
		
		
        Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter an integer...");
		
		int num = scan.nextInt();
		
		int i=1;
		
		while(i<=num) {
			
			if (num%i==0)
				{
					System.out.println(i);
				}
			
			i++;}
		}
		

	}


