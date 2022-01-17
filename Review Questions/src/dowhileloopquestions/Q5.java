package dowhileloopquestions;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		/*
		 Ask user to enter a number. 
         If the number is divisible by 10 then print "Won!" on the console 
         otherwise ask user to enter another number. 
         Use do-while loop.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		int num=0;
		
		
		do {
			
			System.out.println("Enter a number..");
			num= scan.nextInt();
			if(num%10==0)
			{
				System.out.println("Won");
			}
			
			
		} while(num%10!=0);
		
		
		scan.close();

	}

}
