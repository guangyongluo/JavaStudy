package com.lwei.thread.lock;

public class ThreadAA1 extends Thread {

	private MyService1 service;

	public ThreadAA1(MyService1 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.methodA();
	}
}
