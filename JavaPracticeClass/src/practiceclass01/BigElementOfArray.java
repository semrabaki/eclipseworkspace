package practiceclass01;

import java.util.Arrays;

public class BigElementOfArray {
	
	//Please find the biggest element in the array
	//int [] array= { 1,24,890,342,123,543,54,3,2};
	
	//sort the array elements

	public static void main(String[] args) {
		
		int [] array= { 1,24,890,342,123,543,54,3,2};
		
		//1.way
//		Arrays.sort(array);
//		System.out.println(array.length-1);
		
		//2.way
		int min= Integer.MIN_VALUE;   //an other way is assigning the first value with the same logic
		//int min= array[0];
		
		for(int i=0; i<array.length; i++)
		{
			if (array[i]>min)
			{
				min=array[i];
			}
		}
		
		System.out.println("Maximum value of the array:"+min);
		
	
		
		

	}

}
