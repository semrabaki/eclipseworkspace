package Collections;

import java.util.LinkedList;
import java.util.List;

public class GetSubList {

	public static void main(String[] args)throws NotGoodException {
		 LinkedList<String> input = new LinkedList<String>();
//	        input.add("Java");
//	        input.add("C++");
//	        input.add("C");
//	        input.add(".Net");
//	        input.add("Oracle");
	        System.out.println("Sublist is: " + getSubList(input, 3, 0));

	    }


	    public static List getSubList(List<String> input, int start, int end)throws NotGoodException {

	    
	    if(start>end||start<0||end<0|| input.equals(null))
	    {
	    	throw new NotGoodException("null");
	    }
	    return input.subList(start, end);
	    		
	  
	    }
	    
	    static class NotGoodException extends Exception{
	    	public NotGoodException(String message) {
				super(message);
			}
	    }
	    
	    
	    
}
