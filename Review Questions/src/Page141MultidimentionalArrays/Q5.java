package Page141MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter long two sentences. Then type a program to count all “words” in the sentences. 
        For example; if user enters “Java is easy, if you study. Nothing is easy, if you do not study” output will be 14.
        Hint: Use split(
		 */
		
		Scanner scan= new Scanner(System.in);
		
		
		
		System.out.println("Enter a sentence");
		String str1= scan.nextLine();
		
		System.out.println("Enter a sentence");
		String str2= scan.nextLine();
		
		str1=str1.replaceAll("\\p{Punct}","");
		str2=str2.replaceAll("\\p{Punct}","");
		
		String []s1= str1.split(" "); 
		String []s2= str2.split(" ");
		
		System.out.println(Arrays.toString(s1));
		System.out.println(Arrays.toString(s2));
		
		System.out.println(s1.length+s2.length);
		
		

	}

}
