package Collections;

import java.util.HashSet;
import java.util.Set;

public class MyNameIsKhan {

		 private final String first, last;
		    public MyNameIsKhan(String first, String last) {
		        this.first = first;
		        this.last = last;
		    }
		    public boolean equals(Object o) {
		        if (!(o instanceof MyNameIsKhan))
		            return false;
		        MyNameIsKhan n = (MyNameIsKhan) o;
		        return n.first.equals(first) || n.last.equals(last);
		    }
		    public static void main(String[] args) {
		        Set<MyNameIsKhan> s = new HashSet<MyNameIsKhan>();
		        System.out.println(s.add(new MyNameIsKhan("Shahrukh", "Khan")));
		        System.out.println(s.contains(new MyNameIsKhan("Shahrukh", "Khan")));
		       
		      
		    }

	}

