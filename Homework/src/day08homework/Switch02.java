package day08homework;

import java.util.Scanner;

public class Switch02 {
	
	//Write a Java program user will choose answer among A, B, C, or D. 
	//If the answer is true, output will be “True.” If the answer is false, output will be 
	//“False”. Correct answer is ‘C’ for the multiple option question
	
	//Type java code by using switch statement. 
	//A school has following rules for grading system: 
	//	1. For 50 - C 2. For 80 - B. 4. For 100 - A 
	//	Ask user to enter marks and print the corresponding grade

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
//		System.out.println("Hey user enter a number...");
//		
//		String answer = scan.next();
//		
//		switch (answer)
//		{
//		case "A": System.out.println("False");
//		break;
//		case "B": System.out.println("False");
//		break;
//		case "C": System.out.println("True");
//		break;
//		case "D": System.out.println("FAlse");
//		break;
//		}
        
System.out.println("Hey user enter a number...");
		
		String answer = scan.next();
		
		switch (answer)
		{
		case "A": System.out.println("100");
		break;
		case "B": System.out.println("80");
		break;
		case "C": System.out.println("50");
		break;
		case "D": System.out.println("0");
		break;
		}
		

	}

}
