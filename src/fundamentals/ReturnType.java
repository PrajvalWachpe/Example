package fundamentals;

import java.util.Scanner;

public class ReturnType {

	
	public int add() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:-");
		int num1=sc.nextInt();
		
		System.out.println("Enter First Number:-");
		int num2=sc.nextInt();
		
		int total=num1+num2;
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnType rt=new ReturnType();
		int answer = rt.add();
		System.out.println("The answer is:-"+answer);
		
		
	}

}
