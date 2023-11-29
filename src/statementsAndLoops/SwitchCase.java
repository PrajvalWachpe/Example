package statementsAndLoops;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Switch Statement is used when we know that a variable is going to
		 * have many possible values And we want to give different output for different values.
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Color Present In Rainbow:-");
		String color=sc.nextLine();
		
		
		
		switch(color) {
		
			case "voilet":
				System.out.println("Known As Royal Color:");
			break;
			
			case "indigo":
				System.out.println("Ashok Chakra IS Indigo Color:");
				break;
				
			case "blue":
				System.out.println("Color of Sky Is Usually Blue:");
				break;
				
			case "green":
				System.out.println("NAture And Trees Color Is Green:");
				break;
				
			case "yellow":
				System.out.println("Sunflower Is yellow In Color");
				break;
				
			case "orange":
				System.out.println("Orange IS Color Of Orange Fruit:");
				break;
				
			case "red":
				System.out.println("We Stop at Red Signal:");
				break;
				
			default: 
				System.out.println("Please Give The Letter Of Color In Small:");
				
			
		}
	}

}
