package com.lwei.thread.synchronize;

public class ThreadA9_6 extends Thread {
	private Service9_6 service;

	public ThreadA9_6(Service9_6 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.printA();
	}
}
