package day08homework;

import java.util.Scanner;

public class Swith01 {
   
	
	//If the user pressed 1, 2, 3 the program will print the number that is pressed;
	// otherwise, program will print "Not allowed".
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hey user enter a number...");
		
		int num = scan.nextInt();
		
		switch (num)
		{
		case 1: System.out.println("The enterned number is "+num);
		break;
		case 2: System.out.println("The enterned number is "+num);
		break;
		case 3: System.out.println("The enterned number is "+num);
		break;
		default: System.out.println(num + " is Not allowed");
		}
		

	}

}
