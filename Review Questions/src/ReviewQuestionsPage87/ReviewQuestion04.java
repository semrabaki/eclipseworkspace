package ReviewQuestionsPage87;

import java.util.Scanner;

public class ReviewQuestion04 {

	public static void main(String[] args) {
		/*
		 * Ask user ta enter his/her first and last name. If the first name is longer 
           output will be ?First name is longer.? If the length of last name is equal 
           To the length of last name output will be ?First name and last name 
           have same length.? Otherwise, output will be ?Last name is longer
		 */
		
		  Scanner scan = new Scanner (System.in);
			
			System.out.println("Please enter your first and last name..");
			
			String fullName = scan.nextLine();
			String firstName="";
			String lastName="";
			String c="";
			
			String trimmedFullName = fullName.trim();
			System.out.println(" Trimmed string  " + trimmedFullName);
			
//			for(int i=0; i<trimmedFullName.length(); i++)
//			{
//				if(trimmedFullName.charAt(i)!=' ')
//				{
//					
//					firstName = firstName+ trimmedFullName.charAt(i);
//				}
//			}
//			
//			int lastNameLength = trimmedFullName.length()- firstName.length();
//			
//			System.out.println("LastName is " + lastNameLength);
//			System.out.println("First Name is " + firstName +"  it is "+ firstName.length()+"  character" );
//			System.out.println("LastName is " + lastNameLength);

	}

}
