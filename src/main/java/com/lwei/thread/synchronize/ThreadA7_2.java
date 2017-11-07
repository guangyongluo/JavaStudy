package com.lwei.thread.synchronize;

public class ThreadA7_2 extends Thread {

	private ObjectService7_2 service;

	public ThreadA7_2(ObjectService7_2 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		super.run();
		service.serviceMethodA();
	}

}
