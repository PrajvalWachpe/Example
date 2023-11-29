package collectionPrograms;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LimkedListEx1 {

	/*
	 * LinkedList implements List and also Deque, due to which it has the properties of List, Deque and
	 * also Queue
	 * 
	 * Properties of LinkedList:-
	 * 1) Insertion order is maintained.
	 * 2) Members are not sorted.
	 * 3) Null value is allowed.
	 * 4) Duplicates are allowed.
	 * 5) All members are allocated with indexes starting from 0 to size()-1
	 * 
	 * Properties of LinkedList as a Queue:-
	 * 1) Insertion order is maintained, meaning the new object added will be usually added to the end of the
	 * queue.
	 * 2) It follows FIFO(First In First Out), meaning the object which was added first will be deleted first
	 * when We call poll();
	 * 3) Members are not given indexes.
	 * 4) Null values are allowed.
	 * 5) Members are not sorted.
	 * 
	 * Properties of LinkedList as a Dequeue:-
	 * 1) New members can be added at the beginning and also to the end of the queue.
	 * 2) We can delete members from the start and also from the end of the queue.
	 * 3) It follows both FIFO and LIFO(Last In First Out).
	 * 4) Members are not given indexes.
	 * 5) Null values are allowed.
	 * 6) Members are not sorted.
	 * 
	 */
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		
		Queue<String> list2 = new LinkedList<String>();
		list2.add("Pramod");
		list2.add("Mulayam");
		list2.add("Akash");
		System.out.println("Before:\n"+list2);
		
		list2.add("Chaitali");
		System.out.println("After:\n"+list2);
		
		list2.poll();
		System.out.println("After deleting:\n"+list2);
		
		Deque<String> list3 = new LinkedList<String>();
		list3.add("Amar");
		list3.add("Akbar");
		list3.add("Anthony");
		list3.add("Sejal");
		list3.add("Sahil");
		
		System.out.println("Before:\n"+list3);
		list3.offer("Tiger");
		
		System.out.println("After offer:\n"+list3);
		list3.offerFirst("Pathan");
		System.out.println("After offerFirst:\n"+list3);
		
		list3.poll();
		System.out.println("After poll:\n"+list3);
		
		list3.pollLast();
		System.out.println("After pollLast:\n"+list3);

	}

}
