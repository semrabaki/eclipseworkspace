package reviewquestionspage901;

import java.util.Scanner;

public class deneme {

	public static void main(String[] args) {



		   Scanner scanner = new Scanner(System.in);

		        int N = scanner.nextInt();
		        
		        
		        if(N%2!=0)
		        {
		            System.out.println(" Weird");
		        }
		        else if(N==0)
		        {
		            if(N>=2&&N<=5)
		            {
		                System.out.println("Not Weird");
		            }else if (N>5&&N<21)
		            {
		                 System.out.println("Weird");
		            }else if(N>20)
		            {
		                 System.out.println("Not Weird");
		            }
		        }

		        scanner.close();
		    }
		

	}


