package Practicle;

import java.util.Scanner;

//Factorial

public class ForLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int fact=1;
	
		System.out.println("Emter The Number:-");
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			
			fact=fact*i;
		}
		{
			System.out.println(fact);
		}
		
		
		
	}
	
}


