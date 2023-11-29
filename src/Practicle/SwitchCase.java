package Practicle;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		double num1,num2,result;
		char operator;
		
		System.out.println("Enter The First Number:-"	);
		double n=sc.nextDouble();
		System.out.println("Enter The Scenond Number:-");
		double m=sc.nextDouble();
		
	
		
		System.out.println("Choose An Operation:- \n1]Addition \n2]Subtraction \n3]Division \n4]Multiplication \n5]Modulus \n");
		int op=sc.nextInt();
		
		switch (op){
			
		case 1:
			result=n+m;
			System.out.println("Addition is:-"+result);
			break;
			
		case 2:
			result=n-m;
			System.out.println("Subtraction is:-"+result);
			break;
			
		case 3:
			result=n/m;
			System.out.println("Division is:-"+result);
			break;
		
		case 4:
			result=n*m;
			System.out.println("Multiplication is:-"+result);
			break;
			
		case 5:
			result=n%m;
			System.out.println("Modulas is:-"+result);
			break;
			
		default:
			System.out.println("Invalid Choice...!!!");
			break;
		}
	}

}
