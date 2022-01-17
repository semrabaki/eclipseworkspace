package day02;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		
		//Ask user to enter a word. If the word has odd number of characters //length() of characters
		//as has 3 or more characters, print the character in the middle of the word.
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter a word");
		String word=scan.next();
		
		if(word.length()%2!=0 && word.length()>=3)
		{
			System.out.println( word.charAt(((word.length())/2))); 
			System.out.println(word.substring(word.length()/2, word.length()/2+1));
		}
	}

}
