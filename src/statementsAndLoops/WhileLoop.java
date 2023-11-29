package statementsAndLoops; //01/09/2023

import java.util.Scanner;

public class WhileLoop {

	/*
	 * while loop are another type of loop used to execute repetitive task.
	 * we use for loop when we know the exact number of times that we want to repeat a task.
	 * while loop is use when we do not know how many times the task needs to be repeated.
	 * 
	 * syntax:-
	 * while(condition){
	 * repetitive task
	 * increment/decrement
	 * }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int count=0;
		
		while(num>0) {
			
			int sum=num/10;
			count++;
		}
		System.out.println(count);
		
		
	}

}
