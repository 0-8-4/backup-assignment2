package myTicketManagementSystem;
/**
 * @author Kkeogh
 *
 */
public class StandardService extends TrainService {

	
	public StandardService(String departStation, String arriveStation, String departureTime) {
		super(departStation, arriveStation, departureTime);
	}
	
	public StandardService(int departStationNo, int arriveStationNo, int departTime) {
		super(TrainService.allStationNames[departStationNo].getName(), 
				TrainService.allStationNames[arriveStationNo].getName(), Integer.toString(departTime));
	}

}
