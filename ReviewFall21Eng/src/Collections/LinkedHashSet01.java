package Collections;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSet01 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet(); // LINE A
        
		lhs.add("Anderson");
        lhs.add("Bharath");
        lhs.add("Cruse"); 
        lhs.add("Dinesh");

        System.out.println("Eements retrieved in the order they were inserted : ");
        System.out.println(lhs);
        lhs.remove("Bharath");
        lhs.add("Bhuwaneshwar"); 
        System.out.println("Set after removing Bharath and adding Bhuwaneshwar : ");
        System.out.println(lhs);
        
        Object[] names = lhs.toArray();
        
        System.out.println("Displaying elements in array format : "); // LINE D
        for (Object name : names)
        {
            System.out.print(name + ", ");
        }
        System.out.println();
        
        lhs.clear(); // LINE E
        System.out.println("Displaying empty set : ");
        System.out.println(lhs);
        
        
        //Now create a LinkedHasSet of Integers and add numbers form 1 to 5
        
        LinkedHashSet <Integer> lhs1= new LinkedHashSet<>();
        
        lhs1.add(1);
        lhs1.add(2);
        lhs1.add(3); 
        lhs1.add(4);
        lhs1.add(5);
        LinkedHashSet lhs2=(LinkedHashSet) lhs1.clone();
        System.out.println(lhs2);
        
        lhs2.remove(4);
        System.out.println(lhs2);
        System.out.println(lhs1);
       // System.out.println(lhs1.contains("Bharath"));
        
        System.out.println(lhs1.retainAll(lhs2));
        lhs1.retainAll(lhs2);
	}

}
