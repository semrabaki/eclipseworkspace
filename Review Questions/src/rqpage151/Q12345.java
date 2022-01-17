package rqpage151;

import java.util.ArrayList;
import java.util.List;

public class Q12345 {
	
	//Create a String list whose elements are A, C, E, and F. Print it on the console.

	public static void main(String[] args) {
		
		List<String>list= new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("F");
		
		System.out.println(list);
		
		list.add(1, "B");
		System.out.println(list);
		
		list.set(3, "D");
		System.out.println(list);
		
		list.remove("F");
		System.out.println(list);
		
		System.out.println(list.size());
		
		
		
		
		
		

	}

}
