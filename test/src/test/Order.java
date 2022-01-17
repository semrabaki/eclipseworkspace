package test;

public class Order {
	
	int a;

    String b = "Good";



   Order(int a, String b) { 

          System.out.println("Constructor 1");

    }

   Order(String b, int a) { 

          System.out.println("Constructor 2");

    }

   Order() {

         System.out.println("Constructor 3");

   }

	   public static void main(String[] args) { 

		   Order or = new Order("Bad", 3);
	   }

	}


