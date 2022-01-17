package registration;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {
	
	ArrayList<User>users= new ArrayList<>();

	public List<User> register()
	{
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter you name..");
		String name= scan.nextLine();
		
		
		User user= new User(name,LocalDateTime.now());
		users.add(user);
		
		
		return users;
		
	}
	
	public void printHappyUsers(ArrayList<User> users)
	{
		for(User w: users)
		{
			if(w.registerDate.getSecond()<10)
			{
				System.out.println(w.name+" you are a lucky user!!!");
			}
			else
			{
				System.out.println(w.name+" you registered after first 10 seconds passed....");
			}
		}
	
	}
	
	public void listele(ArrayList<User> users)
	{
		for(User w: users)
		{
			System.out.println("Adi : "+ w.name+ " kayit zamani: "+ w.registerDate);
		}
		
	}
	
}
