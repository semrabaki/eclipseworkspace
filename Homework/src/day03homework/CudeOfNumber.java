package day03homework;

import java.util.Scanner;

public class CudeOfNumber {
	
	/*
	 Type a program which calculates the cube of a number which is entered 
     by user. 
     Hint 1: Cube of a number is a x a x a

	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter a  number: ");
		
		int number =scan.nextInt();
		
		System.out.println("The cube of the number entered : " + (number*number*number));
		
		scan.close();
		
		
	}

}
