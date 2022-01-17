package ReviewQuestionsPage87;

import java.util.Scanner;

public class ReviewQuestion03 {
	/*
	 Ask user to enter a letter, if it is uppercase check it is before “F” or not in alphabetical order. 
	 If it is before “F” in alphabetical order output will be “ Big before F”, otherwise output will be 
     “Big after F.” If it is lowercase check it is before “h” or not in alphabetical order. 
     If it is before “h” in alphabetical order output will be “Small before h”, otherwise “Small after h”
	 */

	public static void main(String[] args) {
	
        Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter a letter..");
		
		String letter = scan.next();
		char c= letter.charAt(0);

		if(c>64 && c<91)
		{
			if(c<70)
			{
				System.out.println(c+ " Big before F");
			}
			else
			{
				System.out.println(c+ " Big after F");
			}
		
		} else if(c>96 && c<123)
		{
			if(c<105)
			{
				System.out.println(c+ " small before h");
			}
			else
			{
				System.out.println(c+ " small after h");
			}
		} else
		{
			System.out.println("Enter a letter!!!");
		}
	}

}
