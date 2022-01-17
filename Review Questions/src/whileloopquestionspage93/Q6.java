package whileloopquestionspage93;

import java.util.Scanner;

public class Q6 {
	/*
	 * Write a program that prompts the user to input an integer. 
      It should then find sum of the digits of that numbes
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter an integer...");
		
		int num = scan.nextInt();
		
		int remain =0;
		int sum=0;
		
		
		while(num>0)
		{
			remain=num%10;
			num= num/10;
			
			sum= sum+remain;
		}
		
		System.out.println(sum);
		
		

	}

}
