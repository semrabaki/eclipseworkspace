package day05homework;

import java.util.Scanner;

public class IfElse05 {
	/*
	 * Ask user ta enter any name of the week, then get second ,fourth, 
       and sixth letter of the day name and print them on the console, 
       in the same line. 
       For example; if the user enters “Monday” output will be “ody”
	 */

	public static void main(String[] args) {
		
		
       Scanner scan = new Scanner (System.in);
		
		System.out.println("Hey user enter a day name..");
		String dayName = scan.next();
		
		if(dayName.equalsIgnoreCase("Monday")|| dayName.equalsIgnoreCase("Tuesday")|| dayName.equalsIgnoreCase("Wednesday")|| dayName.equalsIgnoreCase("Thursday")|| dayName.equalsIgnoreCase("Friday") ||dayName.equalsIgnoreCase("Saturday")|| dayName.equalsIgnoreCase("Sunday")) {
			
			System.out.println (dayName.charAt(1)+ dayName.charAt(3)+ dayName.charAt(5));
			System.out.print (dayName.charAt(1));
			System.out.print (dayName.charAt(3));
			System.out.print (dayName.charAt(5));
		} 
		 else {
			System.out.println(" User enter a day name!!!");
		}
		scan.close();
		

	}

}
