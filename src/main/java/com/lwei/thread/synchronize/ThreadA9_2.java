package com.lwei.thread.synchronize;

public class ThreadA9_2 extends Thread {

	private Service9_2 service;
	private MyObject9_2 object;

	public ThreadA9_2(Service9_2 service, MyObject9_2 object) {
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
