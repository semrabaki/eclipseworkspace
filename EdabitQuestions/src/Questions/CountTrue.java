package Questions;



public class CountTrue {
	
	public static void main(String[] args) {
		
		boolean arr[]= {true, false, true, false,true};
		
		System.out.println(countTrue(arr));
	}
	
	public static int countTrue(boolean []brr) {
		int counter=0;
		if(brr.length==0)
		{
				   counter=0;
			   
		}
		else
		{
			for (int i=0; i<brr.length; i++)
		
			{
			   if(brr[i]==true)
			   {
				counter++;
		    	}
			}
		}
		return counter;

}

}
