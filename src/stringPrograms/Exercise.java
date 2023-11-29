package stringPrograms;

import java.util.Scanner;

/*
 * Take a name from user
 * find out the mirror image of given name
 */
public class Exercise {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:-");
		String n=sc.nextLine();
		
		String rev="";
		int len=n.length();
		for(int i=len-1;i>=0;i--) 
		{
			rev=rev+n.charAt(i);
		}
		System.out.println("Reverse String is:-"+rev);
		/*
		StringBuffer sb=new StringBuffer(n);
		sb.reverse();
		System.out.println(""+sb);
		 */
		
	}

}
