package Practicle;
//Count Of Digit In given Number
import java.util.Scanner;

public class DigitLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Number:-");
		int num=sc.nextInt();
		int count=0;
		
		for(; num>0; num=num/10) {
			
			count++;
		}
		
		System.out.println("The number of Digit :"+count);
				
		    }	
		
	}


