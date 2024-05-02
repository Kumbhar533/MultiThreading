package com.LearnMutiThreading;

public class Test {

	public static void main(String[] args) {

		T1 ob = new T1();

		T2 ob1 = new T2();

		T3 ob2 = new T3();

		T4 ob3 = new T4();

		ob.start();
		ob1.start();
		ob2.start();
		ob3.start();

		boolean alive = ob.isAlive();

		System.err.println(alive);

	}

}

class T1 extends Thread {

	@Override
	public void run() {

		System.out.println("Thread 1 executed successfully!!");
	}

}

class T2 extends Thread {

	@Override
	public void run() {

		System.out.println("Thread 2 executed successfully!!");
	}

}

class T3 extends Thread {

	@Override
	public void run() {

		System.out.println("Thread 3 executed successfully!!");
	}

}

class T4 extends Thread {

	@Override
	public void run() {

		System.out.println("Thread 4 executed successfully!!");
	}

}
