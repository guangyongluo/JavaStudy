package com.lwei.thread.lock;

public class ThreadA27 extends Thread {

	private Service27 service;

	public ThreadA27(Service27 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.read();
	}

}
