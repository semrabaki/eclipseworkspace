package practiceclass01;

import java.util.Arrays;

public class ReviewArraySort {

	public static void main(String[] args) {
		
		int []arr= {2,5,1,7,0,64,5,1};
		int temp=0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
			}
		}
		
		
		
		System.out.println(Arrays.toString(arr));

	}

}
