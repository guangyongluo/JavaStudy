package com.lwei.thread.synchronize;

public class ThreadB7_2 extends Thread {
	private ObjectService7_2 service;

	public ThreadB7_2(ObjectService7_2 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		super.run();
		service.serviceMethodB();
	}
}
