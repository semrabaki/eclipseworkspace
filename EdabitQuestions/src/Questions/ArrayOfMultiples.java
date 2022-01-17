package Questions;

import java.util.Arrays;

public class ArrayOfMultiples {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(arrayOfMultiples(3,5)));
		

	}
	
	public static int[] arrayOfMultiples(int num, int length) {
		
		int  arr1[]= new int [length];
		for(int i=0; i<length; i++)
		{
			arr1[i]=i*num;
	
		}
		return arr1;
		
	}

}
