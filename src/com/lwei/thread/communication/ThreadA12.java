package com.lwei.thread.communication;

public class ThreadA12 extends Thread {

	private ThreadB12 b;

	public ThreadA12(ThreadB12 b) {
		super();
		this.b = b;
	}

	@Override
	public void run() {
		try {
			synchronized (b) {
				b.start();
				b.join();// 说明join释放锁了！
				for (int i = 0; i < Integer.MAX_VALUE; i++) {
					String newString = new String();
					Math.random();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
