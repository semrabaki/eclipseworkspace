package ReviewQuestionsPage87;

import java.util.Scanner;

public class ReviewQuestion02 {

	public static void main(String[] args) {
		//Ask user to enter his kid’s name, if the name contains “a” output will be “This name contains ‘a’.” 
		//if the name contains “z” output will be “This name contains ‘z’.” Otherwise, output will be 
		//“This name contains neither ‘a’ nor ‘z’.
		
        Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your kid`s name..");
		
		String kidName = scan.next();
		 int aLetterCount=0;
		 int zLetterCount=0;
		
		for(int i=0; i<kidName.length(); i++)
		{
			
			if(kidName.charAt(i)=='a')
			{
		       aLetterCount++;
			}
			else if (kidName.charAt(i)=='z')
			{
				zLetterCount++;
				
			}
			
			
		}

		if (aLetterCount!=0)
		{
			System.out.println("This name contains 'a'.");
		
		}
		if (zLetterCount!=0)
			{
				System.out.println("This name contains 'z'.");
			}
		if(zLetterCount==00 && aLetterCount == 0)
		{
			System.out.println("This name contains neither ‘a’ nor ‘z’");
		}
	}

}
