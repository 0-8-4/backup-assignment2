/**
 * 
 */
package myTicketManagementSystem;

/**
 * @author Kkeogh
 *
 */
public class FirstClassTicket extends Ticket {

	double SURCHARGE = 0.25;
	/**
	 * 
	 */
	public FirstClassTicket(TrainService _service, TicketType _ticketType) {
		super(_service, _ticketType);
	}

	// first class ticket has 25% surcharge added
	@Override
	public double getTicketPrice() {
		double ticketPrice = this.getService().getTicketPrice() * (1+ SURCHARGE);
		// to make ticketprice more expensive for first class ticket - add surcharge 25%
		// if concession fare, give 10% discount when issue the ticket
		return ticketPrice;
	}

	@Override
	public String toString() {
		
		return "Travel through " + this.getService() + 
				" First Class Ticket $" + this.getTicketPrice() ;
	}

}
