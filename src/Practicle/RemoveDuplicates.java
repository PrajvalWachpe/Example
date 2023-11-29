package Practicle;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		ArrayList<String> stringList = new ArrayList<>();

     
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("apple");
        stringList.add("cherry");
        stringList.add("banana");
        stringList.add("date");

        System.out.println("Original ArrayList: " + stringList);

       
        HashSet<String> uniqueSet = new HashSet<>(stringList);

        
        stringList.clear();


        stringList.addAll(uniqueSet);

        System.out.println("ArrayList after removing duplicates: " + stringList);


	}

}
