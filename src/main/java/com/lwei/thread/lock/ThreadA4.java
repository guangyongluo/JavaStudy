package com.lwei.thread.lock;

public class ThreadA4 extends Thread {

	private MyService4 service;

	public ThreadA4(MyService4 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.await();
	}
}
