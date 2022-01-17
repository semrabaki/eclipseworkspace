package Page141MultidimentionalArrays;

public class Q1MultiDimensionalArrays {

	public static void main(String[] args) {
		// Find the sum of all elements in the multi dimensional array { {1,2,3}, {4,5,6} }
			
			int arr[][]={ {1,2,3}, {4,5,6} };
			int sum=0;
			
			for(int[]w:arr)
			{
				for(int x:w)
				{
					sum+=x;
				}
			}
			
			System.out.println("Sum of the elements: "+ sum);

		}

}
