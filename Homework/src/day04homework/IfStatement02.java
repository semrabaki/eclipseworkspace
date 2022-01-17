package day04homework;

import java.util.Scanner;

public class IfStatement02 {
	
	/*
	 * Type java code by using if-else statement, 
       if the password is “JavaLearner”, output will be “The password is true”. 
       Otherwise, output will be “The password is false”.
	 */

	public static void main(String[] args) {
		
        Scanner scan = new Scanner (System.in);
		
		System.out.println("Hey user enter the password..");
		String passWord = scan.next();
		if(passWord.equals("JavaLearner"))
		{ 
			System.out.println("The password is true");
			
		}
		else {
		
		System.out.println("The password is false");
		
	}
	}
}
