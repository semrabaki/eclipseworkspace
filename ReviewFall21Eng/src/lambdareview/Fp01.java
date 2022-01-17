package lambdareview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp01 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        l.add(15);
        
        printElementsFuntional(l);
        System.out.println();
        printEvenElementFunctional(l);
        System.out.println();
        printSquareOfOddElements(l);
        System.out.println();
        printCubeOfDistinctElements(l);
        System.out.println();
        sumOfSquaresOfDistinctEvenElements(l);
        System.out.println();
        productOfCubesOfDistinctEvenElements(l);
        System.out.println();
        getMaxElement01(l);
        System.out.println();
        getMaxElement02(l);
        System.out.println();
        getMinElement01(l);
        System.out.println();
        getMinElement02(l);
        System.out.println();
        getMinGreaterThanSeven01(l);
        System.out.println();
        getMinGreaterThanSeven02(l);
        System.out.println();
//        getMinGreaterThanSeven03(l)
        
        //1)Create a method to print the list elements on the console in the same line with a space 
    	//  between two consecutive elements.(Functional)
        
        

	}
	



	




	//1)Create a method to print the list elements on the console in the same line with a space 
	//  between two consecutive elements.(Functional)
    
     public static void  printElementsFuntional(List<Integer>list)
     {
    	 list.stream().forEach(t->System.out.print(t+" "));
     }
     
     //2)Create a method to print the even list elements on the console in the same line with a space 
 	//  between two consecutive elements.(Functional)
     
     private static void printEvenElementFunctional(List<Integer>list) {
    	 
    	 list.stream().filter(t->t%2==0).forEach(t->System.out.print(t+" "));
 		
 		
 	}
     
   //3)Create a method to print the square of odd list elements on the console in the same line with a 
 	//  space between two consecutive elements.(Functional)

     private static void printSquareOfOddElements(List<Integer> list) {
 		
 		list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t->System.out.print(t+" "));
 	}
     
   //4)Create a method to print the cube of distinct(it means just use repeated elements once) odd list elements on the console in the same line 
 	//  with a space between two consecutive elements.
    
     private static void printCubeOfDistinctElements(List<Integer> list) {
 		
    	 list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t->System.out.print(t+" "));
    	 
 		
 	}
     
   //5)Create a method to calculate the sum of the squares of distinct even elements
     private static void sumOfSquaresOfDistinctEvenElements(List<Integer> list) {
    	 
    	 Integer sum=list.stream().distinct().filter(t->t%2==0).map(t-> t*t).reduce(0, (t,u)->t+u);
    	 System.out.println(sum);
			
			
		}
     
   //6)Create a method to calculate the product of the cubes of distinct even elements
     private static void productOfCubesOfDistinctEvenElements(List<Integer> list) {
 		
    	 Integer product= list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1, (t,u)->t*u);
    	 
    	 System.out.println(product);
 		
 	}
    // Create a method to find the maximum value from the list elements  
 	//1.way
     private static void getMaxElement01(List<Integer> list) {
 		
 		int maxElement=list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u)-> u);
 		System.out.println(maxElement);
 		
 
		
	}
     //2.way
     
 	private static void getMaxElement02(List<Integer> list) {
 		
 		int maxElement= list.stream().distinct().reduce(Integer.MIN_VALUE, (t,u)->t>u? t:u);
 		System.out.println(maxElement);
		
		
	}
 	
 	//Homework
 			//8)Create a method to find the minimum value from the list elements(In 2 ways)
 	//1.way
 	
 	private static void getMinElement01(List<Integer>list)
 	{
 		int minElement= list.stream().distinct().reduce(Integer.MAX_VALUE, (t,u)->t<u ? t:u);
 		System.out.println(minElement);
 	}
 	
 	private static void getMinElement02(List<Integer>list)
 	{
 		int minElement= list.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t,u)->u);
 		System.out.println(minElement);
 	}

 	//9)Create a method to find the minimum value which is greater than 7 and even from the list
 			//1.Way:

 	private static void getMinGreaterThanSeven01(List<Integer> list) {
		 
 		int minElement= list.stream().
 				             distinct().
 				             filter(t->t>7).
 				             filter(t->t%2==0).
 				             sorted(Comparator.reverseOrder()).
 				             reduce(Integer.MAX_VALUE,(t,u)->u);
 		System.out.println(minElement);
 		
 
		
	}
 	//2.way
 	private static void getMinGreaterThanSeven02(List<Integer> list) {
		 
 		int minElement= list.stream().
 				             distinct().
 				             filter(t->t>7).
 				             filter(t->t%2==0).
 				             reduce(Integer.MAX_VALUE,(t,u)->t<u?t:u);
 		System.out.println(minElement);
 		
 
		
	}

}
