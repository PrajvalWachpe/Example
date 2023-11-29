package Practicle;

import java.util.Scanner;

public class GreaterNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The First No:- ");
		int num1=sc.nextInt();
		
		System.out.println("Enter The Second No:- ");
		int num2=sc.nextInt();
		
		System.out.println("Enter The Third No:- ");
		int num3=sc.nextInt();
		
		if(num1>=num2 && num1>=num3) {
			System.out.println("The First Number Is Greater");
		}
		else if(num2>=num1 && num2>=num3) {
			System.out.println("The Second Number Is Greater");
		}
		else {
			System.out.println("The Third Number Is Greater");
		}
	}

}
