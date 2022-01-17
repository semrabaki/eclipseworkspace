package deneme;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerDeneme {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter first number");
        double num1= scan.nextDouble();
        
        System.out.println("Enter second number");
        double num2= scan.nextDouble();
        
        System.out.println("The sum of two numbers is " + (num1+num2));
	}

	private static Scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

}
