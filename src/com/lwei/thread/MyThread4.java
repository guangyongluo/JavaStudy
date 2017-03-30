package com.lwei.thread;

public class MyThread4 extends Thread {

	private int count = 5;

	@Override
	synchronized public void run() {
		super.run();
		count--;
		System.out.println("from " + this.currentThread().getName() + ".count = " + count);
	}
}
