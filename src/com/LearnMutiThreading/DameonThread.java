package com.LearnMutiThreading;

public class DameonThread {

	public static void main(String[] args) {
		CustomThread on = new CustomThread();
		System.out.println("main thread");
		// Set daemon status before starting the thread
		on.setDaemon(true);
		on.start();
	}
}

class CustomThread extends Thread {

	@Override
	public void run() {
		// what is priority of this Thread
		System.out.println(Thread.currentThread().getPriority());

		if (Thread.currentThread().isDaemon()) {
			System.out.println("This Thread is daemon Thread");
		} else {
			System.out.println("This is not a daemon Thread");
		}
	}
}
