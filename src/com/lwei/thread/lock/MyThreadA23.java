package com.lwei.thread.lock;

public class MyThreadA23 extends Thread {

	private Service23 service;

	public MyThreadA23(Service23 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.waitMethod();
	}

}
