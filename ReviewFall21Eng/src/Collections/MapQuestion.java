package Collections;

import java.util.Arrays;
import java.util.HashMap;

public class MapQuestion {
/*
 /*Type code to find how many times a word is repeated ion a given String*/


	public static void main(String[] args) {

		
		String str="Nitelikli isletim nitelikli= isletim java is! easy but java is fun, ";
		
		str=str.toLowerCase();
		
		str=str.replaceAll("\\p{Punct}", "");
		
		System.out.println(str);
		
		String [] strArr= str.split(" ");

		System.out.println(Arrays.toString(strArr));
		
		HashMap<String, Integer> resultMap= new HashMap<>();
		
		for(String key: strArr)
		{
			if(resultMap.get(key)==null)
			{
				resultMap.put(key,1);
			}
			else
			{
				resultMap.put(key, resultMap.get(key)+1);
			}
		}
		
		System.out.println(resultMap);
	}



}
