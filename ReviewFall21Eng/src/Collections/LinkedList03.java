package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList03 {

	public static void main(String[] args) {
		LinkedList characters = new LinkedList(); // LINE A
        characters.add('A');
        characters.add('C');
        characters.add('D');
        System.out.println("Original list: " + characters);
        characters.add(1, 'B'); // LINE B
        System.out.println("After adding B: " + characters);
        List numbers = new ArrayList(); // LINE C
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        characters.addAll(numbers); // LINE D
        System.out.println("After adding numbers: " + characters);
        characters.addFirst("First"); // LINE E
        characters.addLast("Last"); // LINE F
        System.out.println("After adding First and Last: " + characters); // LINE G
        characters.removeFirst(); // LINE H
        characters.removeLast(); // LINE I
        System.out.println("After removing First and Last: " + characters); 
        characters.addAll(0, numbers);
        System.out.println("After adding numbers into index 0: " + characters);
        System.out.println(characters.pollFirst());
        System.out.println("After pollFirst: " + characters);
        System.out.println(characters.pollLast());
        System.out.println("After pollLast: " + characters);
        
       Character[] newCharacters = (Character[]) characters.toArray();

	}

}
