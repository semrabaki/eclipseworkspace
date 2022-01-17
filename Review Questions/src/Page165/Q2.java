package Page165;

import java.util.ArrayList;
import java.util.List;

public class Q2 {

	public static void main(String[] args) {
		
		List<String> list= new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add(2,"second");
		
		for(String s: list)
		System.out.println(s);
		
		
		

	}

}
