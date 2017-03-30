package com.lwei.thread.synchronize;

public class ThreadA5_2 extends Thread {

	private ObjectService service;

	public ThreadA5_2(ObjectService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		super.run();
		service.serviceMethod();
	}

}
