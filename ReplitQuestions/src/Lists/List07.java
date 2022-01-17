package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 write a Java program to removes a specific element from an array
  and put the remaining elements in a new array and prints the new array

Input :{1,2,3,4,5,6}

element:6

Output : [1,2,3,4,5]
 */

public class List07 {

	public static void main(String[] args) {
		
		
		int [] arr={1,2,3,4,5,6};
		int [] arr1= new int[arr.length-1];
		
		int idx=0;
		
		for( int i=0; i<arr.length; i++)
		{
			if(arr[i]!=arr[5])
			{
				arr1[idx]=arr[i];
				idx++;
			}
				
			
		}
		
		System.out.println(Arrays.toString(arr1));
			
		
		
		
		
	
		
		

	}

}
