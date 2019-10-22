/**
 * 
 */
package myTicketManagementSystem;

/**
 * @author Kkeogh
 *
 */
public abstract class Ticket {

	private double ticketPrice;   // price for ticket
 	private TrainService service;  // service booked for ticket issued
 	private TicketType ticketType;
	
 	public Ticket(TrainService _service, TicketType _ticketType) {
 		this.setTicketType(_ticketType);
 		this.setService(_service);
 	}
 	
 	private void setTicketType(TicketType _ticketType) {
		this.ticketType = _ticketType;
	}

	private void setService(TrainService _service) {
		this.service = _service;
	}

	public TrainService getService() {
		return this.service;
	}
	
	public abstract double getTicketPrice();  // get ticket price, override this in sub classes
 	
 	public double issueConcessionTicket() {  // concession ticket is 10% discount on full price ticket
 		 // get full price ticket fare
 		// apply concession discount
 		return 0;
 	}
 	
 	public double issueFullPriceTicket() {
 		double ticketPrice = getTicketPrice();
 		
 		
 			// if travel multiple zones, increase ticket price.
 			// for each zone travelled multiply by ticket price for zone 
 		return 10.00; // update this 
 	}
 	
 	public void print() {
 		System.out.println(this.toString()); // should print correct type of ticket - economy or first class
 	}
 	
 	public abstract String toString(); // override this in sub classes to generate specific types of tickets
}
