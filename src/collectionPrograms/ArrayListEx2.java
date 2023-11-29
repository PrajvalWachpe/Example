package collectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx2 {

	public static void main(String[] args) {
		
		/*
		 * Iterator is an interface used to iterate the members of collection.
		 * It can be used to fetch data from any type of collection.
		 * Iterator interface's implemented object is created with the method iterator(i).
		 * 
		 * ListIterator Is also an interface used to iterate members of collection.
		 * 
		 */

		ArrayList<Integer> rollno=new ArrayList<Integer>();
		rollno.add(87);
		rollno.add(90);
		rollno.add(80);
		rollno.add(82);
		rollno.add(85);
		rollno.add(76);
		rollno.add(78);
		
		Iterator<Integer> it = rollno.iterator();
		System.out.println("Using Iterator");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Using listIterator from start to end:- ");
		ListIterator<Integer> li=rollno.listIterator();
		System.out.println("\nUsing ListIteratoor:- ");
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("Using listIterator from end to start:- ");
		ListIterator<Integer> rev = rollno.listIterator(rollno.size());
		while(rev.hasPrevious()) {
			System.out.println(rev.previous());
		}

	}
}
