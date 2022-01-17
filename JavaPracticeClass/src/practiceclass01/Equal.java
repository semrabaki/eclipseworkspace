package practiceclass01;

public class Equal {

	public static void main(String[] args) {

    System.out.println(check(3,3,3));

	}
	
	public static int check(int a, int b, int c) {
		int result = 0;
		if(a==b && b==c)
		{
			 result=3;
		}
		if(a!=b&& b!=c&&a!=c)
		{
			 result=0;
		}
		if((a==b||a==c||b==c)&&(a!=b||a!=c||b!=c) )
		{
			 result=2;
		}
		return result; 
	}
}
