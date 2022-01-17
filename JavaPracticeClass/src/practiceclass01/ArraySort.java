package practiceclass01;

import java.util.Arrays;

public class ArraySort {
	
	//Please sort the elements in ascending order
		//int [] array= { 1,24,890,342,123,543,54,3,2};
		
		

	public static void main(String[] args) {
		
		int [] array= { 1,24,890,342,123,543,54,3,2};
		
		int temp=0;
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i]>=array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(array));
	}
	
	

}
