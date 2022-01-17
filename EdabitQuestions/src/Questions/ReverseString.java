package Questions;

public class ReverseString {

	public static void main(String[] args) {
		String st= "Semra";
		String s="";
		
		for( int i=st.length()-1;i>=0; i--)
		{
		
			s=s+st.charAt(i);
		}

		System.out.println(s);
		
		
		StringBuilder str= new StringBuilder();
		str.append(st);
		str.reverse();
		
		System.out.println(str);
	}

}
