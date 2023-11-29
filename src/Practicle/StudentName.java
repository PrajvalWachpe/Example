package Practicle;

import java.util.Scanner;

public class StudentName {
	
	public String name(){
		 
			Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter the name of the student: ");
	        String name = sc.nextLine();
	        
	        return "Hello, " + name + "! Welcome to the java session.";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentName sn=new StudentName();
		String answer=sn.name();
		System.out.println("****"+answer);
	}

}
