package com.lwei.thread.synchronize;

public class ThreadA20 extends Thread {
	private Service20 service;

	public ThreadA20(Service20 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.runMethod();
	}
}
