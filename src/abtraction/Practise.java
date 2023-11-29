package abtraction;
/*
 * Write a program to make An Class MovieTicketApp. This class have two instance method and two
 * abstract method.
 * Give implementation to abstract method in child class BookMyShow
 */

abstract class MovieTicketApp{
	
	public void SelectMovie() {
		
		System.out.println("Select the Movie You Want To Watch...");
	}
	
	public void SelectSeat() {
		System.out.println("Select Your Seat...");
	}
	
	public abstract void makePayment(); 
	
	public abstract void PrintTicket();
}
class BookMyShow extends MovieTicketApp{
	
	public void makePayment() {
		System.out.println("Seelect ypur Payment Method and make payment");
	}
	
	public void PrintTicket() {
		System.out.println("Print Your Ticket..");
	}
}
public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookMyShow b=new BookMyShow();
		System.out.println("This Is Movie Ticket Registration");
		b.SelectMovie();
		b.SelectSeat();
		b.makePayment();
		b.PrintTicket();
	}

}
