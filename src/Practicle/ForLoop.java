package Practicle;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Multiplication Of Table:-");
		int num=sc.nextInt();
		
		for(int i=1; i<=10;i=i+1) {
			
			System.out.println(num+	"*"+i+"="+(num*i));
			
		}
		
	}

}
