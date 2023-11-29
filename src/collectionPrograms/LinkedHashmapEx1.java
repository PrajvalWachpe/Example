package collectionPrograms;

import java.util.LinkedHashMap;

public class LinkedHashmapEx1 {

	public static void main(String[] args) {
	/*
	 * LinkedhashMap is similar to HAshMap, only difference is that insertion order 
	 * is maintained in LinkedHashMap
	 */
		LinkedHashMap<String, String> hm=new LinkedHashMap<String, String>();

		hm.put("Maharasthra", "Mumbai");
		hm.put("Gujrat", "Gandhi-Nagar");
		hm.put("Rajastahan", "Jaipur");
		hm.put("MAdhya-Pradesh", "Bhopal");
		hm.put("Bihar", "Patna");
		hm.put("UttarPradesh", "Lucknow");
		
		System.out.println(hm);
	}

}
