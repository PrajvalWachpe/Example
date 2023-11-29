package Practicle;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:-");
		int num=sc.nextInt();
		int rev=0;/*This line initializes an integer variable named rev to 0. 
		 			*This variable will be used to store the reversed number as we construct it step by step.*/
		for( ; num>0; num=num/10) {/*This is a for loop that iterates as long as the value of num (the original number) 
		 								*is not equal to 0. In each iteration, the following actions are performed:*/
			
			int remainder=num%10;/*: Here, the modulo operator % is used to calculate the remainder when num is divided by 10. 
									This remainder represents the last digit of the original number. For example, if num is 12345, then remainder will be 5.*/
			
			rev=rev*10+remainder;/*This line updates the rev variable by adding the current remainder to it. To do this, the value of rev is multiplied by 10 first,
			 						effectively shifting its digits to the left, and then the remainder is added to it. 
			 						This step accumulates the reversed digits of the original number in the rev variable.*/
		}
		
		System.out.println("Reverse Number Is:-"+rev);
	}

}
