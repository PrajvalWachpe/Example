package exceptionsProgram;
/*
 * In java whenever a exception occurs JV creates one of the exception 
 * class object.
 * Let's see exception hierarchy:- 
 * Throwable class:- This is parent of all error and exception class.
 * 
 * Error class:- This class has many child classes whose objects are created at serious
 * error codes. As developer we need to solve those error. We should not handle them using 
 * try catch. Example:- stackoverflowError, OutOfmemoryError
 * 
 * Exception class:- This is parent of many exception type classes.These exception occur at error 
 * code which are not that serious. hence we can simply handle them using try catch.
 * Example:- AirthmaticException, ArrayIndexOutOfBoundException,
 * NullPointerException ClassNotFoundException
 * 
 * Type of exception:-
 * RuntimeException:- All sub classes of RunTimeException class is also known as of type RunTimeException
 * These exception are not checked by compiler while compiling your code. we as developers come to know that 
 * such exception are occurring only after we run the program.
 * 
 * 
 */
public class ExceptionTypes {

	public static void main(String[] args) {
		/*
		 * Below we are trying to call method on null value hence at the line
		 * where we callcharAt method JVM will create the object of NullPointerException 
		 * class and terminate our program.
		 * 
		 * we can handle this exception by writing try catch block. 
		 */
		System.out.println("Welcome To this program...!!");
		String s=null;
		try {
		System.out.println(s.charAt(2));
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		System.out.println("Thank You For Using Our Application...!");
	}

}
