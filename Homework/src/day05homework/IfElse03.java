package day05homework;

import java.util.Scanner;

public class IfElse03 {
	
	/*
	 *  Ask user to enter a character, then check whether the character is alphabet or not
	 */

	public static void main(String[] args) {
		
        Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your character..");
		
		String ch = scan.next();
		
		
		
		if (ch.charAt(0) >= 'A' && ch.charAt(0) <= 'z')
		{
			System.out.println("You entered a letter");
		}
		else
		{
			System.out.println("You did not enter a letter");
		}
		

	}

}
