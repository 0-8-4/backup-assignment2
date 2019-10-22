/**
 * 
 */
package myTicketManagementSystem;

import java.util.Scanner;

/**
 * @author Kkeogh
 *
 */
public class RailManager {
	TrainService allServices[] = new TrainService[100]; // up to 100 services, change to ArrayList
	static Scanner input = new Scanner(System.in);
	
	
	public void setUpData() {
		// set up some dummy data - need to change or overload to read from a file
		allServices[0] = new StandardService("Central", "Lithgow", "10:00");
		allServices[1] = new StandardService("Central", "Bathurst", "10:00");
		allServices[2] = new StandardService("Bathurst", "Lithgow", "12:00");
		allServices[3] = new SleeperService("Central", "CoffsHarbour", "22:00");
		allServices[4] = new SleeperService("Central", "Byron Bay", "22:00");
	}
	
	public String getAllStationNames() {
		String result = "";
		// print a list of all stations for information
		for (Station s : TrainService.allStationNames) {
					result = result + s.name + " ";
		}
		return result;
	}
	
	public void sellTickets() {
		int departSt, arriveSt, hourDepart;
		String reply;
		TicketType fareType;
		Ticket newTicket;
		
		System.out.println(getAllStationNames());
		
		System.out.println("Please Enter Departure Station number : ");
		departSt = input.nextInt();
		System.out.println("Please Enter Destination Station number : ");
		arriveSt = input.nextInt();
		System.out.println("Please Enter Departure Hour (00-24): ");
		hourDepart = input.nextInt();
		System.out.println("Is this a concession Ticket? ");
		reply = input.next();
		reply = reply.toUpperCase();
		if (reply.startsWith("Y")) 
			fareType = new TicketType(TicketType.CONCESSION);
		else
			fareType = new TicketType(TicketType.FULLFARE);
		
		// update this next line so that it displays name of stations, not station numbers
		System.out.println("Ticket requested from " + departSt + " to " + arriveSt + " at " + hourDepart);
	
		newTicket = createTicket(departSt,arriveSt,fareType, hourDepart);
		newTicket.print();
	}

	private Ticket createTicket(int departSt, int arriveSt, TicketType fareType, int departureTime) {
		// first work out service details for this trip
		TrainService aService;
		Ticket t;
		System.out.println("Enter 1 for standard service, 2 for sleeper service : ");
		int ans = input.nextInt();
		if (ans==1) {
			aService = new StandardService(departSt, arriveSt, departureTime);
		}
		else {
			aService = new SleeperService(departSt, arriveSt, departureTime);
		}
		 
		// work out fare for this service
		System.out.println("Enter 1 for Economy seat, 2 for First Class seat : ");
		ans = input.nextInt();
		if (ans==1) {
			t = new EconomyClassTicket(aService, fareType);
		}
		else {
			t = new FirstClassTicket(aService, fareType);
		}
		
		
		return t;
	}
	
	public Ticket createTicket(int departSt, int arriveSt, TicketType fareType, int departureTime, boolean sleeper, boolean firstClass) {
		TrainService aService;
		Ticket t;
		
		if (sleeper)
			aService = new SleeperService(departSt, arriveSt, departureTime);
		else
			aService = new StandardService(departSt, arriveSt, departureTime);
		
		if (firstClass)
			t = new FirstClassTicket(aService, fareType);
		else
			t = new EconomyClassTicket(aService, fareType);
		
		return t;
	}


}
