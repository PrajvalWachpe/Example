package stringPrograms;
/*
 * Take any word from user and print following pattern
 * EX:- james
 * ==>	james
 * 		jame
 * 		jam
 * 		ja
 * 		j
 */
import java.util.Scanner;


public class Exercise2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:-");
		String n=sc.nextLine();
		
		 for (int i =n.length()-1 ; i>=0; i--) {
			 
	            for (int j =0 ; j <= i; j++) {
	                System.out.print(n.charAt(j));
	            }
	            
	            System.out.println();
	            
		 }

	}

}
