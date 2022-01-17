package Questions;

import java.util.Arrays;

/*
 Create a function that takes an array of numbers and return "Boom!" 
 if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".
 */

public class SevenBoomArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,7,3,4,5,6,8,9,7};
		
		System.out.println(sevenBoom2(arr));

	}
	
	public static String sevenBoom(int[]arr)
	{
		for (int i = 0; i < arr.length; i++) {
            while (arr[i] != 0) {
                if (arr[i] % 10 == 7) return "Boom!";
                arr[i] /= 10;
            }
        }
        return "there is no 7 in the array";
	}
	
	public static String sevenBoom1(int []arr)
	{
		return Arrays.toString(arr).contains("7") ? "Boom!" : " there is no 7 in the array";
	}
	
	public static String sevenBoom2(int []arr)
	{
		String str=Arrays.toString(arr);
		if(str.contains("7"))
		{
			return "Boom";
		}else
		{
			return "there is no 7 in the array";
		}
		
	}
}
