package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class List01 {
	
	/*
	 Write a Java program to get a String from user as input and find the maximum
	 occurring character in that string. (Ignore case sensitivity) input :
	 Learning java is easyoutput:maximum occurring character is : a
	 */

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter a sTring");

	    String str= scan.nextLine();

        String[] arr= new String[str.length()];
        
        
        arr=str.split("");
        System.out.println(Arrays.toString(arr));
   
        int currentCount=1;
        int maxCounter = 0;
        //int min=Integer.MIN_VALUE;
        
  
        String moxOccurance="";
        for(int i=0; i<str.length(); i++)
        {
        	
        	for(int j=i+1; j<str.length(); j++)
        	{
        		if((arr[i].equalsIgnoreCase(arr[j])))// counts repeated characters
        		{
        			currentCount++;
        		} 
        		
        			
        		}
        	if(currentCount>=maxCounter)
    		{
    			maxCounter=currentCount;
    			moxOccurance += "," +arr[i];
        		
      }
        	
        	
       
        	currentCount=0;
 
        	
        }
 
  
      System.out.println(moxOccurance);  
       
	 

	}

}
