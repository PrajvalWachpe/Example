package fundamentals;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Your Info:-");
	
		String username=sc.nextLine();
		String lastname=sc.nextLine();
		String location=sc.nextLine();
		String email=sc.nextLine();
		System.out.println("The Name Recived:-s"+username+"\nlastname:-"+lastname+"\nlocation:-"+location+"\nEmail:-"+email);
	}

}
