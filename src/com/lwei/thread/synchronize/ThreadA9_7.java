package com.lwei.thread.synchronize;

public class ThreadA9_7 extends Thread {
	private Service9_7 service;

	public ThreadA9_7(Service9_7 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.print("AA");
	}
}
