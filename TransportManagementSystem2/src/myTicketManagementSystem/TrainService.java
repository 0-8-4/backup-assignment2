package myTicketManagementSystem;
/**
 * @author Kkeogh
 *
 */
public abstract class TrainService {

	// static attributes to share with all TrainServices
	// constants
	static final double MINTICKETPRICE = 25.00; 
	// list of stations stored in an array - should change to an ArrayList for more flexibility 
	// remove dummy Station data here and write a new method to setup all stations based on file input
	static Station[] allStationNames = {new Station(1, "Central",1), 
									new Station(2, "Paramatta",1),
									new Station(3, "Penrith", 2),
									new Station(4,"Lithgow",3),
									new Station(5, "Orange",4), 
									new Station(6, "Bathurst",4), 
									new Station(7, "Newcastle",3),
									new Station(8, "CoffsHarbour",4),
									new Station(9, "ByronBay", 4)};
	
	
	// attributes for all Train Services
	int zonesTravelled = 1;  // default assumption one zone travelled, should calculate this
	int departureStationNumber; // index value for station in allStationNames list
	int arrivalStationNumber;
	String departureTime;
	
	
	// constructor
	public TrainService(String departStation, String arriveStation, String departureTime) {
		this.setUpStationData("StationInputFile.txt"); // not yet implemented
		this.setDepartStation(departStation);
		this.setArriveStation(arriveStation);
		this.setDepartureTime(departureTime);
		this.setZonesTravelled();
	}
	
	private void setZonesTravelled() {
		// update this to calculate how many zones are travelled from Depart Station to Arrive Station
		this.zonesTravelled = Math.abs(this.allStationNames[arrivalStationNumber].getZone() - 
										this.allStationNames[departureStationNumber].getZone() +1); 
		
	}

	private void setDepartureTime(String _departureTime) {
		this.departureTime = _departureTime;
		
	}

	private void setArriveStation(String arriveStation) {
		//todo: search in the train station list for this station arriveStation and find it's index value
		this.arrivalStationNumber = 0;  // change this to be the index value of the correct station
	}

	private void setDepartStation(String departStation) {
		//todo: search in the train station list for this station arriveStation and find it's index value
		this.departureStationNumber = 1;  // change this to be the index value of the correct station
				
	}

	// methods for Train Services
	public double getTicketPrice() {
		return MINTICKETPRICE * (getZonesTravelled());  // default price is minimum price
		// the price is increased if more zones are travelled
	}

	public int getZonesTravelled() {
		// need to look at departure station and arrival station and see how many zones are travelled
		// then update zonesTravelled
		// need to have a mechanism for finding or storing number of zones travelled
		return zonesTravelled;
	}
	
	private void setUpStationData(String fname) {
		// TODO finish this method to load station details from file named fname
		// open scanner on file fname to read in Station details into an ArrayList allStations to replace the array allStationNames
		// loop to read in Station data - station name on one line, zone number on next line, until EOF
		
	}
	
	public String toString() {
		return " service " + this.getZonesTravelled() + " zones, between Station "
				+ this.departureStationNumber + " and Station " + this.arrivalStationNumber + " Service price " + getTicketPrice() ;
	}
}
