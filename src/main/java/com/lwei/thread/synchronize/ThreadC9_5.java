package com.lwei.thread.synchronize;

public class ThreadC9_5 extends Thread {

	private Service9_5 service;

	public ThreadC9_5(Service9_5 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.printC();
	}
}
