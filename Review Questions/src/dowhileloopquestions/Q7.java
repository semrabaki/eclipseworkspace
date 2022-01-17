package dowhileloopquestions;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		
		/*
		 * Ask user to enter a String 
           Print the characters whose indexes are odd on the console
           For example; Germany ==> e m n
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a name..");
		String name= scan.next();
		
		int i=1;
		
		do
		{
			if(i%2==0)
			{
				System.out.print(name.charAt(i-1) + " ");
			}
			
			i++;
			
		}while(i<=name.length());
		

	}

}
