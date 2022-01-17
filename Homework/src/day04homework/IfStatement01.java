package day04homework;

import java.util.Scanner;

public class IfStatement01 {
	
	/*
	 * Type java code by using if statement. When you enter the initial of the day of a week, 
       output should be all possible names of the days. 
       For example; if the initial is ’S’ output should be “Saturday or Sunday”
	 */

	public static void main(String[] args) {
        
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Hey user enter the initial of the day..");
		String dayName = scan.next();
		
		if(dayName.equalsIgnoreCase("M")) {
			System.out.println("Monday");
		} 
		else if(dayName.equalsIgnoreCase("S")){
			System.out.println("Saturday or Sunday");
		} else if(dayName.equalsIgnoreCase("T")){
			System.out.println(" Tuesday or Thursday");
		}else if(dayName.equalsIgnoreCase("W")){
			System.out.println("Wednesday");}
		else if(dayName.equalsIgnoreCase("F")){
				System.out.println("Friday");}
				else {System.out.println("Hey user enter a right inital!!!");}
		scan.close();
		

	}

}
