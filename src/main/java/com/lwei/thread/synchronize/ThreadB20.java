package com.lwei.thread.synchronize;

public class ThreadB20 extends Thread {
	private Service20 service;

	public ThreadB20(Service20 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.stopMethod();
	}

}
