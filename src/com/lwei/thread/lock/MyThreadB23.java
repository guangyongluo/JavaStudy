package com.lwei.thread.lock;

public class MyThreadB23 extends Thread {

	private Service23 service;

	public MyThreadB23(Service23 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.notifyMethod();
	}

}
