package Practicle;

public class MainOverload {

	public static void main(String[] args) {
		
		        System.out.println("This is the standard main method.");
		        for (String arg : args) {
		            System.out.println("Argument: " + arg);
		        }
		    }

		    
		    public static void main(int arg) {
		        System.out.println("This is an overloaded main method with an integer argument: " + arg);
		    }// Overloaded main method

		  
		    public static void main(String arg1, String arg2) {
		        System.out.println("This is another overloaded main method with two string arguments: " + arg1 + ", " + arg2);
		    }  // Another overloaded main method
		}

	


