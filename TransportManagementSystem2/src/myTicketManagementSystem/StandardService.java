package myTicketManagementSystem;
/**
 * @author Kkeogh
 *
 */
public class StandardService extends TrainService {

	static final double MINTICKETPRICE = 25.00; // set minimum ticket price for a standard service

	public StandardService(String departStation, String arriveStation, String departureTime) {
		super(departStation, arriveStation, departureTime);
	}
	
	public StandardService(int departStationNo, int arriveStationNo, int departTime) {
		super(TrainService.allStationNames[departStationNo].getName(), 
				TrainService.allStationNames[arriveStationNo].getName(), Integer.toString(departTime));
	}

	@Override
	public String toString() {
		return "Standard Service, no surcharge applied " + super.toString();
	}
}
