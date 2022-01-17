package day08homework;

import java.util.Scanner;

public class FoorLoop01 {

	public static void main(String[] args) {
		  // Type code to print all unique characters on the console from given String
        //samame==>se
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter a string...");
		
		String str = scan.nextLine();
//		
//		int firstIndexOfI;
//		int lastIndexOfI;
//		
//		for (int i=0; i<str.length(); i++)
//		{ 
//			char c = str.charAt(i);
//			firstIndexOfI= str.indexOf(c);
//			lastIndexOfI= str.lastIndexOf(c);
//			if (firstIndexOfI==lastIndexOfI)
//			{
//				System.out.println(" unique character  >" + c);
//			}
//			else
//			{
//				System.out.print("repeated character   >"+ c);
//			}
//			
//		}
		for (int i=0; i<str.length(); i++)
		{ 
			char c = str.charAt(i);
			
			if (str.indexOf(c)==str.lastIndexOf(c))
			{
				System.out.println(" unique character  >" + c);
			}
			else
			{
				System.out.print("repeated character   >"+ c);
			}
			
		}
		
		scan.close();
		

	}

}
