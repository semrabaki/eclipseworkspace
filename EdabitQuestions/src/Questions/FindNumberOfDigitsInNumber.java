package Questions;
/*
 Create a function that will return an integer number corresponding to the amount of digits in the given integer num.
 */

public class FindNumberOfDigitsInNumber {

	public static void main(String[] args) {
		
		int number=123456;
		
     System.out.println("The given number has total "+NumberOfDigits(number)+" digits.");
	}
	
	public static int NumberOfDigits(int num)
	{   
		
		int digitNumber=0;
	
		while(num>0)
		{
			num=num/10;
			digitNumber++;
		}
	    
	
		return digitNumber;
	}

}
