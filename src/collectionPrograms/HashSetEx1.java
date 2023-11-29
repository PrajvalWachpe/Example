package collectionPrograms;

import java.util.HashSet;

public class HashSetEx1 {

	public static void main(String[] args) {
		
		/*
		 * HashSet implements Set interface.
		 * 
		 * Properties of HashSets : 
		 * 1]  Duplicates are not allowed.
		 * 2]  Insertion order not maintained.
		 * 3]  Members are not sorted.
		 * 4]  Only one null value is allowed.
		 * */
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Pen");
		hs.add("Eraser");
		hs.add("Shapner");
		hs.add(null);
		hs.add(null);
		hs.add("Protractor");
		hs.add("Scale");
		hs.add("Shapner");
		hs.add("Protractor");
		hs.add("Scale");
		System.out.println(hs);
	}

}
