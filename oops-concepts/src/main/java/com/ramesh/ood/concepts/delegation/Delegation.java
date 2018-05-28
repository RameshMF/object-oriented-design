package com.ramesh.ood.concepts.delegation;

//---------------------------------------
//--- STEP 00 - WHAT IS DELEGATION? 
//---------------------------------------

///**
// * Delegation = hand over the responsibility for a particular task to another class or method. 
// *
// * If you need to use functionality in another class but you do not want to change that functionality then use delegation instead of inheritance.
// */

//---------------------------------------
//--- STEP 01 - UNDERSTAND DELEGATION (ALONG WITH POLYMORPHISM) BY EXAMPLE
//---------------------------------------

/**
 * This is test class for the delegation and polymorphism example
 * 
 * 
 */
public class Delegation {

	public static void main(String[] args) {
		// Here TicketBookingByAgent class is internally delegating train ticket booking responsibility to other class
		TicketBookingByAgent agent = new TicketBookingByAgent(new TrainBooking());
		agent.bookTicket();

		// Here TicketBookingByAgent class is internally delegating airline ticket booking responsibility to other class
		agent = new TicketBookingByAgent(new AirBooking());
		agent.bookTicket();
	}
}

/**
 * TicketBokkingByAgent provides implementation of TravelBooking. But it delegates actual ticket booking to other class at runtime using Polymorphism.
 * 
 * @author tirthalp
 * 
 */
class TicketBookingByAgent implements TravelBooking {

	TravelBooking t;

	public TicketBookingByAgent(TravelBooking t) {
		this.t = t;
	}

	// Delegation --- Here ticket booking responsibility is delegated to other class using polymorphism
	@Override
	public void bookTicket() {
		t.bookTicket();
	}
}

/**
 * This represents TravelBooking interface
 * 
 * @author tirthalp
 * 
 */
interface TravelBooking {
	public void bookTicket();
}

/**
 * TrainBooking IS-A TravelBooking type
 * 
 * @author tirthalp
 * 
 */
class TrainBooking implements TravelBooking {
	@Override
	public void bookTicket() {
		System.out.println("Train ticket booked");
	}
}

/**
 * AirBooking IS-A TravelBooking type
 * 
 * @author tirthalp
 * 
 */
class AirBooking implements TravelBooking {
	@Override
	public void bookTicket() {
		System.out.println("Flight ticket booked");
	}
}