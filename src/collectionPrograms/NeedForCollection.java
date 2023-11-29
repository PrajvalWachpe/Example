package collectionPrograms;
import java.util.ArrayList;

public class NeedForCollection {
	public static void main(String[] args) {
		/*
		 * Disadvantages of arrays: -
		 * 1) Size is fixed
		 * 2) Only homogeneous type of data can be stored in array
		 * 3) Array doesn't provide much variations or predefined methods in it. Searching and other
		 * manipulations in an array is difficult.
		 * 
		 * Framework: Framework is a group of predefined classes and interfaces having many predefined
		 * methods which can be used and modified according to our requirement.
		 * 
		 * Collection is a framework of many interfaces and classes.
		 * Collection is used to store a group of objects.
		 * Advantages of Collection:-
		 * Its size is not fixed.
		 * We can create homogeneous or heterogeneous collections.
		 * We get many predefined classes due to which We can have difference collections having their own
		 * unique properties.
		 * 
		 * Properties of various Collections to consider:-
		 * 1) null allowed or not
		 * 2) Duplicates allowed or not
		 * 3) Insertion order maintained or not
		 * 4) Members sorted implicitly or not
		 */
		
		/*
		 * Below We have created a heterogeneous or non-generic collection.
		 * Meaning We can add any type of data in it.
		 * Note:-
		 * In Java this is not preferred. We should usually never make such non-generic collection because
		 * it does not give type safety.
		 */
		ArrayList myObj = new ArrayList();
		myObj.add("Anudip");
		myObj.add(10);
		myObj.add(9.6);
		myObj.add(true);
		myObj.add('#');
		
		System.out.println(myObj);
	}
}

