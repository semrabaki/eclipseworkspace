package rqpage151;

import java.util.Arrays;

public class ListQuestion02 {
	
	//Find the sum of the elements in the array { {1,2,3}, {4,5}, {6,7} } and return an array. 
	//For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13

	public static void main(String[] args) {
	
		int [][] arr= { {1,2,3}, {4,5}, {6,7} };
		
		int [] newArr= new int[arr.length];
		
		int sum;
		
		for(int i=0; i<arr.length; i++)
		{
			sum=0;
			for(int j=0; j<arr[i].length; j++)
			{
				
				sum=sum + arr[i][j];
			}
			
			newArr[i]=sum;
			
		}
		
		System.out.println(Arrays.toString(newArr));
		
		
		
		

	}

}
