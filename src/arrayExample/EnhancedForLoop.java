package arrayExample;
/*
 * Enhanced for loop is also know as for each loop.
 * This type of loop is used to fetch data from arrays or collections.
 * 
 * Syntax:-
 * for(Array_datatype var: array_name){}
 */
public class EnhancedForLoop {

	public static void main(String[] args) {
		
		double [] marks= {90, 54, 45, 23, 87.00, 52.05, 95.89 };
		System.out.println("Using Normal For Loop:-");
		for (int i=0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		System.out.println("\nUsing enhanced for loop...");
		for(double m: marks) {
		
			System.out.println(m);
		}
		
	}

}
