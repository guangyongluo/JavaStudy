package com.lwei.thread.lock;

public class ThreadA2 extends Thread {

	private MyService2 service;

	public ThreadA2(MyService2 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.await();
	}
}
