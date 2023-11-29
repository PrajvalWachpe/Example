package stringPrograms;

import java.util.Scanner;

/*
 * Count the number of vowels in given word. 
 */
public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:-");
		String n=sc.nextLine();
		
		char[] c = n.toCharArray();
		int vowel=0;
		
		for (int i = 0; i < n.length(); i++) { 
            if(n.charAt(i)=='a' || n.charAt(i)=='e' || n.charAt(i)=='i' || n.charAt(i)=='o' || n.charAt(i)=='u') 
                vowel++; 
		}
  
	System.out.println("The Vowels In Given String Are: " + vowel);
	}

}
