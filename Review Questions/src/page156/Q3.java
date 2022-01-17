package page156;

public class Q3 {
	
	//Write a Java program to find the common elements between two 
	//arrays (string values).


	public static void main(String[] args) {
	
		String[] s1= {"a","b","c","d"};
		
		String []s2= {"z","b","s","d","e"};
		
		for(String w: s1)
		{
			for(String x: s2)
			{
				if(x.equals(w))
				{
					System.out.println(x);
				}
				
			}
		}

	}

}
