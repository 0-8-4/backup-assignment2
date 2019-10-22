/**
 * 
 */
package myTicketManagementSystem;

/**
 * @author Kkeogh
 *
 */
public class FirstClassTicket extends Ticket {

	/**
	 * 
	 */
	public FirstClassTicket(TrainService _service, TicketType _ticketType) {
		super(_service, _ticketType);
	}

	@Override
	public double getTicketPrice() {
		double ticketPrice = 0; //TODO get ticketprice based on the service (sleeper or standard)
		// update this to make ticketprice more expensive for first class ticket - add surcharge 25% extra 
		// also need to update so that the correct ticket type (full fare or concession fare) is produced
		return ticketPrice;
	}

	@Override
	public String toString() {
		
		return " ";
	}

}
