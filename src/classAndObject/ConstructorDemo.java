package classAndObject;

public class ConstructorDemo {
	
	public ConstructorDemo() {
		
		System.out.println("This Is Non-Parameterized Constructor:-");
	}
	
	public ConstructorDemo(String s) {
		
		System.out.println("This IS Parameterized Constructor:"+s);
	}
	
	public ConstructorDemo(String s, int a) {
		
		System.out.println("This Constructor Has Two Parameter:");
		System.out.println("String:-"+s+"\nInt:"+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * We can make more then one object of same class to call perticular constructor
		 */

		ConstructorDemo cd=new ConstructorDemo();
		ConstructorDemo c1=new ConstructorDemo("Anudip");
		ConstructorDemo c2=new ConstructorDemo("Anudip", 100);

	}

}
