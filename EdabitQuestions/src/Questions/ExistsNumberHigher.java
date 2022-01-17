package Questions;

public class ExistsNumberHigher {

	public static void main(String[] args) {
		int arr[]= {5, 3, 15, 22, 4};
		
		System.out.println(existsHigher(arr, 4));

	}
	
	public static boolean existsHigher(int[] arr, int n) {
		int counter=0;
		for(int w: arr)
		{
			if(w>=n)
			{
				counter++;
			}
		}
		
		return counter==0 ? false : true;
		
	}
	}


