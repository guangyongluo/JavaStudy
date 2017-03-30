package com.lwei.thread.communication;

public class ThreadC6 extends Thread {
	private Object lock;

	public ThreadC6(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service6 service = new Service6();
		service.testMethod(lock);
	}

}
