package day05homework;

import java.util.Scanner;

public class IfElse02 {
	/*
	   Ask user to enter his/her age and gender. If the age is more than 65 and the gender is male 
       then output will be “Hey man you retired!” else output will be “No need to work”
	 */

	public static void main(String[] args) {
		
        Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your age..");
		
		int age = scan.nextInt();
		
        System.out.println("Please enter your gender..");
		
		String gender = scan.next();
		
		if(age>65 && gender.equalsIgnoreCase("male"))
		{
			System.out.println("Hey man you retired!!!");
		}
		else
		{
			System.out.println("You need to work");
		}
		

	}

}
