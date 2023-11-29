package Practicle;
/*
 *  + ---> Addition 
 *  - ----> Subtraction
 *  * ----> Multiplication
 *  / ----> Divide The number and gives quotient
 *  % ----> Divide Number And gives remainder
 *
 */
import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		
		int t=500;
		int p=100;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Marks:-");
		double m=sc.nextDouble();
		
		double ma=m/t*p;
		
		double mn=m%t;
		
		System.out.println("Total Percentage:="+ma);
		System.out.println("Modulas Answer:-"+mn);

	}
}
