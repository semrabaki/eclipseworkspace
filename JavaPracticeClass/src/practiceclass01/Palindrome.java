package practiceclass01;

public class Palindrome {

	/*
	 * Palindrome create a program checks if a string is palindrome or not
	 */

	public static void main(String[] args) {
		
	  String name="ibrahim";
		
		palindrome(name);
		
//		System.out.println(stb.equals(stb.reverse()));//true//object still the same 
//		
//		System.out.println(stb.toString().equalsIgnoreCase(stb.reverse().toString()));//false because this only checks the value
		
	}
	
	public static void palindrome(String stb)
	{
		
		String reversed="";
		for(int i=stb.length()-1; i>=0; i--)
		{
			reversed+=stb.charAt(i);
			//reversed+=name.substring(i,i+1); 
		}
		
		if(stb.equalsIgnoreCase(reversed))
		{
			System.out.println("This word is a palindrome");
		}
		else
		{
			System.out.println("This word is not a palindrome");
			
		}
	}
}
