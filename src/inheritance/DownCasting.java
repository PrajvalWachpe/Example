package inheritance;

class Parent1{
	
	public void display() {
		System.out.println("This is Display Method Of Parent1....");
	}
	public void show() {
		
		System.out.println("This IS show Method Of Prent1 ");
	}
}

class Child1 extends Parent1{
	
	public void drawing() {
		System.out.println("This is Drawing Method Of Child1....");
	}
	public void display() {
		System.out.println("Hello Everyone....");
	}
}

public class DownCasting {

	public static void main(String[] args) {
	
		/*
		 * Below we see down-casting where object of parent class is referred by child type variable.
		 * This Is Not Allowed in Java
		 * here we are make parent to behave like a child. Which is not logical and hence we can't downcast in inheritance. 
		 */
	

	}

}
