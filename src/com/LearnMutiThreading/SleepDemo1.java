package com.LearnMutiThreading;

public class SleepDemo1 extends Thread {

	// we cannot use throws keyword when we override run method of thread class
	// because run method did not
	// return it does not throws checked exception instead of throws we use try and
	// catch
	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {

			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		SleepDemo1 ob = new SleepDemo1();
		ob.start();

	}

}
