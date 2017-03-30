package com.lwei.thread.synchronize;

public class ThreadB9_6 extends Thread {
	private Service9_6 service;

	public ThreadB9_6(Service9_6 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.printB();
	}
}
