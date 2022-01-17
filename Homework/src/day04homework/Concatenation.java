package day04homework;

public class Concatenation {
	
	/*
	 * Type a program to see the following outputs on the console 
       by using “concatenation” operation.
       A) Study Hard B) 5 Study C) Hard23 D) Hard1
	 */

	public static void main(String[] args) {
		int numA = 2; 
		int numB = 3;
		String str1 = "Study";
		String str2 = "Hard";
		
		// A) Study Hard
		
		System.out.println(str1.concat(" ").concat(str2));
		
		//B) 5 Study
		
		System.out.println((numA+numB) + " " + str1);
		
		//C) Hard23
		
		System.out.println(str2+numA+numB);
		
		//D) Hard1
		System.out.println(str2+ (numB-numA));
		
		
	}

}
