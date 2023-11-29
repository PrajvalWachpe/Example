package abtraction;
/*
 * In Java we achieve abstraction using abstract method
 * Abstract method do not have their own method body. They only have method signature.
 * These abstract methods are given implementation/method body by child class according
 * to their requirements.
 * 
 * Point To Remember:-
 * 1]Abstract Method Has To Be Declare By Using Abstract Keyword.
 * 2] An An abstract method can only be made inside an abstract class, meaning if your 
 * class has an abstract method; then it is compulsory to declare the class also abstract.
 * 3]we cannot make the object of abstract class because our class is incomplete since it has abstract methods.
 * 4]Any child class of an abstract parent class has to give implementation to the abstract method.
 * 5] If a child class does not want to give implementation to the abstract method inherited from parent class, 
 * then it will have to declare itself as abstract.
 * 6]Abstract class can have constructors. We cannot call this constructor directly after new We have to call 
 * 	it with super keyword from child class constructor.
 * 7]Abstract keyword and final keyword can never be used together Because abstract keyword and final keyword are 
 * doing completely opposite work. With abstract we are expecting the child class to change the implementation; 
 * whereas with final keyword we are preventing child class to make changes.Hence we are not allowed to use these keywords together.
 */
abstract class Robot1{
	
	public void talking() {
		System.out.println("The Robot Is Coding...");
	}
	
	public void cleaning() {
		System.out.println("The Robot is Cleaning...");
	} 
	
	/*
	 * Below we see abstract method
	 */
	
	public abstract void dancing();
}

class Sanket extends Robot1{
	 
	public void dancing() {
		System.out.println("my robot is doing garba..");
	}
}

class Pratima extends Robot1{
	
	public void dancing() {
		System.out.println("My robot is doing bharat natyam");
	}
}

abstract class Dhananjay extends Robot1{
	public void prtotect() {
		System.out.println("Robot is protecting");
	}
	
	public void BuildMAchine() {
		System.out.println("Robot is building machine...");
	}
}

class Rutuja extends Dhananjay{
	
	public void dancing(){
	
		System.out.println("Robot Is Doing Kathak");
	}
} 
public class Example {

	public static void main(String[] args) {
	
		System.out.println("This Is Sanket");
		Sanket s=new Sanket();
		s.talking();
		s.cleaning();
		s.dancing();
		
		System.out.println("This Is Pratima");
		Pratima p=new Pratima();
		p.talking();
		p.cleaning();
		p.dancing();
	}

}
