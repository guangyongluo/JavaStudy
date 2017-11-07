package com.lwei.thread.communication;

public class ThreadA4 extends Thread {
	private Object lock;

	public ThreadA4(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service4 service = new Service4();
		service.testMethod(lock);
	}

}
