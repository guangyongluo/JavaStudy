package com.lwei.thread.communication;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {

		Object lock = new Object();

		ThreadA4 a = new ThreadA4(lock);
		a.start();

		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.start();

		synNotifyMethodThread c = new synNotifyMethodThread(lock);
		c.start();

	}

}
