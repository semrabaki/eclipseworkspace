package Lists;
/*
 Write a java program which accept a sentence as parameter,
  than reverses sentence by using StringBuilder and checks 
  if sentence is palindrome or not (without case sensitivity).Use StringBuilder.

Input :

I love Java.

Output:

Reversed sentence : avaJ evol I. It is not a palindrome"
 */

public class List08 {

	public static void main(String[] args) {
	
		System.out.println(isPalindrome2("java"));

	}
	
//	public static String isPalindrome(String s)
//	{
//		String reversedString="";
//		
//		for(int i=s.length()-1; i>=0; i--)
//		{
//		   reversedString= reversedString+ s.charAt(i);
//		}
//		return reversedString;
//	}
	
	public static StringBuilder isPalindrome2(String s)
	{
		StringBuilder reversedS=s.reverse();
		
		return s.equals(reversedS)? (reversedS+ "sentence is palindrome"):(reversedS+ "sentence is not palindrome");
	}
}
