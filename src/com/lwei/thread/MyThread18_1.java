package com.lwei.thread;

public class MyThread18_1 extends Thread {
	@Override
	public void run() {
		System.out.println("MyThread18_1 run priority=" + this.getPriority());
		MyThread18_2 thread2 = new MyThread18_2();
		thread2.start();
	}
}
