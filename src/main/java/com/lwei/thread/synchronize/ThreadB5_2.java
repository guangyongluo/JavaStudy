package com.lwei.thread.synchronize;

public class ThreadB5_2 extends Thread {
	private ObjectService service;

	public ThreadB5_2(ObjectService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		super.run();
		service.serviceMethod();
	}
}
