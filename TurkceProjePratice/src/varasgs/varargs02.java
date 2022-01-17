package varasgs;

import java.util.ArrayList;
import java.util.Arrays;

public class varargs02 {

	public static void main(String[] args) {
		//verilen inslerden ilki haric tum sayilari toplayan 
		//buldugunuz toplam ile ilk sayiyi carpan sonucu yazdiriniz
		
		//Integer[] num1= {2,3,4,5,6,78,8,9,85,12,4,5};
		
		topla(2, 3,4,5,6,78,8,9);
		topla(2,3,4,5,6,78,8,9,85,12,4,5); // (varargs lara array parametre olarak verilebilir)
		
		topla(num1);
		

	}
	
	

	public static void topla(int numToMultiply, int ...numToSum)
	{
		int sum=0;
		
		for( int w: numToSum)
		{
			sum+=w;
		}
		System.out.println("result: "+numToMultiply*sum);
	}

}
