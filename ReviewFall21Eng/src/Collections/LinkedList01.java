package Collections;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[]args)
	{
	
		LinkedList <String>ll1= new LinkedList<>();
		
		ll1.add("Ali");//listin son noduna verilen string i ekliyor
		ll1.add("Can");
		ll1.add("Asim");
		ll1.add("Hatice");
		ll1.add("Semra");
		
      LinkedList <String>ll2= new LinkedList<>();
		
		ll2.add("Ali");//listin son noduna verilen string i ekliyor
		ll2.add("Can");
		ll2.add("Asim");
		
		System.out.println(ll1);
		
		ll1.add(3, "Mark");
		
		System.out.println(ll1);
		
	ll1.addAll(ll2);
	System.out.println(ll1);
	
	ll1.addFirst("Java");
	
	System.out.println(ll1);
	

	System.out.println(ll1.remove());
	
	System.out.println(ll1);
	
	ll1.remove(2);
	System.out.println(ll1);
	
	ll1.remove("Semra");
	System.out.println(ll1);
	
	//ll1.remove(30);
	
	System.out.println(ll1.element());
	
	System.out.println(ll1.peek());
	
	System.out.println(ll1.poll());
	System.out.println(ll1);
	
	System.out.println(ll1.subList(2, 5));
		
		
		
		
		
	


	
	}
		

}
