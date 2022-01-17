package registrationReview;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistrationRunner {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		String choice;
		
		Registration userRegistration= new Registration();
		
		ArrayList<User> user= new ArrayList<>();
		
		boolean exit=true;
		while(exit) {
		System.out.println("Please \n For user registration--1\n To see lucky users--2\n To exit--3 ");
		choice=scan.next();		
		
		switch(choice)
		{
		case"1":
			user= userRegistration.register();
			break;
		case"2":
			userRegistration.printHappyUsers(user);
			break; 
		case"3":
			userRegistration.printUsers(user);
			break;
		case"4":
			exit=false;
			break;
			
	   default:
		   System.out.println("Wrong porcess");
		   break;
					
		}}
		
		
		
		

	}

}
