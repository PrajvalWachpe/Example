package Practicle;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortHashSetAplha {

	public static void main(String[] args) {
		
		HashSet<String> stringHashSet = new HashSet<>();

       
        stringHashSet.add("banana");
        stringHashSet.add("cherry");
        stringHashSet.add("apple");
        stringHashSet.add("date");
        stringHashSet.add("grape");

        System.out.println("Original HashSet: " + stringHashSet);

        List<String> sortedList = new ArrayList<>(stringHashSet);

        Collections.sort(sortedList);

        HashSet<String> sortedHashSet = new HashSet<>(sortedList);

        System.out.println("HashSet sorted alphabetically: " + sortedHashSet);

	}

}
