package abtraction.interfaces;
/*
 * Below we are seeing that the variables are automatically considered public static 
 * and final, we don't have to use specific keyword to make them so. 
 * 
 */
interface Demo1{

	int i=100;
	String name="Anudip";
}

public class InterfaceDemo1 {

	public static void main(String[] args) {
		
		System.out.println("i=:"+Demo1.i);

	}

}
