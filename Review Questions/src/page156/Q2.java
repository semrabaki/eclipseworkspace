package page156;

import java.util.ArrayList;

public class Q2 {
	
	//Create a list find the sum of all elements by using for-each loop 
	//and print the sum on the console

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		list.add(3);
		list.add(5);
		list.add(8);
		int sum=0;
		for(int w: list)
		{
			sum+=w;
		}
		System.out.println(sum);
		

	}

}
