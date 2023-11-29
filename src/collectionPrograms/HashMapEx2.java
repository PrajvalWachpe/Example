package collectionPrograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		
		HashMap<String, String> hm=new HashMap<String, String>();

		hm.put("Maharasthra", "Mumbai");
		hm.put("Gujrat", "Gandhi-Nagar");
		hm.put("Rajastahan", "Jaipur");
		hm.put("MAdhya-Pradesh", "Bhopal");
		hm.put("Bihar", "Patna");
		hm.put("UttarPradesh", "Lucknow");
		
		System.out.println("Getting all keys of hashmap....");
		Set<String> states=hm.keySet();
		System.out.println("States:- "+states);
		
		System.out.println("\nGetting all values of HashMap:- ");
		Collection<String> cities=hm.values();
		System.out.println("Cities:- "+cities);
		
		/*
		 * Map-Entry is a nested interface inside the Map interface
		 */
		System.out.println("\nGetting each pair seperately in key value:- ");
		Set<Map.Entry<String, String>> pairs=hm.entrySet();
		Iterator<Map.Entry<String, String>> it=pairs.iterator();
		
		while(it.hasNext())
		System.out.println(it.next());
	}

}
