package com.lwei.thread;

public class MyThread18_2 extends Thread {
	@Override
	public void run() {
		System.out.println("MyThread18_2 run priority=" + this.getPriority());
	}
}
