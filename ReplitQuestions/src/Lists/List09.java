package Lists;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class List09 {
	/*
	 Write a Java program to get a String from user as input and find the maximum occurring character in that string.(Ignore case sensitivity).

     Input : Learning java is easy

     Output: maximum occurring character is : a
	 */

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter a String...");
		
		String str= scan.nextLine();
		
		String [] arr= str.split("");
		
		HashMap<String, Integer> result= new HashMap<>();
		

		
		for(String w: arr)
		{
			if(result.get(w) == null)
			{
				result.put(w,1);
			}
			else
			{
				result.put(w, result.get(w)+1);
			}
		}
		System.out.println(result);
		int maxOccurance=0;
		String maxOccured="";
		
		for(Entry<String,Integer> w: result.entrySet())
		{
			if(w.getValue()>maxOccurance)		
			{
				maxOccurance= w.getValue();
				maxOccured=w.getKey();
				
			}
		}
		System.out.println("Max occured String : "+ maxOccured+ " occured "+ maxOccurance+" times");

		}
		

	}


