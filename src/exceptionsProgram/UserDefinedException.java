package exceptionsProgram;

import java.util.Scanner;

/*
 * We can make our own exception with following steps:-
 * 
 * 1] our class should be part of the exception hierarchy. So we should extend our class 
 * with either Exception class:- this will make our exception a compile time exception
 * or extend with RuntimeException class:- this will make our exception a runtime exception.
 * 
 * 2]make constructor and basic methods in the exception class
 * 
 * 3] we use throw keyword to specify on which error code our exception should occur
 */
class InsufficientBalanceException extends Exception{
	
	public InsufficientBalanceException() {
		
		System.out.println("Balance is not sufficient enough to make withdrawl");
	}
	/*
	 * get message method always return reason for the exception yo occur
	 */
	public String getMessage() {
	
		return "Balance Too Low";
	}

	/*
	 * In toString method we return the fully qualified name of class and the reason
	 * for the exception t occur as seen below
	 */
	@Override
	public String toString() {
		return "exceptionProgram.InsufficientBalanceException: Balance Too Low";
	}
}

class Account{
	double balance=1000;
	
	public void withdraw(double withdrawAmount) throws InsufficientBalanceException {
		if (balance<=withdrawAmount) {
			
			throw new InsufficientBalanceException();
		}
		else {
			balance=withdrawAmount;
			System.out.println(withdrawAmount+ "HAs been withdrawn from your account");
			System.out.println("Current Balnace" +balance);
		}
		
	}
}
public class UserDefinedException {

	public static void main(String[] args) {
		
		Account a=new Account();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the amount you have to withdrawn ");
		double withdrawAmount=sc.nextDouble();
		
		try {
			a.withdraw(withdrawAmount);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
