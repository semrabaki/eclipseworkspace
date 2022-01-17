package test;

import java.util.Scanner;

public class deneme01 {

	public static void main(String[] args) {
		 int seconds=0;
		 String hour="";
		   Scanner scan=new Scanner(System.in);
		   String num=scan.nextLine();
		   
		  num= num.replaceAll("\\D"," ");
		   System.out.println(num);
		   for(int i=0; i<num.length(); i++)
		   {
			   if(!num.substring(i).equals(" "))
			   {
				   hour= num.substring(i,i+1);
			   }
		   }
		   
		   System.out.println(hour);
		   
		   


		  
		    
		//System.out.println(hour+ " saat "+ min+" dakika "+ num+ " saniye " );

	}

}
