package classAndObject;

import java.util.Scanner;

/*
 * Class is template to write a code.
 * class is blue print of an object.
 * class is group of member variables, methods and obejcts.
 * 
 * Constructor is special method used to create object.
 * syntax:-
 * Accessspecifier classname(Parameter){}
 * 
 */
public class ClassDemo {
	
	public String display( String b) {
		
		System.out.println("Today Is A Weekday ");
		System.out.println(" Hello " +b);
		return "Raksha Bandhan Is Coming";
	}
	
	public ClassDemo() {
		System.out.println(" I'm The Constructor of class ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		ClassDemo cd=new ClassDemo();
		String b="Prajval";
		String s=cd.display(b);
		System.out.println(s);
		
	}

}
