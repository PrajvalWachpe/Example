package abtraction.interfaces;
/*
 * Interface are template of class. We use it to create basic structure for the class.
 * 
 * Point To Remember:-
 * 1] all methods in the interface are automatically considered as public and abstract, we do not 
 * have to add keywords public or abstract.s
 * 
 * 2] All variables in interface are automatically public static and final.
 *
 * 3] Interface object can't create.
 * 
 * 4] Interfaces don't have constructors. Constructors basically are used to create object and to 
 * initialize the instance variable.
 * Since we can't make object of interface and we can't initialize final variable through constructor
 * hence there is no requirement of constructor in interface. Therefore the concept of constructors are 
 * not allowed in interface.
 *  
 * 5] We use implement keyword to make IS-A relation between class and interface 
 * 
 * 6] Interface are never extend another class, it can extend another interface.
 * 
 * 7] A class can interface more than one class
 * 
 * 8] A class can do both extend another class and implement many interfaces at same time.
 * 
 * 9] We can make nested interfaces also.
 * 
 * 10] If in case a class does not want to implement all the methods of an interface then the
 *  class has to declare itself as abstract.
 */

public class InterfacesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
