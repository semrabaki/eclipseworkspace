package Page141MultidimentionalArrays;

import java.util.Arrays;

public class Q6 {
	
	 //Write a Java program to remove a specific element from an array.


	public static void main(String[] args) {
		
		
		int arr[]= {1,2,5,4,5,6,7};
		
				
		int counter=0;
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i]==5)
			{
				counter++;
			}
		}
		int newArr[]= new int[arr.length-counter];
		
		int idx=0;
		
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i]==5)
			{
				continue;
			
			}
			else
			{
				newArr[idx]=arr[i];
				idx++;
			}
		}
		
		System.out.println("New array:" + Arrays.toString(newArr));
		
		

	}

}
