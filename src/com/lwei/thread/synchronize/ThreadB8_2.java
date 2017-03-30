package com.lwei.thread.synchronize;

public class ThreadB8_2 extends Thread {

	private Service8_2 service;

	public ThreadB8_2(Service8_2 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.setUsernamePassword("b", "bb");

	}

}
