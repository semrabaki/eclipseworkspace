package Page141MultidimentionalArrays;

import java.util.Arrays;

public class Q4 {
	
	//) Find the sum of the elements in the array elements of the given multi dimensional array 
	//{ {1,2,3}, {4,5}, {6,7} } and return an array. 
	//		For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}

	public static void main(String[] args) {
		
		int arr1[][]={ {1,2,3}, {4,5}, {6,7}, {4,5}};
		
		int counter=0;
		
		for(int []w:arr1)
		{
			counter++;
		}
		System.out.println(counter);
		System.out.println(arr1.length);
		int [] arr2= new int[ counter];
		
		int newElement=0;
		
		for(int i=0; i<arr1.length;i++)
		{
			for(int j=0; j<arr1[i].length; j++ )
			{
				newElement+= arr1[i][j];
				
				arr2[i]=newElement;
			}
		}
		
		System.out.println(Arrays.toString(arr2));
		
		

	}

}
