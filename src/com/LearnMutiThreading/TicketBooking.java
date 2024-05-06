package com.LearnMutiThreading;

public class TicketBooking extends Thread {

	static int seats;

	static mainClass ob;

	@Override
	public void run() {

		ob.bookTicket(seats);

	}

	public static void main(String[] args) {

		ob = new mainClass();

		TicketBooking t1 = new TicketBooking();
		t1.seats = 7;
		t1.start();
		TicketBooking t2 = new TicketBooking();
		t2.seats = 18;
		t2.start();

	}

}

class mainClass {
	int totalSeats = 10;

	synchronized void bookTicket(int seats) {

		if (totalSeats >= seats) {

			System.out.println("seats booked successfully");
			System.out.println("remaining seats : " + (totalSeats - seats));
		} else {
			System.out.println("seats not booked");
			System.out.println("remaining seats : " + (totalSeats - seats));
		}
	}

}
