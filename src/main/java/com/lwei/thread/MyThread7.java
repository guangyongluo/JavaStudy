package com.lwei.thread;

public class MyThread7 extends Thread {
	@Override
	public void run() {
		System.out.println("run=" + this.isAlive());
	}
}
