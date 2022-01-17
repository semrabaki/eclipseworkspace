package day01;

import java.util.Scanner;

public class ORtakBolen {
	

/*
 * . Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
Input :
30 and 40
Expected OutPut:
GCD for 30 and 40 = 10
LCM for 30 and 40 = 120
 */

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2= scan.nextInt();
		
		int gcd=1;
		
		for(int i=1; i<=num1&&i<=num2; i++)
		{
			gcd=i;
}
		
		System.out.println(gcd);
	
		System.out.println(num1*num2/gcd);

	}

}
