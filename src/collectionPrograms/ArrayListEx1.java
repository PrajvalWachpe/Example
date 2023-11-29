package collectionPrograms;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		/*
		 * Properties of array-list:
		 * 1] Insertion order is maintain.
		 * 2] Members are not sorted.
		 * 3]Null values an duplicate values are allowed.
		 * 4] All members are allocated with index starting from 0 t0 size()-1.
		 */
		ArrayList<String> names=new ArrayList<String>();
		names.add("Prajval");
		names.add("Atharva");
		names.add("Rushi");
		names.add("Soham");
		names.add("Yash");
		System.out.println("Directly:-");
		System.out.println(names);
		
		System.out.println("\nusing For lopp:-");
		for (int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("\nUsing for each loop");
		for (String n:names) {
			System.out.println(n);
		}
		
	}

}
