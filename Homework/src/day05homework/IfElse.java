package day05homework;

import java.util.Scanner;

public class IfElse {
	/*
	 Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even, 
     the output will be ?The integer is even?. If the integer is odd, the output will be ?The integer is odd?
	 */

	public static void main(String[] args) {
		
       Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter a number..");
		
		int num = scan.nextInt();
		
//		if (num%2==0)
//		{
//			System.out.println("The integer is even");
//		}else
//		{
//			System.out.println("The integer is odd");
//		}
	     // result= num%2;
	     
	     System.out.println(num%2==0 ? "The integer is even":"The integer is odd");

	}

}
