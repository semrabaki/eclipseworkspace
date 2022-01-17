package Arrays;

public class Arrays01 {
	/*
	 Write a return method to reverse number.

    Input : 12345

    Output : 54321
	 */

	public static void main(String[] args) {
	
	 String number="12345";
	 
	 reverseNumber("12345");
		
		
	
	}
	
	public static void reverseNumber(String number)
	{
		int reversedNumber=0;
		String []arr= number.split("");
		
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]);
			
		}
		
	
	}

}
