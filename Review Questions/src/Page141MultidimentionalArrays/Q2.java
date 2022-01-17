package Page141MultidimentionalArrays;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		
	//	Find the product of the last elements in the array elements of the 
	//	given multi dimensional array { {1,2,3}, {4,5}, {6} }
		
		
		int arr1[][]={ {1,2,3}, {4,5}, {8,10} };
		
		int sum=0;
		
		for(int []w:arr1)
		{
			sum=sum+w.length;
		}
		System.out.println(sum);
		
		int[] arr2= new int[sum];
		int idx=0;
		
		for(int []w:arr1)
		{
			for(int x:w)
			{
				arr2[idx]=x;
				idx++;
			}
		}
		System.out.println(Arrays.toString(arr2));
		
		int product=1;
		
		
			product= arr2[idx-1]*arr2[idx-2];
			
			System.out.println(product);
			


	}

}
