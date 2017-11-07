package com.lwei.thread.lock;

public class ThreadA1 extends Thread {

	private MyService1 service;

	public ThreadA1(MyService1 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.methodA();
	}
}
