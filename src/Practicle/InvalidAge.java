package Practicle;

import java.util.Scanner;

class AgeInvaildTVote extends Exception{
	
	/*
	public AgeInvaildTVote() {
		System.out.println("Age Below 18 Is Invalid To Vote");
	}
	*/
	
	public String getMessage() {
		return "Age Is Below 18.. Invalid To Vote ..!";
		
	}

	/*
	@Override
	public String toString() {
		return "AgeInvaildTVote: Age is below 18, invalid to vote.";
	}
	*/
}
class User{
	
	int age;
	
	public void vote() throws AgeInvaildTVote{
		
		if(age<18) {
			throw new AgeInvaildTVote();
		}
		else {
			System.out.println("You Are Eligible To Vote..!!");
		}
	}
	
}

public class InvalidAge {

	public static void main(String[] args) {
		
		User u=new User();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Age:- ");
		int age=sc.nextInt();
		u.age=age;//set the age in user object
		
		try {
			u.vote();
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
