package inheritance;
/*
 * 1] Constructor are never inherit
 * 2] when the object of child class is created then always the non-parameterized constructor
 * of parent is called.
 * 3] in parent class if don't make any constructor then compiler create non-parameterized 
 * constructor in it. but if we as coder are going to create a constructor in parent class then always remember
 * to make non parameterized constructor also
 * 4] we can call any constructor of parent from the constructor of child using super keyword
 * 5] we can call parent constructor only once inside the constructor of child.
 * 6] parent constructor should be call in first line of code in child constructor
 * 
 * Create a parent clasS VEHICAL having three constructor 
 * create its child class CAR which should have two constructor
 * demonstrate how ypu will call parent constructor from car class
 */

class Garden{
	
	public Garden() {
		
		System.out.println("This is Zero parameter constructor of garden:-");
	}
	
	public Garden(String city) {
		
		System.out.println("This is the garden in the city"+city);
	}
}

class plant extends Garden {
	
	public plant() {
	
		super("Pune");
		System.out.println("This is Zero parameter constructor of plant:-");
	}
	
	public plant(String name) {
		
		System.out.println("This is the "+name+"+plant");
	}
}
public class SuperDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		plant p=new plant();
		
	}

}
