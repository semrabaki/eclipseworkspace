package day01;

public class reverseString {

	public static void main(String[] args) {
		 String str="Java is easy!";
		 System.out.println(str);
		 
		 String newStr="";
		 int idx=0;
		
		
		for(int i=str.length()-1; i>=0; i--)
			{  
			
			newStr=newStr+str.charAt(i);
			
		
			}
		
		System.out.println(newStr);

	}

}