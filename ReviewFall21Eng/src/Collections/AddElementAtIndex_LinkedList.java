package Collections;

import java.util.LinkedList;

public class AddElementAtIndex_LinkedList {

	public static void main(String[] args){
		
		LinkedList<String> input = new LinkedList<String>();
        input.add("Java");
        input.add("C++");
        input.add("C");
        input.add(".Net");
        input.add("Oracle");
     
	
			System.out.println("The elements afetr inserted : " + addElementAtGivenIndex(input,"deneme ", 2));
		
		
		
	}
	public static LinkedList addElementAtGivenIndex(LinkedList<String> input, String elemet, int index) {
		
	 
	    	if(index<=input.size()&&index>=0)
			{
			input.add(index, elemet);
			return input;
			}
			return null;
		
		
		
		
		
		
	}
	

	
	}

