package stringbuilderpractises;

import java.util.Scanner;

public class PalindromeWithStringBuilder {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a string...");
		String str= scan.nextLine();
		
		
		StringBuilder sB= new StringBuilder(str);
		
		String reversedStr= sB.reverse().toString();
		
		if(reversedStr.equalsIgnoreCase(str))
		{
			System.out.println(" It is a palindrome: "+reversedStr);
		}
		else
		{
			System.out.println("It is not a palindrome: "+reversedStr);
		}

	}

}
