package collectionPrograms;

import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		
		TreeMap<String, Double> tm=new TreeMap<String, Double>();

		tm.put("Soni", 45.00);
		tm.put("loni", 35.00);
		tm.put("honi", 67.00);
		tm.put("goni", 58.00);
		tm.put("toni", 89.00);
		tm.put("moni", 98.00);
		
		System.out.println(tm);
	}

}
