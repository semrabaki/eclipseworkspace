package Collections;

import java.util.LinkedList;
import java.util.List;

public class SublistReview {

	public static void main(String[] args){
	
		        LinkedList<String> input = new LinkedList<String>();
//		        input.add("Java");
//		        input.add("C++");
//		        input.add("C");
//		        input.add(".Net");
//		        input.add("Oracle");
		        System.out.println("Sublist is: " + getSubList(input, 0, 3));

		    }

	 public static List getSubList(List<String> input, int start, int end) {
		 
//		 if( start>end || start<0||end<0||input.equals(null)||start<end && input.equals(null))
//			 return null;
//		 else
//		 {
//		 
//		 return input.subList(start, end);
//		 }
		 
		   if( input.isEmpty() || start > end || start < 0 || end < 0 )
	             return null;
	         return input.subList(start, end);
		 
		 
	 
	 }
}

