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
			//  set standard ticket price for economy based on fare for this service
			double ticketPrice = this.getService().getTicketPrice();
			return ticketPrice;
		}

		@Override
		public String toString() {
			return "Travel through " + this.getService() + 
					" Economy class ticket $" + this.getTicketPrice() ;
		}
	

}
