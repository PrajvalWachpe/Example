package stringPrograms;

import java.util.Scanner;

/*
 * take user input of name city and graduation.
 * 
 */
public class Excercise4 {

	public static void main(String[] args) {
		
		String s="Hi My Name Is _. I'm from _. I have done graduation in _";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:-");
		String name=sc.next();
		
		System.out.println("Enter your city:-");
		String city=sc.next();
		
		System.out.println("Enter your graduation in which stream:-");
		String gra=sc.next();
		
		
		
		 s=s.replaceFirst("_", name);
		 s=s.replaceFirst("_", city);
		 s=s.replaceFirst("_", gra);
		 
		 System.out.println("Info:-"+s);
	
		

	}

}
