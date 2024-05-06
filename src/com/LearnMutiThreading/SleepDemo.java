package com.LearnMutiThreading;

import java.util.Stack;

public class SleepDemo {

	// using of sleep method without creating any Thread
	public static void main(String[] args) throws InterruptedException {

		String s = "+-/*";

		int res = 0;

		Stack<String> ob = new Stack();

		String str[] = { "2", "5", "*", "40", "/" };

		for (String el : str) {

			if (!s.contains(el)) {

				ob.push(el);

			} else {

				Integer a = Integer.valueOf(ob.pop());
				Integer b = Integer.valueOf(ob.pop());

				switch (el) {

				case "+": {

					res = a + b;

					break;
				}
				case "/": {

					res = a / b;

					break;
				}

				case "*": {

					res = a * b;

					break;
				}
				case "-": {

					res = a - b;

					break;
				}
				default: {
					throw new RuntimeException("somthing went wrong!");
				}

				}
				ob.push(String.valueOf(res));
			}

		}
		Thread.sleep(1000);
		System.out.println(ob);

	}

}
