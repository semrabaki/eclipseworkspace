package day01;

import java.util.Scanner;

public class PerfectNumber01 {
	
	//Write java code checking the number is Perfect number or not.
		//Any number can be a Java Perfect Number if the sum of its positive divisors excluding the number itself is equal to that number.
		//Input :6 Output:6 is Perfect Number Input :7 Output:7 is not Perfect Number

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		
		int sum=0;
		
		System.out.println("Enter an integer...");
		int number=scan.nextInt();
		
		for(int i=1; i<number; i++)
		{
			if(number%i==0)
			{
				sum=sum+i;
			}
		}
		
		if(sum==number)
		{
			System.out.println(number+ " is a perfect number");
		}
		else
		{
			System.out.println(number+ " is not a perfect number");
		}

	}

}
