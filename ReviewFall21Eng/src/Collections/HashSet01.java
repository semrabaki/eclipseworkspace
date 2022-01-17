package Collections;

import java.util.*;

public class HashSet01 {

	public static void main(String[] args) {
		List<Character> characters = new ArrayList<Character>(); // 
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('2');
        
        System.out.println(characters);
        
        HashSet<Character> hashcharacters = new HashSet<Character>(characters); 
        
        System.out.println("Elements in hashcharacters: " + hashcharacters); // LINE C
        System.out.print("retrieving in order: "); // LINE D
        
        for (int i = 0; i < hashcharacters.size(); i++)
        {
            System.out.print(characters.get(i) + " "); // LINE E
        }
        
        hashcharacters.remove(2); // LINE F
        System.out.println();
        System.out.print("Modified HashSet: " + hashcharacters); // LINE G  

	}

}
