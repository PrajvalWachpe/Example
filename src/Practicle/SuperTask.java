package Practicle;

class Vehical{
	
	public Vehical() {
		
		System.out.println("This Is Non-Parameterized Constructor Of Vehical:");
	}
	
	public Vehical(String Name) {
		
		System.out.println("This Is Parameterized Constructor Of Vehical:"+Name);
	}

	public Vehical(int Num, String name) {
	
		System.out.println("This Is Parameterized Constructor Of Vehical Having Two Parameters with :" +Num+ "And name"+name);
	}
}

class Car extends Vehical{
	
	public Car() {
		
		super();
		System.out.println("This Is Non-Parameterized Constructor Of Car:");
	}
	
	public Car(String Name) {
		
		super("Royal Enfield");
		System.out.println("This Is Parameterized Constructor Of Car:"+Name);
	}
}	
public class SuperTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c=new Car();
		System.out.println();
		Car c2=new Car("Toyota");
		System.out.println();
		Vehical v=new Vehical(15,"Royal Enfield");
	}
}

