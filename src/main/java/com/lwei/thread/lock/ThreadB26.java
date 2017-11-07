package com.lwei.thread.lock;

public class ThreadB26 extends Thread {

	private Service26 service;

	public ThreadB26(Service26 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.write();
	}
}
