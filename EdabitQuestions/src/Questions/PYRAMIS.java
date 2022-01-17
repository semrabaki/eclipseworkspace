package Questions;

import java.util.Scanner;

public class PYRAMIS {

	public static void main(String[] args) {
	
		int h=5;
		
		for(int r=1; r<=h; r++)
		{
			for(int x=1; x<=h-r; x++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=2*r-1; j++)
			{
			System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		
		System.out.println("============================================================");
				
	    for(int i=0; i<5; i++)
	    {
	    	for(int j=0; j<(5-i)-1; j++)
	    	{
	    		System.out.print(" ");
	    	}
	    	for(int k=0; k<=i; k++)
	    	{
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
		
	    System.out.println("============================================================");
	    int num =5;
	    for(int i=1; i<=num; i++)
	    {
	    	for(int j=0; j<num-i; j++)
	    	{
	    		System.out.print(" ");
	    	}
	    	for(int k=0; k<2*i-1; k++)
	    	{
	    		System.out.print("*");
	    		
	    	}
	    	System.out.println();
	    	
	    }
	

	}

}
