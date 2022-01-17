package Page141MultidimentionalArrays;

import java.util.Arrays;

public class Q32ndWay {

	public static void main(String[] args) {
	    int arr1[][] = { {1,2}, {3,4,5}, {6} };
	    int arr2[][] = { {7,8,9}, {10,11}, {12} };
	    int sumArr[] = new int[arr1.length];
	    
	    for (int i=0; i<arr1.length; i++){
	      int sum1 = 0;
	      for (int j=0; j<arr1[i].length; j++){
	        sum1 = sum1 + arr1[i][j];  
	      }
	      sumArr[i] = sum1;
	    }
	    
	    for (int i=0; i<arr2.length; i++){
	      int sum2 = 0;
	      for (int j=0; j<arr2[i].length; j++){
	        sum2 = sum2 + arr2[i][j];   
	      }
	      sumArr[i] = sumArr[i] + sum2;
	    }
	    
	    System.out.println(Arrays.toString(sumArr));
	}

}
