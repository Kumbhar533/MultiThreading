package com.LearnMutiThreading;

public class yieldDemo {

	public static void main(String[] args) {

		thread1 ob = new thread1();

		thread2 ob1 = new thread2();

		thread3 ob2 = new thread3();

		ob.start();
		ob1.start();
		ob2.start();

		// yield method stop the execution current working thread it depends upon thread
		// shechdular
		Thread.yield();

		for (int i = 33; i <= 44; i++) {
			System.out.println(i);
		}

	}

}

class thread1 extends Thread {

	@Override
	public void run() {
		for (char i = 'a'; i <= 'e'; i++) {
			System.out.println(i);
		}
	}
}

class thread2 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
}

class thread3 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(true);
		}
	}
}
