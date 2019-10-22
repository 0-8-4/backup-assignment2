package myTicketManagementSystem;

public class Station {
	private int stationNo;
	private String name;  // Name of station
	private int zone;  // Zone in which this station is positioned (used to calculate fares)
	
	public Station(int _stationNo, String _name, int _zone) {
		setStationNo (_stationNo);
		setName(_name);
		setZone(_zone);
	}

	private void setStationNo(int _stationNo) {
		this.stationNo = _stationNo;
	}

	private void setZone(int _zone) {
		this.zone = _zone;
	}

	private void setName(String _name) {
		this.name = _name;
	}

	public String getName() {
		return this.name;
	}
	
	public int getZone() {
		return this.zone;
	}
	
	public String toString() {
		return this.name + " Zone " + this.zone;
	}
}
