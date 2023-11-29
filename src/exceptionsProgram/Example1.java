package exceptionsProgram;
/*
 * Exception is something that occurs out of ordinary.
 * In java programs exception occur when JVM does not execute all the lines of code in the 
 * program, it terminates the program in between due to some error code. This is known as Exception.
 * 
 * Exception is abrupt termination of program without reaching the end point.
 * 
 * When an exception occurs i.e., JVM terminates the program abruptly one of the exception 
 * class object is created at error code.
 * as developer we need to know how to handle such abrupt interruption
 */
public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("Hello Everyone...!");
		System.out.println("Today is first day of week");
		/*
		 * Below we are handling the exception using try and catch block.
		 * try block:- used to write any code where exception may occur  
		 * 
		 * catch block;- the exception occurring in try block is caught by 
		 * catch block hence JVM not terminate program. 
		 */
		try {
			int div=10/0;
		}
		catch(Exception e) {
			System.out.println("An exception has occured");
			
		}
		for (int i=0; i<=10; i++) {
			
			System.out.println(i+" ");
		}
		
		System.out.println("\nBye Everyone");
	}

}
