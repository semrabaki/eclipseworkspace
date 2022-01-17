package Lists;

import java.util.Arrays;

/*
Get a sentence from the user. Accept the sentence received from the user as a parameter, Invert sentence using Array and write a Method that returns the result as a String to the main method.

Note: Upper and lower case letters, spaces and special characters will not be changed.

Input :

It is very nice to write code.

Output :

.edoc etirw ot ecin yrev si tI
 */

public class List03 {

	public static void main(String[] args) {
		String str="It is very nice to write code.";
		
		System.out.println(Arrays.toString(reverse(str)));

	}
	
	public static String[] reverse(String str)
	{
		String [] arr= str.split("");
		System.out.println(Arrays.toString(arr));
		String []reversedArr= new String[arr.length];
		int idx=0;
		

		
		for(int i=arr.length-1; i>=0; i--)
		{
			reversedArr[idx]=arr[i];
			idx++;
		}
		return reversedArr;

}
}
