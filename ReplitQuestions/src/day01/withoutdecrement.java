package day01;

public class withoutdecrement {
	
	/*
	 * Print even numbers from 20 to 0 but do not use decrement (i--).
OUTPUT : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0

	 */

	public static void main(String[] args) {
		
		int s=20;
	
		for(int i=0; i<21; i++)
		{
			if(i%2==0) {
				System.out.println(s-i);
			}
		}

	}

}
