package com.lwei.thread.lock;

public class ThreadA6 extends Thread {

	private MyService6 service;

	public ThreadA6(MyService6 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.awaitA();
	}
}
