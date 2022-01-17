package varasgs;

public class Varags01 {

	public static void main(String[] args) {
		/*
		 *verilen Stringleri birlestiren concat isimli bir method olusturunuz
		 input : "m", "e"...
		 output: me
		 */
		concat("h", "a","c","e","r");
		concat("hanim", " basarili");

	}
	
	public static void concat(String ...str)
	{
		String newStr="";
		
		for(String w: str)
		{
			newStr=newStr.concat(w);
		}
		System.out.println(newStr);
	}

}
