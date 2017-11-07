package com.lwei.thread.lock;

public class MyThread21 extends Thread {

	private Service21 service;

	public MyThread21(Service21 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}

}
