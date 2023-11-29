package inheritance;
/*
 * Method overriding is changing the behaviour of inherited method in the child object.
 * Method overriding is type of Polymorphism
 * 
 * Polymorphism is same name different behaviour. Poly mean Many and Morph means form.
 * type:-
 * 1] Method overriding
 * 2] Method overloading
 * 
 * Steps:-
 * 1] make exact same method in child class which is there in parent class
 * 2] do not change method name and parameter
 * 3] access specifier can be changed but you can't reduce the visibility in the
 *   child class.
 * 4] private methods never inherited by child class, hence we can't override private methods.
 *  We can make same method in child class also but it will be considered as a new method
 *  belonging to child class. this method will not be connected to parent class method.  
 */

class Parent{
	
	public void sendResume() {
		
		System.out.println("Sending resume by post....");
	}
	
	protected void display() {
		
		System.out.println("This is private");
	}
	
	private void show() {
		
		System.out.println("This is first day of week..");
	}
	
}

class Child extends Parent{
	
	public void sendResume() {
		
		System.out.println("Sending resume by email.....");
	}
	
	protected void display() {
		
		System.out.println("Welcome Everyone....");
	}
	/*
	 * Below given show method is completely new method of child class.
	 * it is not considered as overridden method.
	 */
	public void show() {
		
		System.out.println("Today is Monday");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c=new Child();
		c.sendResume();
		c.show();
	}

}
