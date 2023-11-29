package exceptionsProgram;

public class CompileTimeException {

	public static void main(String[] args) {
		/*
		 * Below we seeing an example of compileTime exception/ checked exception
		 * These types of exception are checked by compiler and it forces us to handle
		 * the exception there itself. Program will not run until we handle the exception. 
		 */
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
