package inheritance;

import java.util.Scanner;

/*
 * Inheritance Shows IS-A relationship
 * Here Child Is Type Of Parent.
 * 
 * Aggregation shows HAS-A relationship
 * In This one class has a object of another class
 */

class Food{
	
	int foodId=101;
	String foodNam="Vada Pav";
	double foodPrice=25.00;
	
	public void addSalt() {
		System.out.println("Add Salt According to your taste....");
	}

	public void addChutney() {
		System.out.println("Adding More Chutney To Food..");
	}
}

class Cart{
	
	Food f=new Food();
}
public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Cart c=new Cart();
		c.f.addSalt();
		c.f.addChutney();
	}

}
