package com.lwei.thread.lock;

public class MyThread22 extends Thread {

	private Service22 service;

	public MyThread22(Service22 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}

}
