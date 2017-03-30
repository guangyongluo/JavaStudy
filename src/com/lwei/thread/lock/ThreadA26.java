package com.lwei.thread.lock;

public class ThreadA26 extends Thread {

	private Service26 service;

	public ThreadA26(Service26 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.write();
	}

}
