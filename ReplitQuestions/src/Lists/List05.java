package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 Write a program that accepts an integer as input and prints first 10 prime 
 numbers greater than input Check numbers if they are even or not in a return method.

Input : 5

Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
 */

public class List05 {

	public static void main(String[] args) {
		int n=7;
		//int counter=0;
		//List<Integer> list1= new ArrayList<>();
		
		int []arr= new int [10];
		
		int flag=0;
		int counter=0;
		

		
	
		for(int idx=0; idx<=20; idx++)
		{  
		
			
			for( int i=2; i<n; i++)
			{
				if(n%i==0)
				{   
					flag=1;
					break;
					
				}
			}
			
			if(flag==0)
			{   System.out.println(n);
			
			    arr[counter]=n;
//				list1.add(idx, n);;
				counter++;
				//System.out.println("idx "+idx);
			}
			n=n+2;
			flag=0;
			
			if(counter==10)
				break;
		
			
			
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		

	}

}
