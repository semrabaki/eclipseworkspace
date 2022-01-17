package Page141MultidimentionalArrays;

import java.util.Arrays;

public class Q3 {
	
	/*
	 * ) Find the sum of the elements whose indexes are same in the given two multi dimensional arrays 
         arr1 = { {1,2}, {3,4,5}, {6} } and arr2 = { {7,8,9}, {10,11}, {12} }
	 */

	public static void main(String[] args) {
		
		int arr1 [][]= { {1,2}, {3,4,5}, {6} };
		
		int arr2 [][]=  { {7,8,9}, {10,11}, {12} };
		
		int newArr1[]= new int [arr1.length];
		int newArr2[]= new int [arr2.length];
		
		int sum;
		
	    for(int i=0; i<arr1.length; i++)
	    {
	    	sum=0;
	    	for(int j=0; j<arr1[i].length; j++)
	    	{   
	    		sum=sum+arr1[i][j];
	    		
	    	}
	    	
	    	newArr1[i]=sum;
	    }
	    
	    System.out.println(Arrays.toString(newArr1));
	    
	    for(int i=0; i<arr2.length; i++)
	    {
	    	sum=0;
	    	for(int j=0; j<arr2[i].length; j++)
	    	{
	    		sum=sum+arr2[i][j];
	    	}
	    	
	    	newArr2[i]=sum;
	    }
	    System.out.println(Arrays.toString(newArr2));
	    
	    int [] sumArr= new int [newArr1.length];
	    
	    for(int i=0; i<newArr1.length; i++)
	    {
	    	sumArr[i]= newArr1[i]+newArr2[i];
	    }
		
		
		System.out.println("Summed Array: "+ Arrays.toString(sumArr));
		
		
	}

}
