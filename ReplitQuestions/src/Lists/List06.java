package Lists;

import java.util.ArrayList;
import java.util.List;

/*
 Write a program to find the common elements between two String Arrays (without case sensitivity)

Input1 : {John,Brad,Ange,Sofia,Emily}

Input2 : {sofia,brad,grace,emily,hazel}

Output : [sofia,brad,emily]
 */

public class List06 {

	public static void main(String[] args) {

		
		String[]arr2=  {"John","Brad","Ange","Sofia","Emily"};
		
		String[]arr1= {"sofia","brad","grace","emily","hazel"};
		
		List <String> list1= new ArrayList<>();
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr1.length; j++)
			{
				if(arr2[i].equalsIgnoreCase(arr1[j]))
				{
					list1.add(arr1[j]);
				}
			}
		}
		
		System.out.println(list1);
		
		
		
		

	}

}
