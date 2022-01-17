package day01;

import java.util.Scanner;

public class FindFactorial {
	/*
	 Find factorial of a given number in Java
	 */

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter a number...");
		int n=scan.nextInt();
		
		int f=1;
		
		for(int i=1; i<=n; i++)
		{
			f=f*i;
			
		}
		System.out.println("FActorial of given number: "+f);
		
		
	}

}
