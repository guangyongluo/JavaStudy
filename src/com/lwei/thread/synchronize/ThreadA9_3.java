package com.lwei.thread.synchronize;

public class ThreadA9_3 extends Thread {

	private Service9_3 service;
	private MyObject9_3 object;

	public ThreadA9_3(Service9_3 service, MyObject9_3 object) {
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
