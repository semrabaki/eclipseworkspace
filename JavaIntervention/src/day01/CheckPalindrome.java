package day01;

import java.util.Scanner;

/*
 Check given number is palindrome or not
 */
public class CheckPalindrome {

	public static void main(String[] args) {
		
		
        Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter a number...");
		int n=scan.nextInt();
		
		int d, rev=0,temp;
		temp=n;//n value will be changed later in the program.
		//so maintain copy of n in temp
		while(n>0)
		{
			d=n%10;//To extract last digit
			rev=rev*10+d; //To reverse the given number
			n=n/10;
		}
		
	   System.out.println("Reversed number is : "+rev);
	   
	     if(rev==temp)
	    	 System.out.println("The given number is palindrome");
	     else
	    	 System.out.println("The given number is not a plaindrome");

	}

}
