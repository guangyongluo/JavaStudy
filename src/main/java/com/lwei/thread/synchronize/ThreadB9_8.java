package com.lwei.thread.synchronize;

public class ThreadB9_8 extends Thread {

	private Service9_8 service;

	public ThreadB9_8(Service9_8 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.methodB();
	}

}
