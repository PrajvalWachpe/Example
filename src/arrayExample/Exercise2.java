package arrayExample;

import java.util.Scanner;

// create an array of int type 5 size. take user input to add data to add data into his array.
// Print only the even member of array.
public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int [] a= new int[5];
		System.out.println("Enter The Five Numbers:-");
		for(int i=0;i<a.length;i++) {
			
			System.out.println("Enter Number:-");
			a[i]=sc.nextInt();
			
		}
		
		System.out.println("Printing even number....");
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
	}
}
