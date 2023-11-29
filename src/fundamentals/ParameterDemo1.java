package fundamentals;

import java.util.Scanner;

public class ParameterDemo1 {

	public String info(String n, String e) {
		
		return "Name:-"+n+"\nEmail:-"+e;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		ParameterDemo1 pd=new ParameterDemo1();
		
		System.out.println("Enter Yourt Name:-");
		String name=sc.nextLine();
		
		System.out.println("Enter your Email:-");
		String email=sc.nextLine();	
	
		String massage=pd.info(name, email);
		System.out.println(massage);
	}
	

}
