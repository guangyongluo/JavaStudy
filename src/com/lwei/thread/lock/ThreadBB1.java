package com.lwei.thread.lock;

public class ThreadBB1 extends Thread {

	private MyService1 service;

	public ThreadBB1(MyService1 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.methodB();
	}
}
