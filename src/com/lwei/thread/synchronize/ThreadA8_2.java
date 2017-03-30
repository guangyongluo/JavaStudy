package com.lwei.thread.synchronize;

public class ThreadA8_2 extends Thread {
	private Service8_2 service;

	public ThreadA8_2(Service8_2 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.setUsernamePassword("a", "aa");

	}

}
