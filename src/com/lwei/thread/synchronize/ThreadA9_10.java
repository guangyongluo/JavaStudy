package com.lwei.thread.synchronize;

public class ThreadA9_10 extends Thread {

	private MyService9_10 service;

	public ThreadA9_10(MyService9_10 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}
}
