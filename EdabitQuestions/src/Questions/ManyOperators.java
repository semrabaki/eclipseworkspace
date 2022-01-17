package Questions;

public class ManyOperators {
	
	

	public static void main(String[] args) {
		
		System.out.println(operate(3,0,"/"));

	}

	public static int operate(int a, int b, String op) {
		int result=0;
		
		switch(op)
		{
		case "+":
			result= a+b;
			break;
		case"-":
			result=a-b;
			break;
		case"*":
			result=a*b;
			break;
		case"/":
		{
			if(b==0)
			{
				System.out.println("0 a bolemezsn");
			}
			else
			{
				result=a/b;
			}
		}
		break;
		
		}
		return result;
		
	  }
}
