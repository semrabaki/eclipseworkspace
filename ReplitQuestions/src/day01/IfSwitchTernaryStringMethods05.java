package day01;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods05 {
	
	/*
	 * Write a Java program to find the number of days in a month.(Use Switch Case) (Interview Question / Leak Year)
    Sample:
      INPUT:
       Input a month number: 2
        Input a year: 2016
      OUTPUT  :
       February 2016 has 29 days
	 */

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a month number");
		int month=scan.nextInt();
		System.out.println("enter a year");
		int year=scan.nextInt();
		
		
		String monthOfName="";
		int number_Of_DaysInMonth=0;
		
		switch (month) {
		
		case 1:
			monthOfName = "January";
            number_Of_DaysInMonth = 31;
            break;
		case 2:
			monthOfName = "February";
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                number_Of_DaysInMonth = 29;
            } else {
                number_Of_DaysInMonth = 28;
            }
            break;
		case 3:
			monthOfName="March";
			number_Of_DaysInMonth=31;
			break;
		case 4:
			monthOfName="April";
			number_Of_DaysInMonth=30;
			break;
		case 5:
			monthOfName="May";
			number_Of_DaysInMonth=31;
			break;
		case 6:
			monthOfName="june";
			number_Of_DaysInMonth=30;
			break;
		case 7:
			monthOfName="July";
			number_Of_DaysInMonth=31;
			break;
		case 8:
			monthOfName="August";
			number_Of_DaysInMonth=31;
			break;
		case 9:
			monthOfName="September";
			number_Of_DaysInMonth=30;
			break;
		case 10:
			monthOfName="October";
			number_Of_DaysInMonth=31;
			break;
		case 11:
			monthOfName="November";
			number_Of_DaysInMonth=30;
			break;
		case 12:
			monthOfName="December";
			number_Of_DaysInMonth=31;
			break;
			
		
		
		
		}System.out.println(monthOfName + " " + year+ " has "+ number_Of_DaysInMonth +" days");
		

	}

}
