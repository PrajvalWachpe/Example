package jdk8910Features;

interface Calculator{
	
	default public void add(int i, int j) {
		System.out.println("Answer:- "+(i+j));
	}
	static void sub(int i, int j) {
		System.out.println("Answer:- "+(i-j));
	}
}

class Demo implements Calculator{
	
	public void display() {
		System.out.println("This is display method of demo class");
	}
}

public class StaticinterfaceObject {

	public static void main(String[] args) {
	
		
		Demo d=new Demo();
		d.display();
		d.add(98, 67);
	
		/*
		 * Below we directly call sub method without 
		 */
		Calculator.sub(45,34);
		

	}

}
