package day05homework;

import java.util.Scanner;

public class Ternary03 {
	
	/*
	    Ask user to enter a String. If the String has 2 characters, output will be 
       “It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations”
	 */
	
	
	public static void main (String[] args)
	{
        
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your String..");
		
		String ch = scan.next();
		
		int length = ch.length();
		
		System.out.println(length==2 ? length+" character is valid for state abbreviations": length+ " character is not valid for state abbreviations");
		
	}

}
