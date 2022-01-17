package day08homework;

import java.util.Scanner;

public class switch03 {

	public static void main(String[] args) {
		/*
		 * Ask user ta enter one of the ‘U’, ’S’, and ‘A’. 
			Then type a program by using “switch statement” to print “United” for ‘U’ 
			”States” for ’S’, and “America” for ‘A’
		 */
      Scanner scan = new Scanner(System.in);
   System.out.println("Hey user enter U, S or A.");
		
   
		String answer = scan.next();
		
		switch (answer)
		{
		case "U": System.out.println("United");
		break;
		case "S": System.out.println("States");
		break;
		case "A": System.out.println("Amerika");
		break;
		
		}
	}

}
