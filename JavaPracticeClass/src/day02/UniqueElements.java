package day02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UniqueElements {

	public static void main(String[] args) {
		
		/*
		 create a list by getting the list elements from user
		 if there is duplicated elements remove them from the list
		 ask user to stop if they are done with words as
		 Enter list elements, to stop enrtance press
		 */
		
		Scanner scan= new Scanner(System.in);
		
		List<String>list1= new ArrayList<>();
		
		String s="";
		
		while(!s.equals("*")) {
			
			
			System.out.println("Enter list elements, to stop enrtance press");
			s=scan.next();
			if(!s.equals("*"))
			{
					list1.add(s);		
			}
			
		}
		
		System.out.println(list1);
		
		Set<String>uniqueElements=new HashSet<>(list1);
		System.out.println(uniqueElements);
		
		
		

	}

}
 