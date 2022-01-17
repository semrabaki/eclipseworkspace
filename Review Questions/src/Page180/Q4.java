package Page180;

public class Q4 {

	public static void main(String[] args) {
		
		int total=0;
		StringBuilder letter= new StringBuilder("abcdefg");
		
		total+=letter.substring(1,2).length();//1
		
		total+=letter.substring(6,6).length();
		
		total+=letter.substring(6,5).length();
		
		System.out.println(total);

	}
	
	

}
