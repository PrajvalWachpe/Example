package collectionPrograms;

import java.util.HashMap;

public class HashMapEx1 {

	public static void main(String[] args) {
		
		/*
		 *
		 * Properties:-
		 * 1] Insertion order is not maintained
		 * 2] members are not sorted.
		 * 3] Keys Can't be duplicate, but values can be duplicates.
		 * 4]only one null key is allowed, multiple null values are allowed
		 */
		
		HashMap<String, Long> contacts= new HashMap<String, Long>();
		contacts.put("Jhon", 8379374723l);
		contacts.put("Seema", 7346528450l);
		contacts.put("Sumon", 6253474922l);
		contacts.put("Neha", 8493725474l);
		contacts.put("om", 9983678332l);
		contacts.put("Yash", 7634839472l);

		System.out.println(contacts);
		System.out.println("Contact Number of sumon:- "+contacts.get("Sumon"));
		
		HashMap<Integer, Person> Pdetails= new HashMap<Integer, Person>();
		Pdetails.put(1, new Person(101, "Abhishek", true, 24, "Indian"));
		
		System.out.println(Pdetails.get(1));
	}

}
