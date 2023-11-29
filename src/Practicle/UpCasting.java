package Practicle;
/*
 * make a class clothing app. it should have methods addtocart, addreview and placeorder
 * 
 * make class myntra there is child class of clothingapp
 * change the behaviour of addtocart in myntra app
 * myntra should have its own two method
 * 
 * 
 */

class ClothingApp{
	
	public void addToCart() {
		
		System.out.println("Add Item To Cart...");
	}
	
	public void addReview() {
		
		System.out.println("Give The Review Of The Product.. Thanks For Your Support ");
	}

	public void placeOrder() {
		
		System.out.println("Click on Place Order So We'll Place Your Order....");
	
	}	
}

class Myntra extends ClothingApp{
	
	public void addToCart() {
		
		System.out.println("Add Item To Cart...");
		System.out.println("Do You Want To Add More Item To Cart...");
	}
	
	public void selectOrder() {
		
		System.out.println("Select More Item If You Want....");
	}
	
	public void makePayment () {
		
		System.out.println("Select Your Payment Method And MAke Payment.....");
	}
	
	
}
public class UpCasting {

	public static void main(String[] args) {
		
		ClothingApp c=new Myntra();
		c.addToCart();
		c.addReview();
		c.placeOrder();
		
		Myntra m=new Myntra();
		m.addToCart();
		m.addReview();
		m.placeOrder();
		m.selectOrder();
		m.makePayment();
		
		
	}

}
