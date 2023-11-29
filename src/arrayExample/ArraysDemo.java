package arrayExample;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int a []= {23, 45,11,22,1};
		Arrays.sort(a);
		
		/*
		 * toString is a easy way of printing the members of  array without using loops.
		 * Binary Search will return index of the member if present in array.
		 */
		System.out.println("Number 12 at index "+Arrays.binarySearch(a, 12));
		System.out.println("Members of a:-"+Arrays.toString(a));
		System.out.println("a="+a);
	}

}
