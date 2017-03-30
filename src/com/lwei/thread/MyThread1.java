package com.lwei.thread;

public class MyThread1 extends Thread {
	private int i;

	public MyThread1(int i) {
		super();
		this.i = i;
	}

	@Override
	public void run() {
		System.out.println(i);
	}
}
