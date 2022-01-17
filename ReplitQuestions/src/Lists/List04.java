package Lists;

import java.util.ArrayList;
import java.util.List;

public class List04 {
	/*
	 Write a program that deletes the letters 'a' from the names in the list given as input.

     INPUT : 
     list1={"Ali","Veli","Ayse","Fatma","Omer"}

     OUTPUT : 
     
     [Veli,Omer]
	 */

	public static void main(String[] args) {
		
		List<String> list1= new ArrayList<>();
		
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Ayse");
		list1.add("Fatma");
		list1.add("Omer");
		
		System.out.println(list1.get(3).contains("a")||list1.get(3).contains("a"));
		
	
		for(int i=0; i<list1.size(); i++)
		{

			if(list1.get(i).contains("a"))
			{  
				list1.remove(i);
			}
//			if(list1.get(i).contains("A"))
//			{  
//				list1.remove(i);
//			}
		}
		for(int i=0; i<list1.size(); i++)
		{

			if(list1.get(i).contains("A"))
			{  
				list1.remove(i);
			}
		}
		
		System.out.println(list1);
		

	}

}
