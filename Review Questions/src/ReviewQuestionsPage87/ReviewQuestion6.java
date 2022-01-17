package ReviewQuestionsPage87;

import java.util.Scanner;

public class ReviewQuestion6 {

	//Ask user to enter a String and output will be the number of the characters in the String.
	public static void main(String[] args) {
		
      Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Please enter a string..");
		
		String str = scan.next();
		
		int numberOfChar = str.length();
		System.out.println(" The string entered is "+ numberOfChar+ " character long");

	}

}
