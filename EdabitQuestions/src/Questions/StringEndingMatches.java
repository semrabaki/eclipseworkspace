package Questions;
/*

 */
public class StringEndingMatches {

	public static void main(String[] args) {
		
		System.out.println(checkEnding("semra", "mra"));
		
	}
	
	public static boolean checkEnding(String str1, String str2) {
		
		
		
		return str1.endsWith(str2)? true: false;
	    
	  }

}
