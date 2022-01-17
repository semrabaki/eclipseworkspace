package Page141MultidimentionalArrays;

import java.util.Arrays;

public class Q3review {

	public static void main(String[] args) {
		int arr1[][] = { {1,2}, {3,4,5}, {6} };
		int arr2[][] = { {7,8,9}, {10,11}, {12} };
		
		
		
		int sum = 0;
		
		for (int []w : arr1) {
			sum = sum +w.length;
		}
		
		int arr5[]= new int[sum];
		int arr6[]= new int[sum];
		int arr77[]= new int[sum];
		
		int idx = 0;
		int idx2 = 0;
		
		for(int[]num : arr1) {
			for(int x : num) {
			 arr5[idx] = x;
			 idx++;
			}
		}
		
		
		for(int[]num2 : arr2) {
			for(int x2 : num2) {
				arr6[idx2] = x2;
				 idx2++;
			}
		}
	
	
		for(int id7=0; id7<arr6.length;id7++) {
			arr77[id7] = arr5[id7] + arr6[id7];
			
		}
		
		System.out.println(Arrays.toString(arr77));
	

}
}

