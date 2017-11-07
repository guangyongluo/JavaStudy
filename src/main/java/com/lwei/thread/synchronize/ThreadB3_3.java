package com.lwei.thread.synchronize;

public class ThreadB3_3 extends Thread {
	private Service3_3 service;

	public ThreadB3_3(Service3_3 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}

}
