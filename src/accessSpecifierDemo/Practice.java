package accessSpecifierDemo;

import fundamentals.MethodsDemo2;

public class Practice extends MethodsDemo2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo2 md=new MethodsDemo2();//object of class method
		md.display();
		//md.add();
		/*
		 * md.show():- we can't call protected method directly.
		 * md.add():- we can't call default method from any other package.
		 * 
		 * Below we are trying to call protected show method of methodsdemo2 since 
		 * it is protected, we will not able to call it here directly.
		 * 
		 * First we have to make practice class as child class by using extend keyword.
		 * becuase show methods is inherited into practice class. now we can make object of practice 
		 * and call the show method from this object.
		 * 
		 */
		Practice p=new Practice();
		p.show();
	}

}
