package inheritance;
/*
 * java follows OOP'S concept 
 * Main pillars of OOP'S
 * 1]Abstraction
 * 2]Encapsulation: Protecting class member by using access specifier
 * 3]Polymorphisam
 * 4]Inheritance: Single, multilevel, hierarchical, hybrid
 *
 * Inheritance is process of inheriting the member of another class into our own class.
 * this done by making our class the child/sub class of another
 * 
 * Parent class is also known as base class or super class. 
 * Child class is also known as derived class or sub class.
 * 
 * extends keyword use to make our class a child class of some other class
 * meaning we can make only one class as our parent class. we can't make multiple classes as parent class
 * therefore multiple inheritance is not allowed in java.
 * 
 * 1]Ambiguity Error is when a class has two methods has same signature if this happen the JVM will get confuse as which method has to be call.
 * 2]if class is allowed to have same multiple parents then there is possibility the the parents have same exact methods and consequently the 
 * same method will be inherited by child. this will again lead to ambiguity error. Hence multiple inheritance is not allowed.
 *  
 */

class MobileApp{
	
	public void textMessage() {
		System.out.println("Sending text message....");
	}
	
	public void voiceCall() {
		System.err.println("voice call connecting.....");
	}
}

class MyApp extends MobileApp{
	
	public void videoCall() {
		System.out.println("Video call Starting....");
	}
}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyApp m=new MyApp();
		
	}

}
