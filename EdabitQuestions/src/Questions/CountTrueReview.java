package Questions;

public class CountTrueReview {
	/*
	 
	 Create a function that count the true elements in the given array
	 Return 0 if given an empty array.
     All array items are of the type bool (true or false).
     if array is empty return 0
     
	 */

	public static void main(String[] args) {
		
		boolean arr[]= {false};
		
		System.out.println(countTrue(arr));
		
	}
	
	public static int countTrue(boolean []brr)
	{
		int counter=0;
		
		
		if(brr.length==0) {
			counter=0;
		}else
		{
			for(int i=0; i<brr.length; i++)
			{
				if(brr[i]==true)
				{
					counter++;
				}
			}
		}
		
		return counter;
		
	}

	
//	public static int countTrue(boolean []brr)
//	{
//		int counter=0;
//		return counter;
//	}
}
