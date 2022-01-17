package day02;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		
		/*
		  ask user to enter 2 int nubers then ask user to enter which operator they
		  want to use if addtion then priny hre the sum of your operation 
		 */
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Hey user enter two integer..");
		
		int num1= scan.nextInt();
		int num2= scan.nextInt();
		
        System.out.println("Hey user enter the operator..");
		
	   String ch= scan.next();
		
		switch(ch)
		{
			case "+":
			System.out.println("The sum of the given numbers: "+ (num1+ num2));
			break;
			case "addition":
				System.out.println("The sum of the given numbers: "+ (num1+ num2));
				break;
			case "-":
			System.out.println("The difference of the given numbers: "+ (num1-num2));
			break;
			case "subtraction":
				System.out.println("The difference of the given numbers: "+ (num1-num2));
				break;
			case "*":
			System.out.println("The multiplication of the given numbers: "+ (num1*num2));
			break;
			case "multiplication":
				System.out.println("The multiplication of the given numbers: "+ (num1*num2));
				break;
			
			case "/":
			System.out.println("The division of the given numbers: "+ (num1/num2));
			break;
			case "division":
				System.out.println("The division of the given numbers: "+ (num1/num2));
				break;
			
		}
		

	}

	private static void swicth(char ch) {
		// TODO Auto-generated method stub
		
	}

}
