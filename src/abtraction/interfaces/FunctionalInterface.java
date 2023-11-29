package abtraction.interfaces;
/*
 * Functional interface is any interface having only one abstract method
 */

interface Printable{

	public void print(); 
}

public class FunctionalInterface {
	

	public static void main(String[] args) {
		/*
		 * Lambda expression is very quick way of giving implementation to an abstract method
		 * of functional interface
		 * Syntax:-
		 * functionalInterfaceName variable=(parameters)->{};
		 */
		Printable p=()->{
			System.out.println("This is implementaion of lambda expression");
		};
		p.print();
	}

}
