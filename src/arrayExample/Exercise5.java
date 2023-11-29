package arrayExample;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Create an array of int type size 5. Take user input to add data in array.
 * now sort array in ascending array.
 * 
 */
public class Exercise5 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int [] a= new int[5];
		System.out.println("Enter The Five Numbers:-");
		for(int i=0;i<a.length;i++) {
			
			System.out.println("Enter Number:-");
			a[i]=sc.nextInt();
			
		}
		
		Arrays.sort(a);
		
		System.out.println("Sorted Array of A in ascending order:-");
		 for (int num : a) {
	            System.out.print(num + " ");
	        }
	}
}

/*
 * for(int i=0; i<a.lenght; i++){
 * 	for (int j=i_1; i<a.lenght; j++){
 * 		int temp=a[i];
 * 		if(a[i]>a[j]){
 * 			
 * 			a[i]=a[j];
 * 			a[j=temp;]
 * 	}
 * 	}
 * }
 */