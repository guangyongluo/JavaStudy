package com.lwei.thread.synchronize;

public class ThreadA3_3 extends Thread {

	private Service3_3 service;

	public ThreadA3_3(Service3_3 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}

}
