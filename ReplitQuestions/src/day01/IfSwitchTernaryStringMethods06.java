package day01;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods06 {
	/*
	 * Ask user to type a name, the length of name should be 3.
      Then check if the name has same characters.If the String has same characters
      Print "String has duplicate characters" Else Print "String has unique characters"
	  Please use ternary.
			Input :
			ala
			OutPut:
			String has duplicate characters
	 */

	public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
		
		String name;
		int num2;
		int sum;
		do {
			System.out.println("Enter a name with three characters.");
			name= scan.next();
			if(name.length()==3)
				break;
			
			
		}while(true);
		
		int counter=0;
		
		for(int j=0; j<name.length(); j++)
		{
			if(name.indexOf(name.charAt(j))!=name.lastIndexOf(name.charAt(j)))
				{
					counter++;
					
				}
		}
		if(counter>0)
		{
			System.out.println("String has duplicate characters");
		}else
      {
	System.out.println("String has not duplicate characters");		
     }
		

	}

}
