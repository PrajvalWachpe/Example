package Practicle;

import java.util.Scanner;

public class PositiveNegitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The No:- ");
		int num=sc.nextInt();

		if(num>0) {
	
			System.out.println("The Given Number Is Positive:"+num);
		}
		else {
			System.out.println("The Given Number is Negative:");
		}
	}

}
