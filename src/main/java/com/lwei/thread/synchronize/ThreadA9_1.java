package com.lwei.thread.synchronize;

public class ThreadA9_1 extends Thread {

	private Service9_1 service;
	private MyObject9_1 object;

	public ThreadA9_1(Service9_1 service, MyObject9_1 object) {
		super();
		this.service = service;
		this.object = object;
	}

	@Override
	public void run() {
		super.run();
		service.testMethod1(object);
	}

}
