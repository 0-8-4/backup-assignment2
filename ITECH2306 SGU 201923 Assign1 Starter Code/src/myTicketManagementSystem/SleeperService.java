package myTicketManagementSystem;
/**
 * @author Kkeogh
 *
 */
/**
 * Sleeper services are priced differently to the standard Train Service. 
 * The price is increased by a factor of 0.9 on the saved price
 * Also, the minimum price set for a Sleeper is higher than for standard train service
 */

public class SleeperService extends TrainService {

	
	public SleeperService(String departStation, String arriveStation, String departureTime) {
		super(departStation, arriveStation, departureTime);
	}
	
	public SleeperService(int departStationNo, int arriveStationNo, int departTime) {
		super(TrainService.allStationNames[departStationNo].getName(), 
				TrainService.allStationNames[arriveStationNo].getName(), Integer.toString(departTime));
	}


	

	
	@Override
	public 	double getTicketPrice() {
		return MINSERVICECOST;// update this so that it calls super.getTicketPrice and then adds a surcharge
	}
	
	
}
