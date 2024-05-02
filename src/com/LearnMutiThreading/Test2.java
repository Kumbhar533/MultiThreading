package com.LearnMutiThreading;

public class Test2 {

	public static void main(String[] args) {

		// how we change the current Main thread name
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Parent Thread");
		System.out.println(Thread.currentThread().getName());

		fruits on = new fruits();
		on.start();

	}

}

class fruits extends Thread {

	@Override
	public void run() {

		// How we change the running thread name
		String name = Thread.currentThread().getName();
		System.out.println(name);
		Thread.currentThread().setName("child Thread");
		System.out.println(Thread.currentThread().getName());

	}
}
