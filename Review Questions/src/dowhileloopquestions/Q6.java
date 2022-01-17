package dowhileloopquestions;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
		/*
		 * Ask user to enter a name. 
           If the name contains the letter ‘a’ then print "Won!" on the console 
           otherwise ask user to enter another name. 
           Use do-while loop
		 */
     
		Scanner scan = new Scanner(System.in);
		String name="";
		int j=0;
		int counter=0;
		
		
		
		do
		{
			System.out.println("Enter a name..");
			name= scan.next();
			
			for (int i=0; i<name.length(); i++)
			{
				if(name.charAt(i)=='a') {
					counter++;
		
			  }
			}
			
			if(counter!=0)
			{	System.out.println("Won");
			
			}
				
			
		}while(counter==0);

	}

}
