package ReviewQuestionsPage87;

import java.util.Scanner;

public class ReviewQuestion05 {
	
	/*
	 * A Ask user to enter a word which has 4 letters and output will be inverse of the word. 
       For example; if user enters “MARK” output will be “KRAM”
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String reverse="";
		System.out.println("Please enter 4 character string..");
		
		String str = scan.next();
		
		for (int i = str.length()-1; i>=0; i--)
		{
			char c = str.charAt(i);
			
			if (c!=' ')
			{
			
			reverse = reverse + c;
			
			}
			
			
			
		}
		System.out.println(reverse);
	}

}
