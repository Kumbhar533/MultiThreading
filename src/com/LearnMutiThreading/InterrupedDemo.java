package com.LearnMutiThreading;

public class InterrupedDemo extends Thread {

	@Override
	public void run() {

		System.out.println(Thread.currentThread().isInterrupted());
		System.out.println(Thread.currentThread().isInterrupted());// This method does not change the status from true
																	// to false
		System.out.println(Thread.interrupted()); // this method change the status from true false when call twice

		try {

			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
			System.out.println(Thread.interrupted());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		InterrupedDemo ob = new InterrupedDemo();
		ob.start();
		ob.interrupt();

	}

}
