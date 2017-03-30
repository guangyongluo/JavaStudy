package com.lwei.thread.lock;

public class ThreadB1 extends Thread {

	private MyService1 service;

	public ThreadB1(MyService1 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.methodB();
	}
}
