package day01;

import java.util.Scanner;

public class Q4Factorial {

	/*
	 * Write a return method that accepts an integer as input and calculates factorial and prints like output.
Input : 6
Output: 6!=65432*1=720
	 */
	public static void main(String[] args) {
		
	   Scanner scan= new Scanner(System.in);
		
       System.out.println("Enter a number...");
	   int num=scan.nextInt();
		
	System.out.print(num+"!=");
   System.out.println("*1="+makeFactorial(num));   
	   

	}
	public static int makeFactorial(int number)
	{
		
		int result=1;
		
		for(int i=number; i>1; i--)
		{
			System.out.print(i);
			result=result*i;
		}
		return result;
	}

}
