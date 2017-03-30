package com.lwei.thread.communication;

public class NotifyThread extends Thread {
	private Object lock;

	public NotifyThread(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service4 service = new Service4();
		service.synNotifyMethod(lock);
	}

}
