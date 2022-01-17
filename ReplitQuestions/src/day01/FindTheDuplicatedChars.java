package day01;

import java.util.Arrays;

public class FindTheDuplicatedChars {

	public static void main(String[] args) {

		String str= "Javaisalsoeasy";
		
		String[] arr2= new String [str.length()];
		
		
		String[] arr1= new String [str.length()];
		
		arr1=str.split("");
		
		System.out.println(Arrays.toString(arr1));
		
		for(int i=0; i< arr1.length; i++)
		{
			if(arr1[i].indexOf(i)==arr1[i].lastIndexOf(i))
			{
				System.out.println(arr1[i]);
				//arr2[i]=arr1[i];
				
	
				
			}
		}
		
		//System.out.println(Arrays.toString(arr2));
	}

}
