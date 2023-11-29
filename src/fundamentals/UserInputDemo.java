package fundamentals;

import java.util.Scanner;

public class UserInputDemo{

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Your FirstName:- ");
	
		String firstname=sc.nextLine();
	
		System.out.println("The Name Recived:- "+firstname);
		
		System.out.println("Enter Your last name:- ");
		
		String lastname =sc.nextLine();
	
		System.out.println("The LastName Recived:- "+lastname);
		
		System.out.println("Enter Your address:- ");
		
		String add=sc.nextLine();
	
		System.out.println("The Address Recived:- "+add);
		
		System.out.println("Enter Your email:-");
		
		String email=sc.nextLine();
	
		System.out.println("The Email Recived:- "+email);
	}

}
