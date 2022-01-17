package practiceclass01;

import java.util.Arrays;

public class Digits {

	
	//Write a Java program to break an integer into a sequence of individual digits.
	//Hint use/ and%
	// input 12345
	//output: 1
	/*          2
	          3
	          4
              5*/
	          
	public static void main(String[] args) {
		
		int input=12345;
		
		//int digits=0;
		
		
		//int idx=5;
		
//		do
//		{
//			
//			digits=input%10;
//			
//			
//			
//			input=input/10;
//			System.out.println(digits);
//			
//		}while(input>0);
		
	 int firstDigit= input%10;
	 int secondDigit= (input/10)%10;
	 int thirdDigit= (input/100)%10;
	 int forthDigit=(input/1000)%10;
	 int fifthDigit=(input/10000);
	 
	 System.out.print(fifthDigit+"\n"+forthDigit+"\n"+thirdDigit+"\n"+secondDigit+"\n"+firstDigit+"\n");

	}
	
	

}
