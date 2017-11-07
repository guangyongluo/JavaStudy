package com.lwei.thread.lock;

public class ThreadA5 extends Thread {

	private MyService5 service;

	public ThreadA5(MyService5 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.awaitA();
	}
}
