package collectionPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx3 {

	public static void main(String[] args) {
		
		ArrayList<Person> pList = new ArrayList<Person>();
		Person p1 = new Person(101,"Atul",false,6,"Indian");
		pList.add(p1);
		pList.add(new Person(102,"Charles",true,40,"Britisher"));
		pList.add(new Person(2,"Sultan",true,25,"Saudi Arabian"));
		pList.add(new Person(58,"William",false,10,"American"));
		pList.add(new Person(4,"Yang Li",true,31,"Chinese"));
		
		System.out.println(pList);
		
		Collections.sort(pList);
		System.out.println(pList);
	}

}
