package com.LearnMutiThreading;

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {

		medicalTest ob = new medicalTest();
		ob.start();
		ob.join();

		DrivingTest ob1 = new DrivingTest();
		ob1.start();
		ob1.join();
		officerTest ob2 = new officerTest();
		ob2.start();

	}

}

class medicalTest extends Thread {

	@Override
	public void run() {

		try {

			System.out.println("medical Test started");

			Thread.sleep(1000);

			System.out.println("medical Test Completed");

		} catch (Exception e) {

			System.out.println(e);
		}
	}

}

class DrivingTest extends Thread {

	@Override
	public void run() {

		try {

			System.out.println("Driving Test started");

			Thread.sleep(1000);

			System.out.println("Driving Test  Completed");

		} catch (Exception e) {

			System.out.println(e);
		}
	}

}

class officerTest extends Thread {

	@Override
	public void run() {

		try {

			System.out.println("officer Test started");

			Thread.sleep(1000);

			System.out.println("officer Test  Completed");

		} catch (Exception e) {

			System.out.println(e);
		}
	}

}
