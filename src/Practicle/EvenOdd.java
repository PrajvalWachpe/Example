package Practicle;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter The No:- ");
		int num=sc.nextInt();
		
		if(num %2==0) {
			System.out.println("The Number is Even:"+num);
		}
		else {
			System.out.println("Number Is Odd:"+num);
		}
		
		
	}

}
