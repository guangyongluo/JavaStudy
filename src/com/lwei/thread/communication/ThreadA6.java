package com.lwei.thread.communication;

public class ThreadA6 extends Thread {
	private Object lock;

	public ThreadA6(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service6 service = new Service6();
		service.testMethod(lock);
	}

}
