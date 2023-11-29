package fundamentals;
/*
 * Method is block of code which is execute only if its called
 * 
 * Syntax:-
 * accesspacifier return type method name(Parameter){}
 * 
 * Accessspecifier:- it gives Scope visibility for methods
 * 1] Public :- Its a higest visiblity. This type of method are called from anywhere from package even from another package.
 * 2] Private :- It has least visibility. this is call only within a class.
 * 3] Protected :- It has low visibility then public. It can be access 
 * 4]Default:- It has lesser visibility then protected. it can be accessed only by those classes
 * which are in the same package only. we will never able to access it from other.
 * */
public class MethodsDemo2 {

	public void display() {
		
		System.out.println("This is method of methoddemo of class");
	}
	
	public void show() {
		
		System.out.println("This method is Protected");
	}
	
	void add() {
		
		System.out.println("This is default access specifier");
	}
	
	private void subtract() {
		
		System.out.println("This is private access specifier");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo2 md= new MethodsDemo2();
		md.subtract();
	}

}
