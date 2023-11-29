package collectionPrograms;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		
		/*
		 * Vector class is a legacy class, meaning it was introduced before the Collections framework. Later 
		 * on Vector class implemented List interface and became a part of Collection.
		 * 
		 * Enumeration is an interface used to fetch members from legacy collections such as Vector, Stack
		 * etc
		 * 
		 * Properties of Vector:-
		 * 1) Insertion order is maintained.
		 * 2) Members are not sorted.
		 * 3) Null value is allowed.
		 * 4) Duplicates are allowed.
		 * 5) All members are allocated with indexes starting from 0 to size()-1
		 */
		
		Vector<String> v = new Vector<String>();
		v.add("Saturday");
		v.add("Friday");
		v.add("Monday");
		v.add(null);
		v.add("Sunday");
		v.add("Tuesday");
		v.add("Thursday");
		v.add("Wednesday");
		
		System.out.println(v);
		
		System.out.println("Using Enumeration...");
		Enumeration<String> e = v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());

		}
	}
}
