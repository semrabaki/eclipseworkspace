package day03homework;

import java.util.Scanner;

public class CovertHourToSecond {
	
	/*Type a program which converts the hours to seconds. Hours value will be 
	entered by user. (Use long) 
	Hint 1: second = hour x 60 x 60 
	Hint 2: To get long, use nextLong()*/

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner (System.in);
			
			System.out.println("Please enter hour: ");
			
			long hour =scan.nextLong();
			
			System.out.println( hour + " hour is " + (hour*60*60) + "seconds." );
			
			scan.close();
		

	}

}
