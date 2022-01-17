package registrationReview;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

	ArrayList<User> users= new ArrayList<>();
	
	public ArrayList<User>  register()
	{
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name= scan.nextLine();
		
		User user= new User(name, LocalDateTime.now());
		
		users.add(user);
		
		return users;
		
	}
	
	public void printHappyUsers(ArrayList<User> users)
	{
		for(User w: users)
		{
			if(w.registerDate.getSecond()<10)
			{
				System.out.println(w.name+ " You are happy useer");
			}
			else
			{
				System.out.println(w.name+ " you are registered after 10 seconds");
			}
		}
	}
	
	public void printUsers(ArrayList<User>users)
	{
		for(User w:users)
		{
			System.out.println(w.name+ " " +w.registerDate);
		}
	}
	
}
