package day03homework;

import java.util.Scanner;

public class TrianleArea {
	
	/*
	 *  Type a program which calculates the perimeter of a triangle whose 
        Side lengths are entered by user. (Use byte) 
        Hint 1: Perimeter of a triangle is a + b + c 
        Hint 4: To get byte, use nextByte()
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter three sides of the triagle: ");
		byte a = scan.nextByte();
		byte b = scan.nextByte();
		byte c = scan.nextByte();
		
		System.out.println("The premiter of the triagnle: " + (a+b+c));
	}

}
