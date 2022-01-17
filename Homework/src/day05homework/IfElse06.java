package day05homework;

import java.util.Scanner;

public class IfElse06 {

	/*
	    Type java code by using if-else if() statement, 
        if both of the two integers are positive, output will be the sum of them. 
		If both of the two integers are negative, output will be the multiplication of them. 
		Otherwise; output will be �I cannot add or multiply different signed numbers�
	 */
	public static void main(String[] args) {
		
		    Scanner scan = new Scanner (System.in);
			
			System.out.println("Please enter two integers..");
			
			int num1 = scan.nextInt();
			
			int num2 = scan.nextInt();
			
			if(num1>0 && num2>00)
			{
				System.out.println("The sum of entered two pozitive numbers is "+ (num1+num2));
			} else if (num1<0 && num2<00)
			{
				System.out.println("The multipication of entered two negative numbers is "+ (num1*num2));
			}
			else
			{
				System.out.println("I cannot add or multiply different signed numbers");
			}
			
			scan.close();
		
	}

}
