package stringPrograms;
/*
 * Print this:
 * Ex:- Prajavl
 * 	=>	lvajarp
 * 		lavjar
 * 		lavja
 * 		lavj
 * 		lav
 * 		la
 * 		l
 */
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:-");
		String n=sc.nextLine();
	
		 for (int i =0; i<n.length() ; i++) {
			 
	            for (int j =n.length()-1  ; j>= i; j--) {
	                System.out.print(n.charAt(j));
	            }
	            
	            System.out.println();
	            
		 }
	}

}
