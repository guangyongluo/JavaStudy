package com.lwei.thread.synchronize;

public class ThreadB8_3 extends Thread {

	private Service8_3 service;

	public ThreadB8_3(Service8_3 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.b();

	}

}
