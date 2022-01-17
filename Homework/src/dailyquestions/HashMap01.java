package dailyquestions;
/*
 * 
 * 1. question
 / Create an empty hash map by declaring object of string and integer type
// Adding elements to the Map using standard add() method
// Print size and content of the Map
/ Printing elements in object of Map
// Checking if a key is present and if
// present, print value by passing // random element
// Printing value for the corresponding key
 * 
 * 2.question
 *  // initialize a HashMap
 // Add elements using put method
 // Iterate the map using for-each loop
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class HashMap01 {

	public static void main(String[] args) {
		
		
		HashMap<String,Integer> hm1= new HashMap<>();
		
		hm1.put("A", 100);
		hm1.put("B", 200);
		hm1.put("B", 300);
		hm1.put("D", 400);
		hm1.put(null, 500);
		hm1.put("E", 0 );
        
		//1.question
		System.out.println(hm1);//content of the Map Printing elements in object of Map
		System.out.println(hm1.size()); //printing size and elements
		
		System.out.println(hm1.getOrDefault("F",0));//If f is not exist it will return 0 as a default value
		
		System.out.println(hm1.getOrDefault("A", 0));
		
		
		System.out.println(hm1.get("B")); //Printing value for the corresponding key
		
		System.out.println(hm1.get("G"));//returns null since it is not exits
		
		Set<String> myKeys= hm1.keySet();//Prints the keys
		System.out.println(myKeys);
		
		Collection<Integer> myValues=hm1.values();//Prints the values
		System.out.println(myValues);
		
		
		//2.question
		
		//1.way
		Set<Entry<String, Integer>> setFromMap= hm1.entrySet();////If you want to convert Map to a Collection use entrySEt();
		
		for(Entry<String, Integer> w:setFromMap)
		{
		 System.out.println("Key: " +w.getKey()+ " Value: "+ w.getValue());
		}
		//2.way
		
		System.out.println("While loopp");
		Iterator iterator= hm1.entrySet().iterator();
		while(iterator.hasNext())
		{ 
			System.out.println(iterator.next()); 
			
			
		}
	
		
		
		

	}

}
