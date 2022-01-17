package day01;

import java.util.Scanner;

public class ForWhile09 {
	
	/*
	 * Write a program to reverse the number which user entered
	 * input:1238
	 * output:8321
	 */

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter a number..");
		
		int number=scan.nextInt();
		
		int reverse=0;
		int reminder=0;
		int digits;
		
		while(number>0)

		{
			digits=number%10;
			System.out.print(digits);
			number=number/10;
		}
	}

}
