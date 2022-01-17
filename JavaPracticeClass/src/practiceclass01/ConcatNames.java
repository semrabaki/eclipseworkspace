package practiceclass01;

public class ConcatNames {

	public static void main(String[] args) {
		
		getWord("ra", "sem");
		

	}
	
    public static String getWord(String left, String right) {
    	
    	String wholeWord= ""+right+left;
    	wholeWord= wholeWord.substring(0, 1).toUpperCase()+ wholeWord.substring(1);
    	System.out.println(wholeWord);
    	return wholeWord;
		
	}

}
