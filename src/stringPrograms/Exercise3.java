package stringPrograms;

import java.util.Scanner;

// write a program to remove all duplicates letter of this word happy birthday 
public class Exercise3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any word..");
		String s=sc.nextLine();
	
		//String s=new Scanner(System.in).nextLine();
		
		char[] c=s.toCharArray();
		for(int i=0; i<c.length; i++) {
			
			for(int j=i+1; j<c.length;j++) {
				
				if (c[i]==c[j]) {
					c[i]=' ';
				}
			}
		}
		
		s=new String(c);
		s=s.replace(" ", " ");
		
		System.out.println(s);
	}

}
