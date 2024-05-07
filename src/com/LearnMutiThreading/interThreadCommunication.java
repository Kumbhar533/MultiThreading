package com.LearnMutiThreading;

class profitCalculate extends Thread {
	static int profit = 0;

	@Override
	public void run() {

		synchronized (this) {

			for (int i = 1; i <= 10; i++) {

				profit = profit + 100;
			}
			notify();
		}
	}
}

public class interThreadCommunication {

	public static void main(String[] args) throws InterruptedException {

		profitCalculate ob = new profitCalculate();

		ob.start();

		synchronized (ob) {
			ob.wait();
			System.out.println("Total profit : " + ob.profit);
		}
	}
}
