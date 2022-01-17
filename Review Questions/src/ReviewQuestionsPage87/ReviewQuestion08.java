package ReviewQuestionsPage87;

import java.util.Scanner;

public class ReviewQuestion08 {
	
	/*
	 * Ask user ta enter his/her first name, last name and Social Security Number. 
	Then type a program which makes 
	a) initials of the first name and the last name in uppercase, 
	other characters will be in lowercase. 
	b) all characters except last 4 characters of the Social Security Number “ * ”. 
 	For example; Suleyman Alptekin *****5678
	 */
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner (System.in);
			
			
			System.out.println("Please enter your first and last name..");
			
			String name = scan.nextLine();
			
			System.out.println("Please enter your social security number");
			
			String ssn = scan.nextLine();
			
			
			
			String firstName = name.substring(0, name.indexOf(" "));
			String firstInitial= firstName.substring(0, 1).toUpperCase();
		    String updatedFirstName= firstInitial.concat(firstName.substring(1));
		  
			
			String lastName = name.substring(firstName.length()+1);
		    String lastInitial = lastName.substring(0,1).toUpperCase();
			String updatedLastName = lastInitial.concat(lastName.substring(1));
			
			String lastFourDigits= ssn.substring(5);
			String firstFiveDigits = "*****";
			
			
			System.out.println(" " + updatedFirstName +" " + updatedLastName + " "+ firstFiveDigits + lastFourDigits);
			
			
		
	}

}
