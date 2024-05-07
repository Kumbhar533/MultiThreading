package com.LearnMutiThreading;

public class synchronizedBlock extends Thread {

	static int seats;

	static demosyn ob;

	@Override
	public void run() {

		ob.bookTicket(seats);

	}

	public static void main(String[] args) {

		ob = new demosyn();

		synchronizedBlock t1 = new synchronizedBlock();
		t1.seats = 7;
		t1.start();
		synchronizedBlock t2 = new synchronizedBlock();
		t2.seats = 10;
		t2.start();

	}

}

class demosyn {
	int totalSeats = 10;

	void bookTicket(int seats) {

		System.out.println("hi : " + Thread.currentThread().getName());
		System.out.println("hi : " + Thread.currentThread().getName());
		System.out.println("hi : " + Thread.currentThread().getName());
		System.out.println("hi : " + Thread.currentThread().getName());

		synchronized (this) {
			if (totalSeats >= seats) {

				System.out.println("seats booked successfully");
				totalSeats = totalSeats - seats;
				System.out.println("remaining seats : " + (totalSeats));
			} else {
				System.out.println("seats not booked");

				System.out.println("remaining seats : " + (totalSeats));
			}
		}
		System.out.println("hi : " + Thread.currentThread().getName());
		System.out.println("hi : " + Thread.currentThread().getName());
		System.out.println("hi : " + Thread.currentThread().getName());
		System.out.println("hi : " + Thread.currentThread().getName());

	}

}
