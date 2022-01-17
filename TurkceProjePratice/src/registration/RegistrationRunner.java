package registration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistrationRunner {
	
	
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		String choice;
		
		
		Registration userRegistration =new Registration();  //TO use the methods in the registration class I must create an obejct
	//	ArrayList<User> register=null;
		ArrayList<User> register= new ArrayList<>();
		
		boolean exit=false;
		
		while(!exit)
		{
			System.out.println("Please \n For user registration--1\n To see user list--2\n To see lucky users--3\n To exit--4 ");
			
			choice= scan.next();
			
			switch(choice)
			{
			
			case"1":
				register=(ArrayList<User>) userRegistration.register();
				break;
			case"2":
				userRegistration.listele( register);
				break;
			case"3":
				userRegistration.printHappyUsers(register);
				break;
			case"4":
				exit=true;
				break;
			default:
				System.out.println("Error...");
				break;
				
				
			}
			
		}
		
	}

}
