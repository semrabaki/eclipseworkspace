package Questions;

import java.util.Arrays;

/*
 You hired three programmers and you (hopefully) pay them. Create a function
  that takes three numbers (the hourly wages of each programmer) 
 and returns the difference between the highest-paid programmer and the lowest-paid.
 */

public class ThreeProgrammersProblem {

	public static void main(String[] args) {
		
		
		System.out.println(programmers(98, 20, 30)) ;
		
		System.out.println(programmers1(98, 20, 30));
		

	}
	
	public static int programmers(int one, int two, int three) {
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		int temp=0;
		int [] arr= {one, two, three};
		
		for(int i=1; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		for(int w:arr)
		{
			if(w>max)
			{
				max=w;
			}
		}
		for(int w:arr)
		{
			if(w<min)
			{
				min=w;
			}
		}
		
		
		return max-min;
		
		
		
	  }
	
	public static int programmers1(int one, int two, int three) {
		int min=Math.min(one,Math.min(two, three));
		
		int max=Math.max(one, Math.max(three, two));
		
		
		return max-min;
		
	}
	
	}

