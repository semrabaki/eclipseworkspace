package practise6;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedKeySetsOfMap {

	public static void main(String[] args) {
		/*
		 * "a"  "One"
		 * "b"  "Two"
		 * "d"  "Four"
		 * "c"  "Three
		 * Sort the elements using Map
		 */
		//1.way
//		TreeMap <String, String>sortedMap= new TreeMap<>();
//		
//		sortedMap.put("a", "One");
//		sortedMap.put("b", "Two");
//		sortedMap.put("d", "Four");
//		sortedMap.put("c", "Three");
		
		//.out.println(sortedMap);
		
		//2.way
		SortedMap map =(SortedMap) new TreeMap<>();
		map.put("a", "One");
		map.put("b", "Two");
		map.put("d", "Four");
		map.put("c", "Three");
		
		System.out.println(map);

	}

}
