package day01;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods01 {
	
	/*
	 * Ask user to their weight and height and type a program with calculates mass index
		HINT : Body Mass Index = Weight (kg) / Square of height (m)
		Then give a message to user as following:
		If BMI is less than 18.5 , you re weak If BMI is between 18.5 and 25 , your weight is ideal If BMI is between 25 and 30, you re fat If BMI is more than or equal to 30, obese
		EXAMPLE :
		INPUT:
		Weight : 71
		Height : 1,72
		OUTPUT :
		Your BMI is : 23.99945916711736 Your weight is ideal (edited) 
	 */

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter weight and height");
		double weight= scan.nextDouble();
		double height = scan.nextDouble();
		
		double bmi=weight/(height*weight);
		System.out.println("BMI result: " +bmi);
		
		if(bmi<18.5)
		{
			System.out.println("You are week");
			
			
		}else if(bmi<25)
		{
			System.out.println("your weight is ideal!");
		}
		else if(bmi<30)
		{
			System.out.println("you are fat!");
			
		}else
		{
			System.out.println("You are obese!!");
		}
		
		
		
		
		
		
		

	}

}
