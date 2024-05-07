package com.LearnMutiThreading;

class Mythread1 extends Thread {

	ticketBook b;
	int seats;

	public Mythread1(ticketBook b, int seats) {
		this.b = b;
		this.seats = seats;
	}

	@Override
	public void run() {
		b.bookseat(seats);
	}

}

class Mythread2 extends Thread {

	ticketBook b;
	int seats;

	public Mythread2(ticketBook b, int seats) {
		this.b = b;
		this.seats = seats;
	}

	@Override
	public void run() {
		b.bookseat(seats);
	}

}

class ticketBook {

	static int totalSeats = 20;

	synchronized static void bookseat(int seats) {
		if (totalSeats >= seats) {

			System.out.println("seats booked succesfully!");
			totalSeats = totalSeats - seats;
			System.out.println("Remaining seats : " + totalSeats);
		} else {
			System.out.println("seats not  booked unfortunatly All seats are filled!");
			System.out.println("Remaining seats : " + totalSeats);

		}
	}
}

public class staticSynchronizationDemo {

	public static void main(String[] args) {

		ticketBook ob = new ticketBook();
		Mythread1 t1 = new Mythread1(ob, 7);
		t1.start();

		Mythread2 t2 = new Mythread2(ob, 10);

		t2.start();

		ticketBook ob1 = new ticketBook();
		Mythread1 t3 = new Mythread1(ob1, 5);
		t3.start();

		Mythread2 t4 = new Mythread2(ob1, 9);

		t4.start();

	}

}
