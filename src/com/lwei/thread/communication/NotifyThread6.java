package com.lwei.thread.communication;

public class NotifyThread6 extends Thread {
	private Object lock;

	public NotifyThread6(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
		}
	}

}
