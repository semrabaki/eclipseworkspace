package Lists;

import java.util.Arrays;

/*
 Create a 10-element list. Swap the 8th element with the 3rd element.

INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

Output:

[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
 */

public class List02 {

	public static void main(String[] args) {
		
		String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
		String temp="";
		
		temp=names[2];
		names[2]=names[7];
		names[7]=temp;
		
		System.out.println(Arrays.toString(names));
		
		

	}

}
