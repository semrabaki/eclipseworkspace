package practiceclass01;

public class FibonacciSequence {
	
	 /*
    Type a program that will print all Fibonacci Sequence on the console
    0, 1, 1, 2, 3, 5, 8 etc.. create a number to indicate how many times you need to run
     */
	

	public static void main(String[] args) {
		
		
		int n=10;
		int firstTerm=0;
		int secondTerm=1;
		
		
		for(int i=0; i<=n; i++)
		{
			System.out.print(firstTerm+ ", ");
			
			int temp= firstTerm+secondTerm;
			
			firstTerm=secondTerm;
			
			secondTerm=temp;
			
			
			
			
			
			
			
		}

	}

}
