package jdk8910Features;

/*
 * Multiple inheritance with interface is allowed.
 * but if all int6erface implemented by class has default methods 
 * with exact same method signature then it becomes compulsory for 
 * the class to override the method and give its own implementation
 */
interface Template1{
	
	default public void addToCart() {
		System.out.println("Product added to cart..!");
	}
}

interface Template2{
	
	default public void addTocart() {
		System.out.println("Added to cart from template 2...!");
	} 
}

class Amazon implements Template1, Template2{
	
	
}
public class DefaultInterEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
