/**
 * 
 */
package myTicketManagementSystem;

/**
 * @author Kkeogh
 *
 */
public class EconomyClassTicket extends Ticket {

	/**
	 * 
	 */
	public EconomyClassTicket(TrainService _service, TicketType _ticketType) {
		super(_service, _ticketType);
		}

		@Override
		public double getTicketPrice() {
			//  TODO set standard ticket price for economy based on fare for this service (sleeper or standard service)
			// also need to update so that the correct ticket type (full fare or concession fare) is produced
			double ticketPrice = 0;
			return ticketPrice;
		}

		@Override
		public String toString() {
			
			return " ";
		}
	

}
