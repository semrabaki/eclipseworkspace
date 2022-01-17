package practise6;

import java.util.*;

public class ReplaceListElements {

	public static void main(String[] args) {
		//replace the elements that has value 1 to 8
	      ArrayList<Integer> list = new ArrayList<Integer>();
	      list.add(1);
	      list.add(2);
	      list.add(7);
	      list.add(1);
	      list.add(3);
	      list.add(1);
	      
	      ///we have the list as first param, 
	      //then the element we want to change, then final element is the one we want to replace with
	      Collections.replaceAll(list, 1, 8);
	     
	      
	      

	}

}
