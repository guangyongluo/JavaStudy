package com.lwei.thread.communication;

public class synNotifyMethodThread extends Thread {
	private Object lock;

	public synNotifyMethodThread(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service4 service = new Service4();
		service.synNotifyMethod(lock);
	}

}
