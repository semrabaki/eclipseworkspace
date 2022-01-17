package day01;

public class WhileLoop10 {
	/*
	 * Write a program to find the sum of natural numbers from1 to 1004
	 * output: sum of natural numbers 5050
	 */

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=0; i<101; i++)
		{
			sum+=i;
		}
		
		System.out.println("Sum of Natural Numbers: "+sum);

	}

}
