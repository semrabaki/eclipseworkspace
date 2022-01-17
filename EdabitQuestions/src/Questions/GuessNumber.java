package Questions;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		
		int randomNumber= (int) (Math.random()*100)+1;
		
		boolean hasWon=false;
		System.out.println("Try to gueess the number between 1 to 100");
		
		for(int i=10; i>0; i--)
		{
			System.out.println("You have " +i+ "guesses left. Choose again");
			int guess=scan.nextInt();
			if(randomNumber<guess)
			{
				System.out.println(" it is smaller than" + guess);
			}
			if(randomNumber>guess)
			{
				System.out.println(" it is bigger than" + guess);
			}
			if(randomNumber==guess)
			{
				hasWon=true;
				break;
			}
			
		}
		
		if(hasWon)
		{
			System.out.println("Correct... you Win");
		}
		else {
			System.out.println("Game over ....you loosee");
			System.out.println("The number was:"+randomNumber);
		}
		
		

	}

}
