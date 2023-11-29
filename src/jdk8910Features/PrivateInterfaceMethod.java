package jdk8910Features;
/*
 * We can also make private methods inside an interface
 * uses:-
 * 1]To encapsulate some important codes.
 * 2] If we have some come line of code which needs to be repeated again and again then
 * we can write it once in private method and call this private methods wherever we want
 * to execute the common line of codes.
 */
interface PrivateDemo{
	
	private void display() {
		
		System.out.println("Welcome to interface");
	}
	
	default void show() {
		display();
		System.out.println("This is show method");
	}
	default void add() {
		display();
		System.out.println("This is add method");
	}
}
public class PrivateInterfaceMethod {

	public static void main(String[] args) {
		

	}

}
