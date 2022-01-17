package Collections;

import java.util.LinkedList;

public class GetMatchElement {

	public static void main(String[] args) {
		    LinkedList input1 = new LinkedList();
	        input1.add("One");
	        input1.add("Two");
	        input1.add("Three");
	        input1.add("Four");
	        input1.add("Five");
	        
	        LinkedList input2 = new LinkedList();
//	        input2.add("One");
//	        input2.add("Three");
//	        input2.add("Five");
	        System.out.println("The matched elements are : " + getMatchedElements(input1, input2));

	    }


	    public static LinkedList getMatchedElements(LinkedList input1, LinkedList input2) {
	    	
	    	LinkedList output = new LinkedList();
	    	
	    	if(input1.isEmpty()||input2.isEmpty())
	    		return null;
	    	else {
	    	
	    	for(int i=0; i<input1.size(); i++)
	    	{
	    		for(int j=0; j<input2.size(); j++)
	    		{
	    			if(input1.get(i).equals(input2.get(j)))
	    			{
	    			    output.add(input1.get(i));
	    			}
	    		}
	    	}
	    	
	    	return output;
	    	}
	    }

	}

