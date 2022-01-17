package day01;

import java.util.Scanner;

public class Q1CharacterCount {
	
/*/Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name
e.g:
char ch1= 'a' ;
String name =“John came late"
Expected Output: Number of a = 2
*/

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Eneter a name");
		String name= scan.nextLine();
		System.out.println("Enter a character...");
		char ch=scan.next().charAt(0);
		
		int counter=0;
		
		for(int i=0; i<name.length(); i++)
		{
			
			if(name.charAt(i)==ch)
			{
				counter++;
			}
		}
		
		System.out.println(counter);

	}

}
