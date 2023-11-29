package collectionPrograms;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		
		/*
		 * TreeSet implements SortedSet interface. SortedSet extends Set interface.
		 * 
		 * Properties:-
		 * 1) Duplicates are not allowed.
		 * 2) Insertion order is not maintained.
		 * 3) Members are sorted.
		 * 4) Null value not allowed.
		 */
		TreeSet<Double> ts = new TreeSet<Double>();
		ts.add(5.97);
		ts.add(0.5);
		ts.add(2.8);
		ts.add(51.98);
		ts.add(4.0);
		ts.add(2.8);
		ts.add(0.0);
		
		System.out.println(ts);

	}

}
