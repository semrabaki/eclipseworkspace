package page156;

public class Q1 {
	
	//Create an integer array find the sum of all elements by using for-each loop 
	//and print the sum on the console

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		
		int sum=0;
		
		for(int w: arr)
		{
			sum+=w;
		}
		System.out.println(sum);


	}

}
