package fundamentals;

import java.util.Scanner;

public class ParameterDemo {
	
	public int add(int num1, int num2) {
		
		return num1+num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		ParameterDemo pd=new ParameterDemo();
		
		System.out.println("Enter First Number:-");
		int i=sc.nextInt();
		
		System.out.println("Enter Second Number");
		int j=sc.nextInt();	
		
		int total=pd.add(i, j);
		System.out.println("The Total Is:-"+total);
		
	}

}
