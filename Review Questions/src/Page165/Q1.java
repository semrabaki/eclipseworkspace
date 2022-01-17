package Page165;

public class Q1 {

	public static void main(String[] args) {
		String a="";
		a+=2;
		System.out.println(a);
		a+='c';
		System.out.println(a);
		a+=false;
		System.out.println(a);
		
		if(a=="2cfalse")
		{
			System.out.println("==");
		}
		if(a.equals("2cfalse"))
		{
			System.out.println("equals");
		}
		

	}

}
