package day01;

import java.util.Scanner;

public class ReviewIfSwitchTernaryStringMethods03 {
	
	/*
	 * Write a Java program to compute and print sum of two given numbers (more than or equal to zero).
	   If given integers or the sum have more than 10 digits, print "overflow".
			EXAMPLE:
			INPUT :
			Input two integers:
			25
			46
			OUTPUT :
			Sum of the numbers: 71
	 */

	public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
		
		int num1;
		int num2;
		int sum;
		
		do {
			System.out.println("Enter two numbers");
			num1=scan.nextInt();
			num2=scan.nextInt();
			
		}while(num1<0||num2<0);
		
		sum=num1+num2;
		
		int counter=0;
		
		while(sum>0)
		{
			sum=sum/10;
			counter++;
		}
		
		System.out.println("Digit number: "+ counter);
		if(counter>10)
		{
			System.out.println("overflow");
		}
		else
		{
			System.out.println(num1+num2);
		}

	}

}
