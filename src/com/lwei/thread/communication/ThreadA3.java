package com.lwei.thread.communication;

public class ThreadA3 extends Thread {

	private Object lock;

	public ThreadA3(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service3 service = new Service3();
		service.testMethod(lock);
	}

}
