package day03homework;

import java.util.Scanner;

public class ConvertMileToKm {

	
	/*
	 * Type a program which converts the mile to kilometer. Mile value will be 
       entered by user. (Use double) 
       Hint 1: km = mile x 1.6 
       Hint 2: To get double, use nextDouble()
	 */
	public static void main(String[] args) {
		
        Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter a  number: ");
		
		double number =scan.nextDouble();
		
		System.out.println( number + " mile is " + (number*1.6) + "km." );
		
		scan.close();
		

	}

}
