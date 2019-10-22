package myTicketManagementSystem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TicketTest {

	private TrainService standardServiceZones1;
	private TrainService sleeperServiceZones7;
	private TicketType concessionTicketType;
	private TicketType fullFareTicketType;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		standardServiceZones1 = new StandardService("Central", "Paramatta", "10:00");
		sleeperServiceZones7 = new SleeperService("ByronBay", "Central", "20:00");
		concessionTicketType = new TicketType(TicketType.CONCESSION);
		fullFareTicketType = new TicketType(TicketType.FULLFARE);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetService() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetTicketPriceFirstClassConcessionZone1() {  // TODO create more thorough test cases
		Ticket t = new FirstClassTicket(standardServiceZones1, concessionTicketType);
		// first class ticket has 25% surcharge added
		// 1 zone of travel is charged at default min ticket price
		// concession fare is 10% discount
		// standard service min ticketprice is 25.0
		// expect this ticket to be (25.0 * 1) * 1.25 * 0.9
		double resultExpected = 25.0 *1 * 1.25 * 0.9;
		System.out.println("result expected " + resultExpected);
		System.out.println("actual ticket price issued " + t.issueTicket() +"\n" + t);
		assertEquals("Checking first class concession standard ticket 1 zone ", resultExpected, t.issueTicket(), 0.01);
	}

	@Test
	public final void testIssueConcessionTicket() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testIssueFullPriceTicket() {
		fail("Not yet implemented"); // TODO
	}

}
