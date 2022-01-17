package rqpage151;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); 
		list.add("hawk"); 
		list.add("robin"); 
		list.add("eagal");
		System.out.println(list);
		
		String arr[]=list.toArray(new String[0]);
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
