package practiceclass01;

import java.util.Arrays;

public class SwapNameAndLastNAme {

	public static void main(String[] args) {
		String s="Donald Trump";
		System.out.println(nameShuffle(s));
		
	    
}
	public static String nameShuffle(String s) {
	        String[] sArr= s.split(" ");
			
			return sArr[1]+ sArr[0];
				
	}
}

