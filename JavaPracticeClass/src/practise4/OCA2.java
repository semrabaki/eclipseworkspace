package practise4;

public class OCA2 {

	public static void main(String[] args) {
			int i = 10;
			int j = 20;
			
			int k = (j += i) / 5;
			
			//					10		 30	  6
			System.out.println(i + " : "+j +" : "+k);
			/*
			What is the result?
					A. 10 : 30 : 6
					B. 10 : 22 : 22
					C. 10 : 22 : 20
					D. 10 : 22 : 6
			*/

	}

}
