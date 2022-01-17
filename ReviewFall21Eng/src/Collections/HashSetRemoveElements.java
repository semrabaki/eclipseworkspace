package Collections;

import java.util.HashSet;

public class HashSetRemoveElements {

	public static void main(String[] args) {
		 HashSet input1 = new HashSet();
	        input1.add(1);
	        input1.add(2);
	        input1.add(3);
	        input1.add(4);
	        input1.add(5);
	        HashSet input2 = new HashSet();
//	        input2.add(0);
//	        input2.add(15);
//	        input2.add(8);
	       
	        System.out.println("Are removed elements: " + areRemoved(input1, input2));
	}
	public static Boolean areRemoved(HashSet input1, HashSet input2) {
		int flag=0;
		for(Object w: input1 )
		{
			for(Object x: input2)
			{
				if(x==w)
				{ flag=1;
				break;
				}
			}
			
		}
		
		if(input1.isEmpty()|| input2.isEmpty()||flag==0)
			return false;
		else
	
			return true;
		
			
		
		
	
	
	}

}
