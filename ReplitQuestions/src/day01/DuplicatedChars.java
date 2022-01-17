package day01;

import java.util.Arrays;
/*Write a code that returns the duplicate chars in a String array.(interview Question)
Input :
String str=“Javaisalsoeasy”
*///Output: [a, s]

public class DuplicatedChars {
	
	//Write a code that returns repeated character in string array

	public static void main(String[] args) {
		
		String str= "Javaisalsoeasy";
		
		String newStr="";
	
		
	
		
		for(int i=0; i< str.length(); i++)
		{
			if(str.indexOf(str.charAt(i))!= str.lastIndexOf(str.charAt(i)))
			{
				if(!newStr.contains(str.substring(i,i+1)))
				{
					newStr=newStr+str.charAt(i);
				
				}
	
				
			}
		}
		
		String[] sArr= newStr.split("");
		
		System.out.println(Arrays.toString(sArr));
		
		
	
	}

}
