package com.lwei.thread.communication;

public class ThreadA5 extends Thread {

	private Object lock;

	public ThreadA5(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service5 service = new Service5();
		service.testMethod(lock);
	}

}
