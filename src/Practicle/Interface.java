package Practicle;
/*
 * create an interface for bus ticket booking application. 
 * show its implementation in your class.
 * demonstrate the use of multiple inheritance in this.
 */


interface TicketBooking {
    void bookTicket(int numberOfTickets);
    void cancelTicket(int ticketNumber);
}

interface TicketAvailability {
    int checkAvailability();
}

class BusTicketBooking implements TicketBooking, TicketAvailability {
    private int availableTickets;

    public BusTicketBooking(int totalTickets) {
        this.availableTickets = totalTickets;
    }

    @Override
    public void bookTicket(int numberOfTickets) {
        if (numberOfTickets <= availableTickets) {
            System.out.println(numberOfTickets + " tickets booked successfully.");
            availableTickets -= numberOfTickets;
        } 
        else 
        {
            System.out.println("Sorry, not enough tickets available.");
        }
    }
    
    @Override
    public void cancelTicket(int ticketNumber) {
        System.out.println("Ticket #" + ticketNumber + " canceled.");
        availableTickets++;
    }

    @Override
    public int checkAvailability() {
        return availableTickets;
    }
}

public class Interface {

	public static void main(String[] args) {
		
		BusTicketBooking ticketBooking = new BusTicketBooking(50);

		 ticketBooking.bookTicket(3);
	     ticketBooking.bookTicket(5);
	     ticketBooking.cancelTicket(2);
	     
	     int availableTickets = ticketBooking.checkAvailability();
	     System.out.println("Available tickets: " + availableTickets);

	}

}
