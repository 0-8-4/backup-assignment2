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
 	
	
	public double issueTicket() {
		if (this.ticketType.getFareType() == TicketType.CONCESSION) {
			return issueConcessionTicket();
		}
		else
			return issueFullPriceTicket(); 
	}
	
 	public double issueConcessionTicket() {  // concession ticket is 10% discount on full price ticket
 		double ticketPrice = issueFullPriceTicket(); // get full price ticket fare
 		double discount = ticketPrice * 0.1; // apply concession discount
 		return getTicketPrice() - discount;
 	}
 	
 	public double issueFullPriceTicket() {
 		double ticketPrice = getTicketPrice();
 		
 		if (this.service.getZonesTravelled() > 1) { // if travel multiple zones, increase ticket price.
 			ticketPrice = ticketPrice * this.service.getZonesTravelled(); 
 		}
 		
 		return ticketPrice;
 	}
 	
 	public void print() {
 		System.out.println(this.toString()); // should print correct type of ticket - economy or first class
 	}
 	
 	public abstract String toString(); // override this in sub classes to generate specific types of tickets
}
